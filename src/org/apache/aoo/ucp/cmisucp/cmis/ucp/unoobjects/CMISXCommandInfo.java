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
import com.sun.star.ucb.CommandInfo;
import com.sun.star.ucb.UnsupportedCommandException;
import com.sun.star.uno.Type;


public final class CMISXCommandInfo extends WeakBase
   implements com.sun.star.ucb.XCommandInfo
{
    private final XComponentContext m_xContext;
    private static final String m_implementationName = CMISXCommandInfo.class.getName();
    private com.sun.star.ucb.CommandInfo supportedCommands[];

    public CMISXCommandInfo( XComponentContext context )
    {
        m_xContext = context;
        supportedCommands = new CommandInfo[8];
        
        supportedCommands[0].Name = "getPropertyValues";
        //supportedCommands[0].Handle = 0;
        supportedCommands[0].ArgType = Type.ANY;
        
        supportedCommands[1].Name = "setProperyValues";
        supportedCommands[1].ArgType = Type.ANY;
        
        supportedCommands[2].Name = "getCommandInfo";
        supportedCommands[2].ArgType = Type.VOID;
        
        supportedCommands[3].Name = "getPropertySetInfo";
        supportedCommands[3].ArgType = Type.VOID;
        
        supportedCommands[4].Name = "open";
        supportedCommands[4].ArgType = Type.ANY;
        
        supportedCommands[5].Name = "delete";
        supportedCommands[5].ArgType = Type.BOOLEAN;
        
        supportedCommands[6].Name = "insert";
        supportedCommands[6].ArgType = Type.ANY;
        
        supportedCommands[7].Name = "transfer";
        supportedCommands[7].ArgType = Type.ANY;
    };

    // com.sun.star.ucb.XCommandInfo:
    public com.sun.star.ucb.CommandInfo[] getCommands()
    {
        // TODO: Exchange the default return implementation for "getCommands" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return supportedCommands;
    }

    public com.sun.star.ucb.CommandInfo getCommandInfoByName(String Name) throws com.sun.star.ucb.UnsupportedCommandException
    {
        // TODO: Exchange the default return implementation for "getCommandInfoByName" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        for(CommandInfo c:supportedCommands)
        {
            if(c.Name.equalsIgnoreCase(Name))
                return c;
        }
        throw new UnsupportedCommandException(Name+" Command Not Supported");
    }

    public com.sun.star.ucb.CommandInfo getCommandInfoByHandle(int Handle) throws com.sun.star.ucb.UnsupportedCommandException
    {
        // TODO: Exchange the default return implementation for "getCommandInfoByHandle" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return new com.sun.star.ucb.CommandInfo();
    }

    public boolean hasCommandByName(String Name)
    {
        // TODO: Exchange the default return implementation for "hasCommandByName" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        for(CommandInfo c:supportedCommands)
            if(c.Name.equalsIgnoreCase(Name))
                return true;
        
        return false;
    }

    public boolean hasCommandByHandle(int Handle)
    {
        // TODO: Exchange the default return implementation for "hasCommandByHandle" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return false;
    }

}
