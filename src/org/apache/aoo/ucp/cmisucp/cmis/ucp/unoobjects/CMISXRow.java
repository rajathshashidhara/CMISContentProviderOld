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
import java.util.List;

/**
 *
 * @author rajath
 */
public class CMISXRow implements com.sun.star.sdbc.XRow{

    //private Map<String, Class> answer;
    //private Collection<Class> checkCompatibility;
    //private Set<String> ans;
    private List<String> ans;
    private static int lastArg;
    
    CMISXRow(List<String> result) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ans = result;
    }
    
    public boolean wasNull() throws SQLException {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        try
        {
            if(ans.get(lastArg)==null)
                return true;
            else
                return false;
        }
        catch(IndexOutOfBoundsException e)
        {
            return true;            
        }
    }

    public String getString(int arg0) throws SQLException {
      //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      lastArg = arg0;
      
      return ans.get(lastArg);
      //else
      //    throw new UnsupportedOperationException("Datatype Mismatch");
      
    }

    public boolean getBoolean(int arg0) throws SQLException {
      lastArg = arg0;  
      try
      {
          boolean b = Boolean.valueOf(ans.get(lastArg)).booleanValue();
          return b;
      }
      catch(NumberFormatException e)
      {
          throw new UnsupportedOperationException("Datatype Mismatch");
      }
      
    }

    public byte getByte(int arg0) throws SQLException {
        lastArg = arg0;  
        try
        {
            byte b;
            b = Byte.valueOf(ans.get(lastArg)).byteValue();
            return b;
        }
        catch(NumberFormatException e)
        {
            throw new UnsupportedOperationException("Datatype Mismatch");
        }
    }

    public short getShort(int arg0) throws SQLException {
        lastArg = arg0;  
        try
        {
            short b = Short.valueOf(ans.get(lastArg)).shortValue();
            return b;
        }
        catch(NumberFormatException e)
        {
            throw new UnsupportedOperationException("Datatype Mismatch");
        }
    }

    public int getInt(int arg0) throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        lastArg = arg0;  
        try
        {
            int b = Integer.valueOf(ans.get(lastArg)).intValue();
            return b;
        }
        catch(NumberFormatException e)
        {
            throw new UnsupportedOperationException("Datatype Mismatch");
        }
      
    }

    public long getLong(int arg0) throws SQLException {
        lastArg = arg0;  
        try
        {
            long b;
            b = Long.valueOf(ans.get(lastArg)).longValue();
            return b;
        }
        catch(NumberFormatException e)
        {
            throw new UnsupportedOperationException("Datatype Mismatch");
        }
    }

    public float getFloat(int arg0) throws SQLException {
        lastArg = arg0;  
        try
        {
            float b = Float.valueOf(ans.get(lastArg)).floatValue();
            return b;
        }
        catch(NumberFormatException e)
        {
            throw new UnsupportedOperationException("Datatype Mismatch");
        }
    }

    public double getDouble(int arg0) throws SQLException {
        lastArg = arg0;  
        try
        {
            int b = Integer.valueOf(ans.get(lastArg)).intValue();
            return b;
        }
        catch(NumberFormatException e)
        {
            throw new UnsupportedOperationException("Datatype Mismatch");
        }
    }

    public byte[] getBytes(int arg0) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Date getDate(int arg0) throws SQLException {
        lastArg = arg0;
        String s = ans.get(lastArg);
        if(!s.startsWith("java.util.GregorianCalendar"))
            throw new UnsupportedOperationException("Datatype Mismatch");
        else
        {
            short year;
            year = Short.parseShort(s.substring(s.indexOf("YEAR")+5,s.indexOf("YEAR")+9));
            short month;
            try
            {
                month = Short.parseShort(s.substring(s.indexOf("MONTH")+6,s.indexOf("MONTH")+8));
            }
            catch(NumberFormatException e)
            {
                month = Short.parseShort(s.substring(s.indexOf("MONTH")+6,s.indexOf("MONTH")+7));
            }
            short day;
            try
            {
                day = Short.parseShort(s.substring(s.indexOf("DAY_OF_MONTH")+13,s.indexOf("DAY_OF_MONTH")+15));
            }
            catch(NumberFormatException e)
            {
                day = Short.parseShort(s.substring(s.indexOf("DAY_OF_MONTH")+13,s.indexOf("DAY_OF_MONTH")+14));
            }
            Date d = new Date(day,month,year);
            return d;
        }
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
