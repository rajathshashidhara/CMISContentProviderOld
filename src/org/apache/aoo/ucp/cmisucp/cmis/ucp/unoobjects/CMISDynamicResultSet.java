package org.apache.aoo.ucp.cmisucp.cmis.ucp.unoobjects;

import com.sun.star.uno.XComponentContext;
import com.sun.star.lib.uno.helper.Factory;
import com.sun.star.lang.XSingleComponentFactory;
import com.sun.star.registry.XRegistryKey;
import com.sun.star.lib.uno.helper.ComponentBase;
import com.sun.star.ucb.OpenCommandArgument2;
import org.apache.chemistry.opencmis.client.api.Session;


public final class CMISDynamicResultSet extends ComponentBase
   implements com.sun.star.ucb.XDynamicResultSet,
              com.sun.star.lang.XServiceInfo
{
    private final XComponentContext m_xContext;
    private static final String m_implementationName = CMISDynamicResultSet.class.getName();
    private static final String[] m_serviceNames = {
        "com.sun.star.ucb.DynamicResultSet" };


    public CMISDynamicResultSet( XComponentContext context, String spath, Session s, OpenCommandArgument2 o )
    {
        m_xContext = context;
    };

    public static XSingleComponentFactory __getComponentFactory( String sImplementationName ) {
        XSingleComponentFactory xFactory = null;

        if ( sImplementationName.equals( m_implementationName ) )
            xFactory = Factory.createComponentFactory(CMISDynamicResultSet.class, m_serviceNames);
        return xFactory;
    }

    public static boolean __writeRegistryServiceInfo( XRegistryKey xRegistryKey ) {
        return Factory.writeRegistryServiceInfo(m_implementationName,
                                                m_serviceNames,
                                                xRegistryKey);
    }

    // com.sun.star.ucb.XDynamicResultSet:
    public com.sun.star.sdbc.XResultSet getStaticResultSet() throws com.sun.star.ucb.ListenerAlreadySetException
    {
        // TODO: Exchange the default return implementation for "getStaticResultSet" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return null;
    }

    public void setListener(com.sun.star.ucb.XDynamicResultSetListener Listener) throws com.sun.star.ucb.ListenerAlreadySetException
    {
        // TODO: Insert your implementation for "setListener" here.
    }

    public void connectToCache(com.sun.star.ucb.XDynamicResultSet Cache) throws com.sun.star.ucb.ListenerAlreadySetException, com.sun.star.ucb.AlreadyInitializedException, com.sun.star.ucb.ServiceNotFoundException
    {
        // TODO: Insert your implementation for "connectToCache" here.
    }

    public short getCapabilities()
    {
        // TODO: Exchange the default return implementation for "getCapabilities" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return 0;
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

}
