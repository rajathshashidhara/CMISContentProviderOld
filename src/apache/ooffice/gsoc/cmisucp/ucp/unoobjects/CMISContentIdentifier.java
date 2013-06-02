package apache.ooffice.gsoc.cmisucp.ucp.unoobjects;

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
