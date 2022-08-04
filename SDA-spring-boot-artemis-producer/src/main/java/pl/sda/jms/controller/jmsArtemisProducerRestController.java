package pl.sda.jms.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.jms.model.Message;
import pl.sda.jms.producer.JmsProducer;

import java.time.LocalDateTime;

@Slf4j
@RestController
public class jmsArtemisProducerRestController {

    @Autowired
    private JmsProducer jmsProducer;

    @GetMapping("/jms/send")
    public String producerMessage(@RequestParam(value = "message", defaultValue = "default message") String message){
        jmsProducer.send(message);
        log.info("Successfully send message to queue");
        return "Successfully send message to queue " + message;
    }

    @GetMapping("/jms/object/send")
    public String producerObjectMessage(@RequestParam(value = "message", defaultValue = "default message") String message){
        Message objectMessage = new Message(message);
        jmsProducer.send(objectMessage);
        log.info("Successfully send object message to queue");
        return "Successfully send object message to queue " + objectMessage;
    }

}
