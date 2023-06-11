package aspects;



import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggerAspect {


	@Before("execution(* model.User.logIn(..))")
	public void logInAttempt(JoinPoint jp) {

		System.out.println("Someone is trying to log in ");
	}

	@Before("execution (* model.User.logOut(..))")
	public void logOutAttempt(JoinPoint jp) {
		
		System.out.println("Someone is trying to log out");
	}

}
