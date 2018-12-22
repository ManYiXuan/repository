package config;


import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;


@Configuration
@PropertySource("classpath:jdbc.properties")
public class JdbcConfig {

    @Value("${driver}")
    private String driver;

    @Value("${url}")
    private String url;
    @Value("${name}")
    private String username;
    @Value("${password}")
    private String password;



    @Bean(name="runner")
    @Scope("prototype")
    public QueryRunner getRunner(@Qualifier("dataSource") DataSource dataSource){
        return new QueryRunner(dataSource);
    }
    @Bean(name = "dataSource")
    public DataSource getDataSource(){

        try {
            ComboPooledDataSource ds=new ComboPooledDataSource();
//            ds.setDriverClass("com.mysql.jdbc.Driver");
//            ds.setJdbcUrl("jdbc:mysql://localhost:3306/spring");
//            ds.setUser("root");
//            ds.setPassword("root");

            ds.setDriverClass(driver);
            System.out.println("1"+driver);
            ds.setJdbcUrl(url);
            System.out.println("2"+url);
            ds.setUser(username);
            System.out.println("3"+username);
            ds.setPassword(password);
            System.out.println("4"+password);

            return ds;
        } catch (PropertyVetoException e) {
            throw new RuntimeException(e);
        }

    }
}
