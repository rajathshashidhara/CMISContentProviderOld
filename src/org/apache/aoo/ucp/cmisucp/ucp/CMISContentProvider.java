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
package org.apache.aoo.ucp.cmisucp.ucp;

import org.apache.aoo.ucp.cmisucp.cmis.ucp.unoobjects.CMISContent;
import org.apache.aoo.ucp.cmisucp.cmis.ucp.unoobjects.CMISContentIdentifier;
import com.sun.star.uno.XComponentContext;
import com.sun.star.lib.uno.helper.Factory;
import com.sun.star.lang.XSingleComponentFactory;
import com.sun.star.registry.XRegistryKey;
import com.sun.star.lib.uno.helper.WeakBase;
import com.sun.star.ucb.XContent;
import com.sun.star.ucb.XContentIdentifier;
import java.util.HashMap;
import java.util.Map;


public final class CMISContentProvider extends WeakBase
   implements com.sun.star.ucb.XParameterizedContentProvider,
              com.sun.star.lang.XServiceInfo,
              com.sun.star.ucb.XContentIdentifierFactory,
              com.sun.star.ucb.XContentProvider
{
    private final XComponentContext m_xContext;
    private static final String m_implementationName = CMISContentProvider.class.getName();
    private static final String[] m_serviceNames = {
        "com.sun.star.ucb.ContentProvider" };
    private Map<String,XContent> cachedContent;

    public CMISContentProvider( XComponentContext context )
    {
        m_xContext = context;
        cachedContent = new HashMap<String,XContent>();
    };

    public static XSingleComponentFactory __getComponentFactory( String sImplementationName ) {
        XSingleComponentFactory xFactory = null;

        if ( sImplementationName.equals( m_implementationName ) )
            xFactory = Factory.createComponentFactory(CMISContentProvider.class, m_serviceNames);
        
        return xFactory;
    }

    public static boolean __writeRegistryServiceInfo( XRegistryKey xRegistryKey ) {
        return Factory.writeRegistryServiceInfo(m_implementationName,
                                                m_serviceNames,
                                                xRegistryKey);
    }

    // com.sun.star.ucb.XParameterizedContentProvider:
    public com.sun.star.ucb.XContentProvider registerInstance(String Template, String Arguments, boolean ReplaceExisting) throws com.sun.star.lang.IllegalArgumentException
    {
        // TODO: Exchange the default return implementation for "registerInstance" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return null;
    }

    public com.sun.star.ucb.XContentProvider deregisterInstance(String Template, String Arguments) throws com.sun.star.lang.IllegalArgumentException
    {
        // TODO: Exchange the default return implementation for "deregisterInstance" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return null;
    }

    // com.sun.star.lang.XServiceInfo:
    public String getImplementationName() {
         return m_implementationName;
    }

    public boolean supportsService( String sService ) {
        int len = m_serviceNames.length;

        for( int i=0; i < len; i++) {
            if (sService.equals(m_serviceNames[i]))
                return true;
        }
        return false;
    }

    public String[] getSupportedServiceNames() {
        return m_serviceNames;
    }

    // com.sun.star.ucb.XContentIdentifierFactory:
    public com.sun.star.ucb.XContentIdentifier createContentIdentifier(String ContentId)
    {
        // TODO: Exchange the default return implementation for "createContentIdentifier" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        XContentIdentifier xContentIdentifier = new CMISContentIdentifier(m_xContext, ContentId);
        return xContentIdentifier;
    }

    // com.sun.star.ucb.XContentProvider:
    public com.sun.star.ucb.XContent queryContent(com.sun.star.ucb.XContentIdentifier Identifier) throws com.sun.star.ucb.IllegalIdentifierException
    {
        // TODO: Exchange the default return implementation for "queryContent" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        
        if(cachedContent.containsKey(Identifier.getContentIdentifier()))
            return cachedContent.get(Identifier.getContentIdentifier());
        
        if(Identifier.getContentProviderScheme().equalsIgnoreCase("cmis"))
            if(Identifier.getContentIdentifier().startsWith("cmis://"))
            {
                XContent xContent = new CMISContent(m_xContext, Identifier);
                cachedContent.put(Identifier.getContentIdentifier(), xContent);
                return xContent;
            }
 
        return null;
    }

    public int compareContentIds(com.sun.star.ucb.XContentIdentifier Id1, com.sun.star.ucb.XContentIdentifier Id2)
    {
        // TODO: Exchange the default return implementation for "compareContentIds" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return 0;
    }

}
