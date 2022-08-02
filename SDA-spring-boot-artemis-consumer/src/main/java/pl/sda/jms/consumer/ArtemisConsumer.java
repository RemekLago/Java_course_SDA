package pl.sda.jms.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import pl.sda.jms.model.Message;

@Slf4j
@Component
public class ArtemisConsumer implements JmsConsumer {
    @JmsListener(destination = "${jms.queue.destination}")
    @Override
    public void receive(Message message) {
        log.info("Received message from queue: " + message);
    }
}
