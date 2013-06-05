/**************************************************************
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 *************************************************************/
package org.apache.aoo.ucp.cmisucp.cmis.ucp.unoobjects;

import com.sun.star.uno.XComponentContext;
import com.sun.star.lib.uno.helper.WeakBase;


public final class CMISContentIdentifier extends WeakBase
   implements com.sun.star.ucb.XContentIdentifier
{
    private final XComponentContext m_xContext;
    private static final String m_implementationName = CMISContentIdentifier.class.getName();
    private String identifier;
    private final String scheme="cmis";
    public CMISContentIdentifier( XComponentContext context, String contentID )
    {
        m_xContext = context;
        identifier = contentID;
    };

    // com.sun.star.ucb.XContentIdentifier:
    public String getContentIdentifier()
    {
        // TODO: Exchange the default return implementation for "getContentIdentifier" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return identifier;
    }

    public String getContentProviderScheme()
    {
        // TODO: Exchange the default return implementation for "getContentProviderScheme" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return scheme;
    }

}
