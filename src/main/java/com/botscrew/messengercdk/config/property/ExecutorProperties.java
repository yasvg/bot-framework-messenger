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

package com.botscrew.messengercdk.config.property;

/**
 * Abstraction for executor properties
 * Describes 4 properties:
 *  - core pool size
 *  - max pool size
 *  - queue capacity
 *  - keep alive in seconds
 *
 *  @see HandlerTaskExecutorProperties
 *  @see SenderTaskExecutorProperties
 */
public interface ExecutorProperties {

    Integer getCorePoolSize();

    Integer getMaxPoolSize();

    Integer getQueueCapacity();

    Integer getKeepAliveSeconds();
}
