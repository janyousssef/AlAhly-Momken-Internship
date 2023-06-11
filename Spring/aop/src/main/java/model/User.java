package model;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
	@Value("jan")
	private String name;
	@Value("janpw")
	private String password;
	boolean isLoggedIn = false;

	public User() {
		super();
	}

	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int logIn(String pw) {
		if (pw .equals( password)) {
			System.out.println(name + " logged in successfully.");
			isLoggedIn = true;return 1;
		} else
			System.out.println("Wrong password");
		return 0;
	}

	public void logOut() {
		if (isLoggedIn) {
			System.out.println(name + " logged out successfully.");
			isLoggedIn = false;
		} else
			System.out.println(name + " is not logged in");
	}

}
