package org.apache.aoo.ucp.cmisucp.cmis.ucp.unoobjects;

import com.sun.star.uno.XComponentContext;
import com.sun.star.lib.uno.helper.Factory;
import com.sun.star.lang.XSingleComponentFactory;
import com.sun.star.registry.XRegistryKey;
import com.sun.star.lib.uno.helper.PropertySet;
import com.sun.star.beans.PropertyAttribute;
import com.sun.star.ucb.OpenCommandArgument2;
import org.apache.chemistry.opencmis.client.api.Session;


public final class CMISResultSet extends PropertySet
   implements com.sun.star.sdbc.XResultSet,
              com.sun.star.sdbc.XCloseable,
              com.sun.star.sdbc.XRow,
              com.sun.star.sdbc.XColumnLocate,
              com.sun.star.ucb.XContentAccess,
              com.sun.star.lang.XServiceInfo,
              com.sun.star.sdbc.XResultSetUpdate,
              com.sun.star.sdbc.XWarningsSupplier,
              com.sun.star.sdbc.XRowUpdate,
              com.sun.star.sdbc.XResultSetMetaDataSupplier
{
    private final XComponentContext m_xContext;
    private static final String m_implementationName = CMISResultSet.class.getName();
    private static final String[] m_serviceNames = {
        "com.sun.star.ucb.ContentResultSet",
        "com.sun.star.sdbc.ResultSet" };

    // properties
    protected String m_CursorName;
    protected int m_ResultSetConcurrency;
    protected int m_ResultSetType;
    protected int m_FetchDirection;
    protected int m_FetchSize;
    protected int m_CursorTravelMode;
    protected int m_RowCount;
    protected boolean m_IsRowCountFinal;

    public CMISResultSet( XComponentContext context, Session s, OpenCommandArgument2 o, String spath )
    {
        m_xContext = context;
        registerProperty("CursorName", "m_CursorName",
              (short)0);
        registerProperty("ResultSetConcurrency", "m_ResultSetConcurrency",
              (short)(PropertyAttribute.MAYBEVOID|PropertyAttribute.BOUND|PropertyAttribute.MAYBEDEFAULT|PropertyAttribute.REMOVEABLE|PropertyAttribute.OPTIONAL));
        registerProperty("ResultSetType", "m_ResultSetType",
              (short)(PropertyAttribute.MAYBEVOID|PropertyAttribute.BOUND|PropertyAttribute.MAYBEDEFAULT|PropertyAttribute.REMOVEABLE|PropertyAttribute.OPTIONAL));
        registerProperty("FetchDirection", "m_FetchDirection",
              (short)0);
        registerProperty("FetchSize", "m_FetchSize",
              (short)0);
        registerProperty("CursorTravelMode", "m_CursorTravelMode",
              PropertyAttribute.BOUND);
        registerProperty("RowCount", "m_RowCount",
              (short)(PropertyAttribute.MAYBEVOID|PropertyAttribute.BOUND|PropertyAttribute.MAYBEDEFAULT|PropertyAttribute.REMOVEABLE|PropertyAttribute.OPTIONAL));
        registerProperty("IsRowCountFinal", "m_IsRowCountFinal",
              (short)(PropertyAttribute.MAYBEVOID|PropertyAttribute.BOUND|PropertyAttribute.MAYBEDEFAULT|PropertyAttribute.REMOVEABLE|PropertyAttribute.OPTIONAL));
    };

    public static XSingleComponentFactory __getComponentFactory( String sImplementationName ) {
        XSingleComponentFactory xFactory = null;

        if ( sImplementationName.equals( m_implementationName ) )
            xFactory = Factory.createComponentFactory(CMISResultSet.class, m_serviceNames);
        return xFactory;
    }

    public static boolean __writeRegistryServiceInfo( XRegistryKey xRegistryKey ) {
        return Factory.writeRegistryServiceInfo(m_implementationName,
                                                m_serviceNames,
                                                xRegistryKey);
    }

    // com.sun.star.sdbc.XResultSet:
    public boolean next() throws com.sun.star.sdbc.SQLException
    {
        // TODO: Exchange the default return implementation for "next" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return false;
    }

    public boolean isBeforeFirst() throws com.sun.star.sdbc.SQLException
    {
        // TODO: Exchange the default return implementation for "isBeforeFirst" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return false;
    }

    public boolean isAfterLast() throws com.sun.star.sdbc.SQLException
    {
        // TODO: Exchange the default return implementation for "isAfterLast" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return false;
    }

    public boolean isFirst() throws com.sun.star.sdbc.SQLException
    {
        // TODO: Exchange the default return implementation for "isFirst" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return false;
    }

    public boolean isLast() throws com.sun.star.sdbc.SQLException
    {
        // TODO: Exchange the default return implementation for "isLast" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return false;
    }

    public void beforeFirst() throws com.sun.star.sdbc.SQLException
    {
        // TODO: Insert your implementation for "beforeFirst" here.
    }

    public void afterLast() throws com.sun.star.sdbc.SQLException
    {
        // TODO: Insert your implementation for "afterLast" here.
    }

    public boolean first() throws com.sun.star.sdbc.SQLException
    {
        // TODO: Exchange the default return implementation for "first" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return false;
    }

    public boolean last() throws com.sun.star.sdbc.SQLException
    {
        // TODO: Exchange the default return implementation for "last" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return false;
    }

    public int getRow() throws com.sun.star.sdbc.SQLException
    {
        // TODO: Exchange the default return implementation for "getRow" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return 0;
    }

    public boolean absolute(int row) throws com.sun.star.sdbc.SQLException
    {
        // TODO: Exchange the default return implementation for "absolute" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return false;
    }

    public boolean relative(int rows) throws com.sun.star.sdbc.SQLException
    {
        // TODO: Exchange the default return implementation for "relative" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return false;
    }

    public boolean previous() throws com.sun.star.sdbc.SQLException
    {
        // TODO: Exchange the default return implementation for "previous" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return false;
    }

    public void refreshRow() throws com.sun.star.sdbc.SQLException
    {
        // TODO: Insert your implementation for "refreshRow" here.
    }

    public boolean rowUpdated() throws com.sun.star.sdbc.SQLException
    {
        // TODO: Exchange the default return implementation for "rowUpdated" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return false;
    }

    public boolean rowInserted() throws com.sun.star.sdbc.SQLException
    {
        // TODO: Exchange the default return implementation for "rowInserted" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return false;
    }

    public boolean rowDeleted() throws com.sun.star.sdbc.SQLException
    {
        // TODO: Exchange the default return implementation for "rowDeleted" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return false;
    }

    public Object getStatement() throws com.sun.star.sdbc.SQLException
    {
        // TODO: Exchange the default return implementation for "getStatement" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return null;
    }

    // com.sun.star.sdbc.XCloseable:
    public void close() throws com.sun.star.sdbc.SQLException
    {
        // TODO: Insert your implementation for "close" here.
    }

    // com.sun.star.sdbc.XRow:
    public boolean wasNull() throws com.sun.star.sdbc.SQLException
    {
        // TODO: Exchange the default return implementation for "wasNull" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return false;
    }

    public String getString(int columnIndex) throws com.sun.star.sdbc.SQLException
    {
        // TODO: Exchange the default return implementation for "getString" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return new String();
    }

    public boolean getBoolean(int columnIndex) throws com.sun.star.sdbc.SQLException
    {
        // TODO: Exchange the default return implementation for "getBoolean" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return false;
    }

    public byte getByte(int columnIndex) throws com.sun.star.sdbc.SQLException
    {
        // TODO: Exchange the default return implementation for "getByte" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return 0;
    }

    public short getShort(int columnIndex) throws com.sun.star.sdbc.SQLException
    {
        // TODO: Exchange the default return implementation for "getShort" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return 0;
    }

    public int getInt(int columnIndex) throws com.sun.star.sdbc.SQLException
    {
        // TODO: Exchange the default return implementation for "getInt" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return 0;
    }

    public long getLong(int columnIndex) throws com.sun.star.sdbc.SQLException
    {
        // TODO: Exchange the default return implementation for "getLong" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return 0;
    }

    public float getFloat(int columnIndex) throws com.sun.star.sdbc.SQLException
    {
        // TODO: Exchange the default return implementation for "getFloat" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return 0;
    }

    public double getDouble(int columnIndex) throws com.sun.star.sdbc.SQLException
    {
        // TODO: Exchange the default return implementation for "getDouble" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return 0;
    }

    public byte[] getBytes(int columnIndex) throws com.sun.star.sdbc.SQLException
    {
        // TODO: Exchange the default return implementation for "getBytes" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return new byte[0];
    }

    public com.sun.star.util.Date getDate(int columnIndex) throws com.sun.star.sdbc.SQLException
    {
        // TODO: Exchange the default return implementation for "getDate" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return new com.sun.star.util.Date();
    }

    public com.sun.star.util.Time getTime(int columnIndex) throws com.sun.star.sdbc.SQLException
    {
        // TODO: Exchange the default return implementation for "getTime" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return new com.sun.star.util.Time();
    }

    public com.sun.star.util.DateTime getTimestamp(int columnIndex) throws com.sun.star.sdbc.SQLException
    {
        // TODO: Exchange the default return implementation for "getTimestamp" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return new com.sun.star.util.DateTime();
    }

    public com.sun.star.io.XInputStream getBinaryStream(int columnIndex) throws com.sun.star.sdbc.SQLException
    {
        // TODO: Exchange the default return implementation for "getBinaryStream" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return null;
    }

    public com.sun.star.io.XInputStream getCharacterStream(int columnIndex) throws com.sun.star.sdbc.SQLException
    {
        // TODO: Exchange the default return implementation for "getCharacterStream" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return null;
    }

    public Object getObject(int columnIndex, com.sun.star.container.XNameAccess typeMap) throws com.sun.star.sdbc.SQLException
    {
        // TODO: Exchange the default return implementation for "getObject" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return com.sun.star.uno.Any.VOID;
    }

    public com.sun.star.sdbc.XRef getRef(int columnIndex) throws com.sun.star.sdbc.SQLException
    {
        // TODO: Exchange the default return implementation for "getRef" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return null;
    }

    public com.sun.star.sdbc.XBlob getBlob(int columnIndex) throws com.sun.star.sdbc.SQLException
    {
        // TODO: Exchange the default return implementation for "getBlob" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return null;
    }

    public com.sun.star.sdbc.XClob getClob(int columnIndex) throws com.sun.star.sdbc.SQLException
    {
        // TODO: Exchange the default return implementation for "getClob" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return null;
    }

    public com.sun.star.sdbc.XArray getArray(int columnIndex) throws com.sun.star.sdbc.SQLException
    {
        // TODO: Exchange the default return implementation for "getArray" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return null;
    }

    // com.sun.star.sdbc.XColumnLocate:
    public int findColumn(String columnName) throws com.sun.star.sdbc.SQLException
    {
        // TODO: Exchange the default return implementation for "findColumn" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return 0;
    }

    // com.sun.star.ucb.XContentAccess:
    public String queryContentIdentifierString()
    {
        // TODO: Exchange the default return implementation for "queryContentIdentifierString" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return new String();
    }

    public com.sun.star.ucb.XContentIdentifier queryContentIdentifier()
    {
        // TODO: Exchange the default return implementation for "queryContentIdentifier" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return null;
    }

    public com.sun.star.ucb.XContent queryContent()
    {
        // TODO: Exchange the default return implementation for "queryContent" !!!
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

    // com.sun.star.sdbc.XResultSetUpdate:
    public void insertRow() throws com.sun.star.sdbc.SQLException
    {
        // TODO: Insert your implementation for "insertRow" here.
    }

    public void updateRow() throws com.sun.star.sdbc.SQLException
    {
        // TODO: Insert your implementation for "updateRow" here.
    }

    public void deleteRow() throws com.sun.star.sdbc.SQLException
    {
        // TODO: Insert your implementation for "deleteRow" here.
    }

    public void cancelRowUpdates() throws com.sun.star.sdbc.SQLException
    {
        // TODO: Insert your implementation for "cancelRowUpdates" here.
    }

    public void moveToInsertRow() throws com.sun.star.sdbc.SQLException
    {
        // TODO: Insert your implementation for "moveToInsertRow" here.
    }

    public void moveToCurrentRow() throws com.sun.star.sdbc.SQLException
    {
        // TODO: Insert your implementation for "moveToCurrentRow" here.
    }

    // com.sun.star.sdbc.XWarningsSupplier:
    public Object getWarnings() throws com.sun.star.sdbc.SQLException
    {
        // TODO: Exchange the default return implementation for "getWarnings" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return com.sun.star.uno.Any.VOID;
    }

    public void clearWarnings() throws com.sun.star.sdbc.SQLException
    {
        // TODO: Insert your implementation for "clearWarnings" here.
    }

    // com.sun.star.sdbc.XRowUpdate:
    public void updateNull(int columnIndex) throws com.sun.star.sdbc.SQLException
    {
        // TODO: Insert your implementation for "updateNull" here.
    }

    public void updateBoolean(int columnIndex, boolean x) throws com.sun.star.sdbc.SQLException
    {
        // TODO: Insert your implementation for "updateBoolean" here.
    }

    public void updateByte(int columnIndex, byte x) throws com.sun.star.sdbc.SQLException
    {
        // TODO: Insert your implementation for "updateByte" here.
    }

    public void updateShort(int columnIndex, short x) throws com.sun.star.sdbc.SQLException
    {
        // TODO: Insert your implementation for "updateShort" here.
    }

    public void updateInt(int columnIndex, int x) throws com.sun.star.sdbc.SQLException
    {
        // TODO: Insert your implementation for "updateInt" here.
    }

    public void updateLong(int columnIndex, long x) throws com.sun.star.sdbc.SQLException
    {
        // TODO: Insert your implementation for "updateLong" here.
    }

    public void updateFloat(int columnIndex, float x) throws com.sun.star.sdbc.SQLException
    {
        // TODO: Insert your implementation for "updateFloat" here.
    }

    public void updateDouble(int columnIndex, double x) throws com.sun.star.sdbc.SQLException
    {
        // TODO: Insert your implementation for "updateDouble" here.
    }

    public void updateString(int columnIndex, String x) throws com.sun.star.sdbc.SQLException
    {
        // TODO: Insert your implementation for "updateString" here.
    }

    public void updateBytes(int columnIndex, byte[] x) throws com.sun.star.sdbc.SQLException
    {
        // TODO: Insert your implementation for "updateBytes" here.
    }

    public void updateDate(int columnIndex, com.sun.star.util.Date x) throws com.sun.star.sdbc.SQLException
    {
        // TODO: Insert your implementation for "updateDate" here.
    }

    public void updateTime(int columnIndex, com.sun.star.util.Time x) throws com.sun.star.sdbc.SQLException
    {
        // TODO: Insert your implementation for "updateTime" here.
    }

    public void updateTimestamp(int columnIndex, com.sun.star.util.DateTime x) throws com.sun.star.sdbc.SQLException
    {
        // TODO: Insert your implementation for "updateTimestamp" here.
    }

    public void updateBinaryStream(int columnIndex, com.sun.star.io.XInputStream x, int length) throws com.sun.star.sdbc.SQLException
    {
        // TODO: Insert your implementation for "updateBinaryStream" here.
    }

    public void updateCharacterStream(int columnIndex, com.sun.star.io.XInputStream x, int length) throws com.sun.star.sdbc.SQLException
    {
        // TODO: Insert your implementation for "updateCharacterStream" here.
    }

    public void updateObject(int columnIndex, Object x) throws com.sun.star.sdbc.SQLException
    {
        // TODO: Insert your implementation for "updateObject" here.
    }

    public void updateNumericObject(int columnIndex, Object x, int scale) throws com.sun.star.sdbc.SQLException
    {
        // TODO: Insert your implementation for "updateNumericObject" here.
    }

    // com.sun.star.sdbc.XResultSetMetaDataSupplier:
    public com.sun.star.sdbc.XResultSetMetaData getMetaData() throws com.sun.star.sdbc.SQLException
    {
        // TODO: Exchange the default return implementation for "getMetaData" !!!
        // NOTE: Default initialized polymorphic structs can cause problems
        // because of missing default initialization of primitive types of
        // some C++ compilers or different Any initialization in Java and C++
        // polymorphic structs.
        return null;
    }

}
