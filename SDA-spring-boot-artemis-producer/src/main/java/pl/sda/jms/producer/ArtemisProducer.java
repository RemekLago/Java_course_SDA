package pl.sda.jms.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import pl.sda.jms.model.Message;

@Component
public class ArtemisProducer implements JmsProducer {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("${jms.queue.destination}")
    private String destinationQueue;

    @Override
    public void send(String message) {
        jmsTemplate.convertAndSend(destinationQueue, message);
    }

    @Override
    public void send(Message message) {
        jmsTemplate.convertAndSend(destinationQueue, message);
    }
}

