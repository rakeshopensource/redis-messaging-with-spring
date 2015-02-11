package rakeshopensource.redis.listener;


import java.io.Serializable;

import org.springframework.data.redis.connection.Message;


public class RedisMessageListener implements MessageListener {
    
	public void handleMessage( final Message message, final byte[] pattern ) {
        System.out.println( "Message received: " + message.toString() );
    }

	public void handleMessage(String message) {
		 System.out.println( "Message received: " + message.toString());
		
	}

	public void handleMessage(byte[] message) {
		System.out.println( "Message received: " + message.toString() );
		
	}

	public void handleMessage(Serializable message) {
		System.out.println( "Message received: " + message.toString() );
		
	}

	public void handleMessage(Serializable message, String channel) {
		System.out.println( "Message received: " + message.toString() );
		
	}
}