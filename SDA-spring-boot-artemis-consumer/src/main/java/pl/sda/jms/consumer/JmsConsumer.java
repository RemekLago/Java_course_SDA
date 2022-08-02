package pl.sda.jms.consumer;

import pl.sda.jms.model.Message;

public interface JmsConsumer {

    void receive(Message message);
}
