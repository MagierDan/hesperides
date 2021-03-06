/*
 *
 *  * This file is part of the Hesperides distribution.
 *  * (https://github.com/voyages-sncf-technologies/hesperides)
 *  * Copyright (c) 2016 VSCT.
 *  *
 *  * Hesperides is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as
 *  * published by the Free Software Foundation, version 3.
 *  *
 *  * Hesperides is distributed in the hope that it will be useful, but
 *  * WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 *  * General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 *
 */

package com.vsct.dt.hesperides.indexation.search;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Value Object representing the response of an elasticsearch for application
 * Created by william_montaz on 29/10/2014.
 */
public final class ApplicationSearchResponse {
    /**
     * Name of application.
     */
    private final String name;

    /**
     * Version of application.
     */
    private final String version;

    /**
     * Platform name.
     */
    private final String platform;

    @JsonCreator
    public ApplicationSearchResponse(
            @JsonProperty("application_name") final String name,
            @JsonProperty("application_version") final String version,
            @JsonProperty("platform_name") final String platform) {
        this.name = name;
        this.version = version;
        this.platform = platform;
    }

    @JsonProperty(value = "application_name")
    public String getName() {
        return name;
    }

    @JsonProperty(value = "application_version")
    public String getVersion() {
        return version;
    }

    @JsonProperty(value = "platform_name")
    public String getPlatform() {
        return platform;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final ApplicationSearchResponse that = (ApplicationSearchResponse) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (version != null ? !version.equals(that.version) : that.version != null) return false;
        return platform != null ? platform.equals(that.platform) : that.platform == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (platform != null ? platform.hashCode() : 0);
        return result;
    }
}
