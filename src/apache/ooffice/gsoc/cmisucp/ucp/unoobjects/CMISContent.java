package apache.ooffice.gsoc.cmisucp.ucp.unoobjects;

import apache.ooffice.gsoc.cmisucp.cmis.RepositoryConnect;
import com.sun.star.beans.IllegalTypeException;
import com.sun.star.beans.NotRemoveableException;
import com.sun.star.beans.Property;
import com.sun.star.beans.PropertyExistException;
import com.sun.star.beans.UnknownPropertyException;
import com.sun.star.beans.XPropertiesChangeListener;
import com.sun.star.beans.XPropertySetInfoChangeListener;
import com.sun.star.lang.IllegalArgumentException;
import com.sun.star.lang.NoSupportException;
import com.sun.star.uno.XComponentContext;
import com.sun.star.lib.uno.helper.WeakBase;
import com.sun.star.ucb.Command;
import com.sun.star.ucb.CommandAbortedException;
import com.sun.star.ucb.ContentInfo;
import com.sun.star.ucb.UnsupportedCommandException;
import com.sun.star.ucb.XCommandEnvironment;
import com.sun.star.ucb.XCommandInfoChangeListener;
import com.sun.star.ucb.XContent;
import com.sun.star.ucb.XContentIdentifier;
import com.sun.star.uno.AnyConverter;
import com.sun.star.uno.Exception;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.chemistry.opencmis.client.api.CmisObject;
import org.apache.chemistry.opencmis.client.api.Session;
import org.apache.chemistry.opencmis.commons.PropertyIds;


