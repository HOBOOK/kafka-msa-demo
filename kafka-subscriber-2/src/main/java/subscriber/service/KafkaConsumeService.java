package subscriber.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Log4j2
@Service
public class KafkaConsumeService {
    @KafkaListener(topics = "ho-1", groupId = "tom")
    public void consume(String message) throws IOException {
        log.info("[kafka-subscriber-2] 메시지 받음 :: " + message);
    }
}
