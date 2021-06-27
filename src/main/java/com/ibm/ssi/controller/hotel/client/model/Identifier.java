/*
 * Copyright 2021 Bundesreplublik Deutschland
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ibm.ssi.controller.hotel.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Identifier {

    @JsonProperty("schema_id")
    private String schemaId;

    @JsonProperty("cred_def_id")
    private String credDefId;

    @JsonProperty("rev_reg_id")
    private String revRegId;

    @JsonProperty("timestamp")
    private Integer timestamp;

    public Identifier() {}

    public String getSchemaId() {
        return schemaId;
    }

    public String getCredDefId() {
        return credDefId;
    }

    public String getRevRegId() {
        return revRegId;
    }

    public Integer getTimestamp() {
        return timestamp;
    }
}
