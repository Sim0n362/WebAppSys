package edu.fra.uas.service;

import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Component
public class MessageService {
    
    private static Logger log = LoggerFactory.getLogger(MessageService.class);

    private String message;
    private int counter;

    public int increment(int counter) {
        return counter++;
    }

    public String getMessage() {
        log.debug(message);
        return message;
    }
    
    public void setMessage(String message) {
        log.debug(message);
        log.warn(message);
        this.message = message;
    }
}
