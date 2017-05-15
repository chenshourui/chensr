package test;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chensr.base.service.IUserService;


public class SpringTest {
	
	@Test
	public void test(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
		IUserService user = (IUserService) ac.getBean("userService");
		user.save();

	}
}
