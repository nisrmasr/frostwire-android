/*
 * Created by Angel Leon (@gubatron), Alden Torres (aldenml)
 * Copyright (c) 2011, 2012, 2013, FrostWire(R). All rights reserved.
 
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
 */

package com.frostwire.android.tests;

import android.test.ApplicationTestCase;
import android.test.mock.MockApplication;

import com.frostwire.android.core.ConfigurationManager;

/**
 * 
 * @author gubatron
 * @author aldenml
 *
 */
public class AbstractApplicationTest extends ApplicationTestCase<MockApplication> {

    public AbstractApplicationTest() {
        this(MockApplication.class);
    }

    public AbstractApplicationTest(Class<MockApplication> applicationClass) {
        super(applicationClass);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        ConfigurationManager.create(getApplication());
    }
}
