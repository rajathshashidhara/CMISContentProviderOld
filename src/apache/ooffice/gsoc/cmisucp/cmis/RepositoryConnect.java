/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package apache.ooffice.gsoc.cmisucp.cmis;

import java.util.HashMap;
import java.util.Map;
import org.apache.chemistry.opencmis.client.api.Session;
import org.apache.chemistry.opencmis.client.api.SessionFactory;
import org.apache.chemistry.opencmis.client.runtime.SessionFactoryImpl;
import org.apache.chemistry.opencmis.commons.SessionParameter;
import org.apache.chemistry.opencmis.commons.enums.BindingType;

/**
 *
 * @author rajath
 */
public class RepositoryConnect {
    
    private String server_url;
    private String username;
    private String password;
    private String repo_ID;
    private Session session;
    
    public RepositoryConnect()
    {
        server_url = "http://localhost:8080/inmemory/atom";
        username = "admin";
        password = "admin";
        repo_ID = "A1";
    }
    
    // To implement more constructors for polymorphism
    
    public void connect()
    {
        SessionFactory sf = SessionFactoryImpl.newInstance();
        Map<String,String> parameter = new HashMap<String,String>();
        parameter.put(SessionParameter.ATOMPUB_URL, server_url);
        parameter.put(SessionParameter.REPOSITORY_ID, repo_ID);
        parameter.put(SessionParameter.BINDING_TYPE, BindingType.ATOMPUB.value());
        parameter.put(SessionParameter.USER, username);
        parameter.put(SessionParameter.PASSWORD, password);
    
        session = sf.createSession(parameter);
    }
    
    public Session getConnectedSession()
    {
        return session;
    }
}
