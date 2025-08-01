/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.pipedream.api.resources.accounts.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.pipedream.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = CreateAccountOpts.Builder.class)
public final class CreateAccountOpts {
    private final Optional<String> appId;

    private final Optional<String> externalUserId;

    private final Optional<String> oauthAppId;

    private final String appSlug;

    private final String cfmapJson;

    private final String connectToken;

    private final Optional<String> name;

    private final Map<String, Object> additionalProperties;

    private CreateAccountOpts(
            Optional<String> appId,
            Optional<String> externalUserId,
            Optional<String> oauthAppId,
            String appSlug,
            String cfmapJson,
            String connectToken,
            Optional<String> name,
            Map<String, Object> additionalProperties) {
        this.appId = appId;
        this.externalUserId = externalUserId;
        this.oauthAppId = oauthAppId;
        this.appSlug = appSlug;
        this.cfmapJson = cfmapJson;
        this.connectToken = connectToken;
        this.name = name;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The app slug or ID to filter accounts by.
     */
    @JsonProperty("app_id")
    public Optional<String> getAppId() {
        return appId;
    }

    @JsonProperty("external_user_id")
    public Optional<String> getExternalUserId() {
        return externalUserId;
    }

    /**
     * @return The OAuth app ID to filter by, if applicable
     */
    @JsonProperty("oauth_app_id")
    public Optional<String> getOauthAppId() {
        return oauthAppId;
    }

    /**
     * @return The app slug for the account
     */
    @JsonProperty("app_slug")
    public String getAppSlug() {
        return appSlug;
    }

    /**
     * @return JSON string containing the custom fields mapping
     */
    @JsonProperty("cfmap_json")
    public String getCfmapJson() {
        return cfmapJson;
    }

    /**
     * @return The connect token for authentication
     */
    @JsonProperty("connect_token")
    public String getConnectToken() {
        return connectToken;
    }

    /**
     * @return Optional name for the account
     */
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CreateAccountOpts && equalTo((CreateAccountOpts) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CreateAccountOpts other) {
        return appId.equals(other.appId)
                && externalUserId.equals(other.externalUserId)
                && oauthAppId.equals(other.oauthAppId)
                && appSlug.equals(other.appSlug)
                && cfmapJson.equals(other.cfmapJson)
                && connectToken.equals(other.connectToken)
                && name.equals(other.name);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.appId,
                this.externalUserId,
                this.oauthAppId,
                this.appSlug,
                this.cfmapJson,
                this.connectToken,
                this.name);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static AppSlugStage builder() {
        return new Builder();
    }

    public interface AppSlugStage {
        /**
         * <p>The app slug for the account</p>
         */
        CfmapJsonStage appSlug(@NotNull String appSlug);

        Builder from(CreateAccountOpts other);
    }

    public interface CfmapJsonStage {
        /**
         * <p>JSON string containing the custom fields mapping</p>
         */
        ConnectTokenStage cfmapJson(@NotNull String cfmapJson);
    }

    public interface ConnectTokenStage {
        /**
         * <p>The connect token for authentication</p>
         */
        _FinalStage connectToken(@NotNull String connectToken);
    }

    public interface _FinalStage {
        CreateAccountOpts build();

        /**
         * <p>The app slug or ID to filter accounts by.</p>
         */
        _FinalStage appId(Optional<String> appId);

        _FinalStage appId(String appId);

        _FinalStage externalUserId(Optional<String> externalUserId);

        _FinalStage externalUserId(String externalUserId);

        /**
         * <p>The OAuth app ID to filter by, if applicable</p>
         */
        _FinalStage oauthAppId(Optional<String> oauthAppId);

        _FinalStage oauthAppId(String oauthAppId);

        /**
         * <p>Optional name for the account</p>
         */
        _FinalStage name(Optional<String> name);

        _FinalStage name(String name);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements AppSlugStage, CfmapJsonStage, ConnectTokenStage, _FinalStage {
        private String appSlug;

        private String cfmapJson;

        private String connectToken;

        private Optional<String> name = Optional.empty();

        private Optional<String> oauthAppId = Optional.empty();

        private Optional<String> externalUserId = Optional.empty();

        private Optional<String> appId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(CreateAccountOpts other) {
            appId(other.getAppId());
            externalUserId(other.getExternalUserId());
            oauthAppId(other.getOauthAppId());
            appSlug(other.getAppSlug());
            cfmapJson(other.getCfmapJson());
            connectToken(other.getConnectToken());
            name(other.getName());
            return this;
        }

        /**
         * <p>The app slug for the account</p>
         * <p>The app slug for the account</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("app_slug")
        public CfmapJsonStage appSlug(@NotNull String appSlug) {
            this.appSlug = Objects.requireNonNull(appSlug, "appSlug must not be null");
            return this;
        }

        /**
         * <p>JSON string containing the custom fields mapping</p>
         * <p>JSON string containing the custom fields mapping</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("cfmap_json")
        public ConnectTokenStage cfmapJson(@NotNull String cfmapJson) {
            this.cfmapJson = Objects.requireNonNull(cfmapJson, "cfmapJson must not be null");
            return this;
        }

        /**
         * <p>The connect token for authentication</p>
         * <p>The connect token for authentication</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("connect_token")
        public _FinalStage connectToken(@NotNull String connectToken) {
            this.connectToken = Objects.requireNonNull(connectToken, "connectToken must not be null");
            return this;
        }

        /**
         * <p>Optional name for the account</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage name(String name) {
            this.name = Optional.ofNullable(name);
            return this;
        }

        /**
         * <p>Optional name for the account</p>
         */
        @java.lang.Override
        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public _FinalStage name(Optional<String> name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The OAuth app ID to filter by, if applicable</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage oauthAppId(String oauthAppId) {
            this.oauthAppId = Optional.ofNullable(oauthAppId);
            return this;
        }

        /**
         * <p>The OAuth app ID to filter by, if applicable</p>
         */
        @java.lang.Override
        @JsonSetter(value = "oauth_app_id", nulls = Nulls.SKIP)
        public _FinalStage oauthAppId(Optional<String> oauthAppId) {
            this.oauthAppId = oauthAppId;
            return this;
        }

        @java.lang.Override
        public _FinalStage externalUserId(String externalUserId) {
            this.externalUserId = Optional.ofNullable(externalUserId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "external_user_id", nulls = Nulls.SKIP)
        public _FinalStage externalUserId(Optional<String> externalUserId) {
            this.externalUserId = externalUserId;
            return this;
        }

        /**
         * <p>The app slug or ID to filter accounts by.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage appId(String appId) {
            this.appId = Optional.ofNullable(appId);
            return this;
        }

        /**
         * <p>The app slug or ID to filter accounts by.</p>
         */
        @java.lang.Override
        @JsonSetter(value = "app_id", nulls = Nulls.SKIP)
        public _FinalStage appId(Optional<String> appId) {
            this.appId = appId;
            return this;
        }

        @java.lang.Override
        public CreateAccountOpts build() {
            return new CreateAccountOpts(
                    appId, externalUserId, oauthAppId, appSlug, cfmapJson, connectToken, name, additionalProperties);
        }
    }
}
