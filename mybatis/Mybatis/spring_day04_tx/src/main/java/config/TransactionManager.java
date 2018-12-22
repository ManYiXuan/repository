package config;

import javax.sql.DataSource;


public class TransactionManager {
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
