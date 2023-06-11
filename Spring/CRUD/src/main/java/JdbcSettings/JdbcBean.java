package JdbcSettings;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
@Configuration
//@ComponentScan(basePackages = {"models","JdbcSettings","MVC.CRUD.controller"})
public class JdbcBean {
	@Bean
	public JdbcTemplate template() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:9999/mvc");
		ds.setUsername("root");
		ds.setPassword("asdsql456zxc123");
		JdbcTemplate j = new JdbcTemplate(ds);
		return j;
	}
}
