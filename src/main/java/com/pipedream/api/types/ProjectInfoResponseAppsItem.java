/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.pipedream.api.types;

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
@JsonDeserialize(builder = ProjectInfoResponseAppsItem.Builder.class)
public final class ProjectInfoResponseAppsItem {
    private final Optional<String> id;

    private final String nameSlug;

    private final Map<String, Object> additionalProperties;

    private ProjectInfoResponseAppsItem(
            Optional<String> id, String nameSlug, Map<String, Object> additionalProperties) {
        this.id = id;
        this.nameSlug = nameSlug;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return ID of the app. Only applies for OAuth apps.
     */
    @JsonProperty("id")
    public Optional<String> getId() {
        return id;
    }

    /**
     * @return The name slug of the target app
     */
    @JsonProperty("name_slug")
    public String getNameSlug() {
        return nameSlug;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ProjectInfoResponseAppsItem && equalTo((ProjectInfoResponseAppsItem) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ProjectInfoResponseAppsItem other) {
        return id.equals(other.id) && nameSlug.equals(other.nameSlug);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.id, this.nameSlug);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static NameSlugStage builder() {
        return new Builder();
    }

    public interface NameSlugStage {
        /**
         * <p>The name slug of the target app</p>
         */
        _FinalStage nameSlug(@NotNull String nameSlug);

        Builder from(ProjectInfoResponseAppsItem other);
    }

    public interface _FinalStage {
        ProjectInfoResponseAppsItem build();

        /**
         * <p>ID of the app. Only applies for OAuth apps.</p>
         */
        _FinalStage id(Optional<String> id);

        _FinalStage id(String id);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements NameSlugStage, _FinalStage {
        private String nameSlug;

        private Optional<String> id = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ProjectInfoResponseAppsItem other) {
            id(other.getId());
            nameSlug(other.getNameSlug());
            return this;
        }

        /**
         * <p>The name slug of the target app</p>
         * <p>The name slug of the target app</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("name_slug")
        public _FinalStage nameSlug(@NotNull String nameSlug) {
            this.nameSlug = Objects.requireNonNull(nameSlug, "nameSlug must not be null");
            return this;
        }

        /**
         * <p>ID of the app. Only applies for OAuth apps.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage id(String id) {
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * <p>ID of the app. Only applies for OAuth apps.</p>
         */
        @java.lang.Override
        @JsonSetter(value = "id", nulls = Nulls.SKIP)
        public _FinalStage id(Optional<String> id) {
            this.id = id;
            return this;
        }

        @java.lang.Override
        public ProjectInfoResponseAppsItem build() {
            return new ProjectInfoResponseAppsItem(id, nameSlug, additionalProperties);
        }
    }
}
