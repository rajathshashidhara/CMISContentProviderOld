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

import com.sun.star.beans.Property;
import com.sun.star.beans.PropertyAttribute;
import com.sun.star.beans.UnknownPropertyException;
import com.sun.star.uno.XComponentContext;
import com.sun.star.lib.uno.helper.WeakBase;
import com.sun.star.uno.Type;


public final class CMISXPropertySetInfo extends WeakBase
   implements com.sun.star.beans.XPropertySetInfo
{
    private final XComponentContext m_xContext;
    private static final String m_implementationName = CMISXPropertySetInfo.class.getName();
    private Property[] available_properties;
    public CMISXPropertySetInfo( XComponentContext context )
    {
        m_xContext = context;
        available_properties = new Property[8];
        
        available_properties[0].Name = "Title";
        available_properties[0].Type = Type.STRING;
        
        available_properties[1].Name = "IsFolder";
        available_properties[1].Type = Type.BOOLEAN;
        available_properties[1].Attributes = PropertyAttribute.READONLY;
        
        available_properties[2].Name = "IsDocument";
        available_properties[2].Type = Type.BOOLEAN;
        available_properties[2].Attributes = PropertyAttribute.READONLY;
        
        available_properties[3].Name = "DateCreated";
        available_properties[3].Type = Type.ANY;
        available_properties[3].Attributes = PropertyAttribute.READONLY;
        
        available_properties[4].Name = "DateModified";
        available_properties[4].Type = Type.ANY;
        available_properties[4].Attributes = PropertyAttribute.READONLY;
        
        available_properties[5].Name = "Size";
        available_properties[5].Type = Type.UNSIGNED_LONG;
        available_properties[5].Attributes = PropertyAttribute.READONLY;
        
        available_properties[6].Name = "MediaType";
        available_properties[6].Type = Type.STRING;
        available_properties[6].Attributes = PropertyAttribute.READONLY;
        
        available_properties[7].Name = "ContentType";
        available_properties[7].Type = Type.STRING;
        available_properties[7].Attributes = PropertyAttribute.READONLY;
    };

    // com.sun.star.beans.XPropertySetInfo:
    public com.sun.star.beans.Property[] getProperties()
    {
        // TODO: Exchange the default return implementation for "getProperties" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return available_properties;
    }

    public com.sun.star.beans.Property getPropertyByName(String aName) throws com.sun.star.beans.UnknownPropertyException
    {
        // TODO: Exchange the default return implementation for "getPropertyByName" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        
        for(Property p:available_properties)
            if(p.Name.equalsIgnoreCase(aName))
                return p;
        
        throw new UnknownPropertyException(aName+" Not known");
    }

    public boolean hasPropertyByName(String Name)
    {
        // TODO: Exchange the default return implementation for "hasPropertyByName" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        for(Property p:available_properties)
            if(p.Name.equalsIgnoreCase(Name))
                return true;
        
        return false;
    }

}
