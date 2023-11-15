package bg.smg.util;

import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.SQLException;

public class DBManager {
    public static DBManager instance;
    private DataSource dataSource;

    DBManager() throws SQLException {
        MariaDbDataSource dataSource = new MariaDbDataSource();

        dataSource.setUrl("jdbc:mariadb://127.0.0.1:3306/movies");
        dataSource.setUser("root");
        dataSource.setPassword(null);
        this.dataSource = dataSource;
    }
    public static synchronized DBManager getInstance() throws SQLException{
        if(instance==null){
            instance=new DBManager();
        }
        return instance;
    }
}
