package com.pipedream.api;

import com.pipedream.api.core.ClientOptions;
import com.pipedream.api.core.Environment;
import java.util.Optional;
import org.immutables.value.Value;

@Value
public class PipedreamClient extends BaseClient {
    public PipedreamClient(final ClientOptions clientOptions) {
        super(clientOptions);
    }

    public static PipedreamClientBuilder builder() {
        return new PipedreamClientBuilder()
                .clientId(System.getenv("PIPEDREAM_CLIENT_ID"))
                .clientSecret(System.getenv("PIPEDREAM_CLIENT_SECRET"))
                .environment(Environment.PROD)
                .projectEnvironment(System.getenv("PIPEDREAM_PROJECT_ENVIRONMENT"))
                .projectId(System.getenv("PIPEDREAM_PROJECT_ID"));
    }

    /**
     * Returns an access token that can be used to authenticate API requests
     *
     * @return the access token string (if available)
     */
    public Optional<String> rawAccessToken() {
        final String authorizationHeader = this.clientOptions.headers(null).get("Authorization");

        // The header might not be defined, so we wrap it as an Optional to
        // further process it. The processing consists of removing the `Bearer`
        // or `Basic` prefix from the header value.
        return Optional.ofNullable(authorizationHeader).map(h -> h.replaceFirst("^.*?\\s+", ""));
    }
}
