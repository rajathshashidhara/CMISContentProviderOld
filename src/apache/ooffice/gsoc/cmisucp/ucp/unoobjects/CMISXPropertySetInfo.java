package apache.ooffice.gsoc.cmisucp.ucp.unoobjects;

import com.sun.star.beans.Property;
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
        
        available_properties[2].Name = "IsDocument";
        available_properties[2].Type = Type.BOOLEAN;
        
        available_properties[3].Name = "DateCreated";
        available_properties[3].Type = Type.ANY;
        
        available_properties[4].Name = "DateModified";
        available_properties[4].Type = Type.ANY;
        
        available_properties[5].Name = "Size";
        available_properties[5].Type = Type.UNSIGNED_LONG;
        
        available_properties[6].Name = "MediaType";
        available_properties[6].Type = Type.STRING;
        
        available_properties[7].Name = "ContentType";
        available_properties[7].Type = Type.STRING;
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