public final class CMISContent extends WeakBase
   implements com.sun.star.ucb.XContent,
              com.sun.star.ucb.XCommandInfoChangeNotifier,
              com.sun.star.ucb.XCommandProcessor,
              com.sun.star.lang.XServiceInfo,
              com.sun.star.ucb.XCommandProcessor2,
              com.sun.star.ucb.XContentCreator,
              com.sun.star.beans.XPropertyContainer,
              com.sun.star.beans.XPropertySetInfoChangeNotifier,
              com.sun.star.beans.XPropertiesChangeNotifier,
              com.sun.star.container.XChild
{
    private final XComponentContext m_xContext;
    private static final String m_implementationName = CMISContent.class.getName();
    private XContentIdentifier contentID;
    private String relative_path;
    private Map<String,String> properties;
    private Session session;
    private CmisObject content;
    
    /**
     *
     * @param context
     * @param xContentIdentifier
     */
    public CMISContent( XComponentContext context, XContentIdentifier xContentIdentifier )
    {
        m_xContext = context;
        contentID = xContentIdentifier;
        generateRelativePath();
    };

    // com.sun.star.ucb.XContent:
    public com.sun.star.ucb.XContentIdentifier getIdentifier()
    {
        // TODO: Exchange the default return implementation for "getIdentifier" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return contentID;
    }

    public String getContentType()
    {
        // TODO: Exchange the default return implementation for "getContentType" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        String type;
        
        if(session==null)
            connectToRepository();
        
            
        type = content.getProperty(PropertyIds.BASE_TYPE_ID).getValueAsString();
        
        return type;
    }
    
    private void connectToRepository()
    {
        RepositoryConnect rc = new RepositoryConnect();
        rc.connect();
        session = rc.getConnectedSession();
        content = session.getObjectByPath(relative_path);
    }

    public void addContentEventListener(com.sun.star.ucb.XContentEventListener Listener)
    {
        // TODO: Insert your implementation for "addContentEventListener" here.
    }

    public void removeContentEventListener(com.sun.star.ucb.XContentEventListener Listener)
    {
        // TODO: Insert your implementation for "removeContentEventListener" here.
    }
    
    private void generateRelativePath()
    {
        if(contentID.getContentIdentifier().endsWith(".odt"))
            relative_path = contentID.getContentIdentifier().substring(7);
        else
            relative_path = contentID.getContentIdentifier().substring(7);
        
        System.out.println(relative_path);
    }

    public int createCommandIdentifier() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object execute(Command arg0, int arg1, XCommandEnvironment arg2) throws Exception, CommandAbortedException {
         //To change body of generated methods, choose Tools | Templates.
        if(arg0.Name.equals("getPropertyValues"))
        {
            com.sun.star.beans.Property pRequest[];
            pRequest = (Property[]) AnyConverter.toArray(arg0.Argument);
            return obtainProperties(pRequest);
        }

        else if(arg0.Name.equals("getCommandInfo"))
        {
            //to-do
        }
        else if(arg0.Name.equals("getPropertySetInfo"))
        {
            //to-do
        }
        else if(arg0.Name.equals("setPropertyValues"))
        {
            //to-do
        }
        else if(arg0.Name.equals("open"))
        {
            //Wrong Implementation
            
            //if(content==null)
            //    connectToRepository();
            //Document doc = (Document)content;
            //InputStream stream = doc.getContentStream().getStream();
            //return stream;
        }
        else if(arg0.Name.equals("delete"))
        {
            //to-do
        }
        else if(arg0.Name.equals("insert"))
        {
            //to-do
        }
        else if(arg0.Name.equals("transfer"))
        {
            //to-do
        }
        else
            throw new UnsupportedCommandException(arg0.Name+" Not Supported");
        
        return null;
    }

    private Object obtainProperties(com.sun.star.beans.Property arr[])throws NullPointerException, UnsupportedCommandException, IllegalArgumentException
    {
        if(session==null)
            connectToRepository();
        
        List<String> result = new ArrayList<String>();
                
        for(com.sun.star.beans.Property p:arr)
        {
            if(p.Name.equals("Title"))
                result.add(content.getName());
            else if(p.Name.equals("IsFolder"))
                result.add(content.getType().getDisplayName().equals("cmis:folder")?"True":"False");
            else if(p.Name.equals("IsDocument"))                
                result.add(content.getType().getDisplayName().equals("openDocument")?"True":"False");
            else if(p.Name.equals("DateCreated"))                
                result.add(content.getCreationDate().toString());
            else if(p.Name.equals("DateModified"))               
                result.add(content.getCreationDate().toString());
            else if(p.Name.equals("Size"))
                result.add(content.getPropertyValue(PropertyIds.CONTENT_STREAM_LENGTH).toString());
            else if(p.Name.equals("MediaType"))
                result.add(content.getPropertyValue(PropertyIds.CONTENT_STREAM_MIME_TYPE).toString());
            else if(p.Name.equals("ContentType"))
                result.add(content.getPropertyValue(PropertyIds.CONTENT_STREAM_MIME_TYPE).toString());
            else
                throw new UnsupportedCommandException(p.Name+" Not Supported");
        }
        return AnyConverter.toObject(CMISXRow.class, new CMISXRow(result));
    }
    public void abort(int arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getImplementationName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean supportsService(String arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String[] getSupportedServiceNames() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void releaseCommandIdentifier(int arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ContentInfo[] queryCreatableContentsInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public XContent createNewContent(ContentInfo arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addProperty(String arg0, short arg1, Object arg2) throws PropertyExistException, IllegalTypeException, IllegalArgumentException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void removeProperty(String arg0) throws UnknownPropertyException, NotRemoveableException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addPropertySetInfoChangeListener(XPropertySetInfoChangeListener arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void removePropertySetInfoChangeListener(XPropertySetInfoChangeListener arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addPropertiesChangeListener(String[] arg0, XPropertiesChangeListener arg1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void removePropertiesChangeListener(String[] arg0, XPropertiesChangeListener arg1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getParent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setParent(Object arg0) throws NoSupportException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addCommandInfoChangeListener(XCommandInfoChangeListener arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void removeCommandInfoChangeListener(XCommandInfoChangeListener arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
