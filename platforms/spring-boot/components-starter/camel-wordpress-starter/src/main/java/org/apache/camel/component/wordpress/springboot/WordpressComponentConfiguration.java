/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.wordpress.springboot;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.component.wordpress.api.model.SearchCriteria;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * Integrates Camel with Wordpress.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.wordpress")
public class WordpressComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Wordpress component configuration
     */
    private WordpressComponentConfigurationNestedConfiguration configuration;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public WordpressComponentConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            WordpressComponentConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }

    public static class WordpressComponentConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.wordpress.WordpressComponentConfiguration.class;
        private String url;
        private String apiVersion = "2";
        private String password;
        private String user;
        private Integer id;
        private Boolean force = false;
        @NestedConfigurationProperty
        private SearchCriteria searchCriteria;
        private Map criteriaProperties;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getApiVersion() {
            return apiVersion;
        }

        public void setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Boolean getForce() {
            return force;
        }

        public void setForce(Boolean force) {
            this.force = force;
        }

        public SearchCriteria getSearchCriteria() {
            return searchCriteria;
        }

        public void setSearchCriteria(SearchCriteria searchCriteria) {
            this.searchCriteria = searchCriteria;
        }

        public Map getCriteriaProperties() {
            return criteriaProperties;
        }

        public void setCriteriaProperties(Map criteriaProperties) {
            this.criteriaProperties = criteriaProperties;
        }
    }
}