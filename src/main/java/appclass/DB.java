package appclass;
import org.sql2o.*;
import java.net.URI;
import java.net.URISyntaxException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DB {
    private static URI databaseUri;
    public static Sql2o sql2o;
    static Logger logger = LoggerFactory.getLogger(DB.class);
    static {

        try{
            if(System.getenv("DATABASE_URL") == null){
                databaseUri = new URI("postgres://localhost:5432/wildlife_tracker");
            }
            else {
                databaseUri = new URI(System.getenv("DATABASE_URL"));
            }

            int port = databaseUri.getPort();
            String host = databaseUri.getHost();
            String path = databaseUri.getPath();
            String username = (databaseUri.getUserInfo() == null) ? "jamal" : databaseUri.getUserInfo().split(":")[0];
            String password = (databaseUri.getUserInfo() == null) ? "jamal" : databaseUri.getUserInfo().split(":")[1];
            sql2o = new Sql2o("jdbc:postgresql://" + host + ":" + port + path, username, password);
        } catch (URISyntaxException e){
            logger.error("unable to connect to database");
        }

    }
}
