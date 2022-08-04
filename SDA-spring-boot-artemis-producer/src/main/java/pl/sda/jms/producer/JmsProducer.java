package pl.sda.jms.producer;

import pl.sda.jms.model.Message;

public interface JmsProducer {

    void send(String message);

    void send(Message message);

}
