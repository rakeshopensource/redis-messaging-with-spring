package rakeshopensource.redis;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class RedisMessagingTest {

    public static void main(String[] args){
    		
    	@SuppressWarnings({"unused", "resource" })
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-conf.xml");	
    }
}
