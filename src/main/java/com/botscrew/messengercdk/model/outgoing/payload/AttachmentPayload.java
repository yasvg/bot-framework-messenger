/*
 * Copyright 2018 BotsCrew
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

package com.botscrew.messengercdk.model.outgoing.payload;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AttachmentPayload {
    @JsonProperty("attachment_id")
    private Long attachmentId;
    @JsonProperty("is_reusable")
    private Boolean isReusable;
    private String url;

    public AttachmentPayload(Long attachmentId) {
        this.attachmentId = attachmentId;
    }

    public AttachmentPayload(String url) {
        this.url = url;
    }

    public AttachmentPayload(String url, Boolean isReusable) {
        this.isReusable = isReusable;
        this.url = url;
    }
}
