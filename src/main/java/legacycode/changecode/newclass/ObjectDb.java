package legacycode.changecode.newclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ObjectDb {
    private static final String DRIVER_CLASS = "";
    private static final String DB_URL = "";
    private static final String USER = "";
    private static final String PASSWORD = "";

    public static ResultSet populate(String sql) throws Exception {
        Connection c = null;
        ResultSet rs = null;

        try {
            Class.forName(DRIVER_CLASS);
            c = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            Statement stmt = c.createStatement();
            rs = stmt.executeQuery(sql);
        } finally {
            c.close();
        }
        return rs;
    }

}
