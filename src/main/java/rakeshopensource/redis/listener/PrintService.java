package rakeshopensource.redis.listener;

import java.io.Serializable;

import org.springframework.data.redis.connection.Message;

public class PrintService implements MessageListener{


	public void handleMessage(String message) {
		 System.out.println( "Print Service Message " + message + "!");
		
	}

	public void handleMessage(byte[] message) {
		 System.out.println( "Print Service Message " + message + "!");
		
	}

	public void handleMessage(Serializable message) {
		 System.out.println( "Print Service Message " + message + "!");
		
	}

	public void handleMessage(Serializable message, String channel) {
		 System.out.println( "Print Service Message " + message + "!");
		
	}

	public void handleMessage(Message message, byte[] pattern) {
		 System.out.println( "Print Service Message " + message + "!");
		
	}
}