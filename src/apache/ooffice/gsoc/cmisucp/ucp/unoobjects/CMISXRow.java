/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package apache.ooffice.gsoc.cmisucp.ucp.unoobjects;

import com.sun.star.container.XNameAccess;
import com.sun.star.io.XInputStream;
import com.sun.star.sdbc.SQLException;
import com.sun.star.sdbc.XArray;
import com.sun.star.sdbc.XBlob;
import com.sun.star.sdbc.XClob;
import com.sun.star.sdbc.XRef;
import com.sun.star.util.Date;
import com.sun.star.util.DateTime;
import com.sun.star.util.Time;
import java.util.Map;

/**
 *
 * @author rajath
 */
public class CMISXRow implements com.sun.star.sdbc.XRow{

    private Map<String, Class> answer;
    private static int lastArg;
    private static boolean lastWasNull = true;
    
    CMISXRow(Map<String, Class> result) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        answer = result;
    }
    
    public boolean wasNull() throws SQLException {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return lastWasNull;
    }

    public String getString(int arg0) throws SQLException {
      //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      lastArg = arg0-1;  
      if(answer.get(answer.keySet().toArray()[lastArg].toString())== String.class)
      {
          if(answer.keySet().toArray()[lastArg]==null)
              lastWasNull = true;
          else
              lastWasNull = false;
          return answer.keySet().toArray()[lastArg].toString();
      }
      else
          throw new UnsupportedOperationException("Datatype Mismatch");
      
    }

    public boolean getBoolean(int arg0) throws SQLException {
      lastArg = arg0-1;  
      if(answer.get(answer.keySet().toArray()[lastArg].toString())== Boolean.class)
      {
          if(answer.keySet().toArray()[lastArg]==null)
              lastWasNull = true;
          else
              lastWasNull = false;
          return Boolean.valueOf(answer.keySet().toArray()[lastArg].toString());
      }
      else
          throw new UnsupportedOperationException("Datatype Mismatch");
      
    }

    public byte getByte(int arg0) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public short getShort(int arg0) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getInt(int arg0) throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        lastArg = arg0-1;  
      if(answer.get(answer.keySet().toArray()[lastArg].toString())== Integer.class)
      {
          if(answer.keySet().toArray()[lastArg]==null)
              lastWasNull = true;
          else
              lastWasNull = false;
          return Integer.valueOf(answer.keySet().toArray()[lastArg].toString());
      }
      else
          throw new UnsupportedOperationException("Datatype Mismatch");
      
    }

    public long getLong(int arg0) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public float getFloat(int arg0) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getDouble(int arg0) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public byte[] getBytes(int arg0) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Date getDate(int arg0) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Time getTime(int arg0) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public DateTime getTimestamp(int arg0) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public XInputStream getBinaryStream(int arg0) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public XInputStream getCharacterStream(int arg0) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getObject(int arg0, XNameAccess arg1) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public XRef getRef(int arg0) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public XBlob getBlob(int arg0) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public XClob getClob(int arg0) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public XArray getArray(int arg0) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
