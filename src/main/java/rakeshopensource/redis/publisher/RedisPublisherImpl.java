package rakeshopensource.redis.publisher;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;

public class RedisPublisherImpl implements RedisPublisher{
	@Autowired
	private RedisTemplate<String, String> redisTemplate;
	@Value("${app.config.redis.topic}")
	private String topic;
	private final AtomicLong counter = new AtomicLong( 0 );
	
	public void publish() {
		redisTemplate.convertAndSend( topic , "Message " + counter.incrementAndGet() );
		
	}
}
