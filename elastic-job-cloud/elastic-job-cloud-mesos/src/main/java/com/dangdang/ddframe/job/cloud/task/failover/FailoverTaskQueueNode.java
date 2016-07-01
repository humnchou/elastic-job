/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package com.dangdang.ddframe.job.cloud.task.failover;

import com.dangdang.ddframe.job.cloud.task.TaskNode;
import lombok.RequiredArgsConstructor;

/**
 * 待失效转移任务队列节点路径.
 *
 * @author zhangliang
 */
@RequiredArgsConstructor
public final class FailoverTaskQueueNode {
    
    static final String ROOT = TaskNode.ROOT + "/failover";
    
    private static final String FAILOVER_TASK = ROOT + "/%s";
    
    static String getFailoverNodePath(final String taskId) {
        return String.format(FAILOVER_TASK, taskId);
    }
}