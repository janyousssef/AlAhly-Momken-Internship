import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import datasource.SpringJdbcConfig;
import model.User;

public class main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(AppConfig.class);
		
		final JdbcTemplate jdbct= new JdbcTemplate((DriverManagerDataSource)c.getBean(SpringJdbcConfig.class).setUpDatasource());
		
		User u1 = (User) c.getBean("user");
		u1.logOut();
		u1.logIn("janpw");
		u1.logOut();
		c.close();
	}

}
