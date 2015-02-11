package rakeshopensource.redis.listener;

import java.io.Serializable;
import java.util.Map;

import org.springframework.data.redis.connection.Message;

public interface MessageListener {
	
	public void handleMessage(String message);

    public void handleMessage(byte[] message);

    public void handleMessage(Serializable message);
	
    public void handleMessage(Serializable message, String channel);
    
    public void handleMessage(Message message, byte[] pattern);

}
