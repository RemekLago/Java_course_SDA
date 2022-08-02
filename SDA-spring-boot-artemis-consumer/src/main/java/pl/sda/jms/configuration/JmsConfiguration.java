package pl.sda.jms.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConversionException;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

@Configuration
public class JmsConfiguration {

    @Bean
    public MessageConverter messageConverter() {

        MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter() {
            @Override
            public Object fromMessage(Message message) throws JMSException, MessageConversionException {
                return super.fromMessage(message);
            }
        };

        converter.setTargetType(MessageType.TEXT);
        converter.setTypeIdPropertyName("type");
        return converter;
    }
}
