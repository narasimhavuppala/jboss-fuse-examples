/*
 * #%L
 * GarethHealy :: JBoss Fuse Examples :: MBeans Expose
 * %%
 * Copyright (C) 2013 - 2016 Gareth Healy
 * %%
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
 * #L%
 */
package com.garethahealy.mbeans.expose;

import java.util.Random;

import com.garethahealy.mbeans.expose.management.PoolCounterMBean;

public class PoolCounter implements PoolCounterMBean {

    private int count;
    private Random random = new Random();

    public PoolCounter() {
        this.count = random.nextInt();
    }

    public int poolCount() {
        return count;
    }
}
