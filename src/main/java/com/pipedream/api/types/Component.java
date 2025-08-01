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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = Component.Builder.class)
public final class Component {
    private final String key;

    private final String name;

    private final String version;

    private final List<ConfigurableProp> configurableProps;

    private final Optional<String> description;

    private final Optional<String> componentType;

    private final Optional<ComponentStash> stash;

    private final Map<String, Object> additionalProperties;

    private Component(
            String key,
            String name,
            String version,
            List<ConfigurableProp> configurableProps,
            Optional<String> description,
            Optional<String> componentType,
            Optional<ComponentStash> stash,
            Map<String, Object> additionalProperties) {
        this.key = key;
        this.name = name;
        this.version = version;
        this.configurableProps = configurableProps;
        this.description = description;
        this.componentType = componentType;
        this.stash = stash;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The key that uniquely identifies the component.
     */
    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    /**
     * @return The human-readable name of the component, e.g. 'GitLab: List Commits'
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * @return The latest version of the component, in SemVer format.
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("configurable_props")
    public List<ConfigurableProp> getConfigurableProps() {
        return configurableProps;
    }

    /**
     * @return A description of the component
     */
    @JsonProperty("description")
    public Optional<String> getDescription() {
        return description;
    }

    /**
     * @return The type of component (trigger or action)
     */
    @JsonProperty("component_type")
    public Optional<String> getComponentType() {
        return componentType;
    }

    /**
     * @return Indicates if a File Stash ID is optional or required to run the component
     */
    @JsonProperty("stash")
    public Optional<ComponentStash> getStash() {
        return stash;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Component && equalTo((Component) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Component other) {
        return key.equals(other.key)
                && name.equals(other.name)
                && version.equals(other.version)
                && configurableProps.equals(other.configurableProps)
                && description.equals(other.description)
                && componentType.equals(other.componentType)
                && stash.equals(other.stash);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.key,
                this.name,
                this.version,
                this.configurableProps,
                this.description,
                this.componentType,
                this.stash);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static KeyStage builder() {
        return new Builder();
    }

    public interface KeyStage {
        /**
         * <p>The key that uniquely identifies the component.</p>
         */
        NameStage key(@NotNull String key);

        Builder from(Component other);
    }

    public interface NameStage {
        /**
         * <p>The human-readable name of the component, e.g. 'GitLab: List Commits'</p>
         */
        VersionStage name(@NotNull String name);
    }

    public interface VersionStage {
        /**
         * <p>The latest version of the component, in SemVer format.</p>
         */
        _FinalStage version(@NotNull String version);
    }

    public interface _FinalStage {
        Component build();

        _FinalStage configurableProps(List<ConfigurableProp> configurableProps);

        _FinalStage addConfigurableProps(ConfigurableProp configurableProps);

        _FinalStage addAllConfigurableProps(List<ConfigurableProp> configurableProps);

        /**
         * <p>A description of the component</p>
         */
        _FinalStage description(Optional<String> description);

        _FinalStage description(String description);

        /**
         * <p>The type of component (trigger or action)</p>
         */
        _FinalStage componentType(Optional<String> componentType);

        _FinalStage componentType(String componentType);

        /**
         * <p>Indicates if a File Stash ID is optional or required to run the component</p>
         */
        _FinalStage stash(Optional<ComponentStash> stash);

        _FinalStage stash(ComponentStash stash);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements KeyStage, NameStage, VersionStage, _FinalStage {
        private String key;

        private String name;

        private String version;

        private Optional<ComponentStash> stash = Optional.empty();

        private Optional<String> componentType = Optional.empty();

        private Optional<String> description = Optional.empty();

        private List<ConfigurableProp> configurableProps = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(Component other) {
            key(other.getKey());
            name(other.getName());
            version(other.getVersion());
            configurableProps(other.getConfigurableProps());
            description(other.getDescription());
            componentType(other.getComponentType());
            stash(other.getStash());
            return this;
        }

        /**
         * <p>The key that uniquely identifies the component.</p>
         * <p>The key that uniquely identifies the component.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("key")
        public NameStage key(@NotNull String key) {
            this.key = Objects.requireNonNull(key, "key must not be null");
            return this;
        }

        /**
         * <p>The human-readable name of the component, e.g. 'GitLab: List Commits'</p>
         * <p>The human-readable name of the component, e.g. 'GitLab: List Commits'</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("name")
        public VersionStage name(@NotNull String name) {
            this.name = Objects.requireNonNull(name, "name must not be null");
            return this;
        }

        /**
         * <p>The latest version of the component, in SemVer format.</p>
         * <p>The latest version of the component, in SemVer format.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("version")
        public _FinalStage version(@NotNull String version) {
            this.version = Objects.requireNonNull(version, "version must not be null");
            return this;
        }

        /**
         * <p>Indicates if a File Stash ID is optional or required to run the component</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage stash(ComponentStash stash) {
            this.stash = Optional.ofNullable(stash);
            return this;
        }

        /**
         * <p>Indicates if a File Stash ID is optional or required to run the component</p>
         */
        @java.lang.Override
        @JsonSetter(value = "stash", nulls = Nulls.SKIP)
        public _FinalStage stash(Optional<ComponentStash> stash) {
            this.stash = stash;
            return this;
        }

        /**
         * <p>The type of component (trigger or action)</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage componentType(String componentType) {
            this.componentType = Optional.ofNullable(componentType);
            return this;
        }

        /**
         * <p>The type of component (trigger or action)</p>
         */
        @java.lang.Override
        @JsonSetter(value = "component_type", nulls = Nulls.SKIP)
        public _FinalStage componentType(Optional<String> componentType) {
            this.componentType = componentType;
            return this;
        }

        /**
         * <p>A description of the component</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage description(String description) {
            this.description = Optional.ofNullable(description);
            return this;
        }

        /**
         * <p>A description of the component</p>
         */
        @java.lang.Override
        @JsonSetter(value = "description", nulls = Nulls.SKIP)
        public _FinalStage description(Optional<String> description) {
            this.description = description;
            return this;
        }

        @java.lang.Override
        public _FinalStage addAllConfigurableProps(List<ConfigurableProp> configurableProps) {
            this.configurableProps.addAll(configurableProps);
            return this;
        }

        @java.lang.Override
        public _FinalStage addConfigurableProps(ConfigurableProp configurableProps) {
            this.configurableProps.add(configurableProps);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "configurable_props", nulls = Nulls.SKIP)
        public _FinalStage configurableProps(List<ConfigurableProp> configurableProps) {
            this.configurableProps.clear();
            this.configurableProps.addAll(configurableProps);
            return this;
        }

        @java.lang.Override
        public Component build() {
            return new Component(
                    key, name, version, configurableProps, description, componentType, stash, additionalProperties);
        }
    }
}
