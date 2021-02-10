//@author osman 17070006056
package jukebox;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {

    public static Connection getConnection() {
        
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/jukebox?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","mad12345");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
}
