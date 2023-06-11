package datasource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Component
public class SpringJdbcConfig {

public DriverManagerDataSource setUpDatasource() {
	DriverManagerDataSource ds= new DriverManagerDataSource();
	ds.setUsername("test");
	ds.setPassword("test");
	ds.setUrl("test");
	ds.setDriverClassName("com.mysql.jdbc.Driver");
	return ds;
}

}
