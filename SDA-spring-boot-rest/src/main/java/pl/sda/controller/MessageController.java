package pl.sda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.sda.model.Message;
import pl.sda.service.MessageService;

import java.util.List;

//@Controller
//@ResponseBody //wymusza wna Springu zamiane obiektu zwracanego przez metode na format JSON
//@RestController  // oznacza odpowiednik dwoóch powyższych adnotacji
@RestController
public class MessageController {

    @Autowired
    private MessageService messageService;

    @ResponseStatus(HttpStatus.OK) //status 200
    @GetMapping("/api/messages")
    public List<Message> getAll() {
        return messageService.getAllMessages();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/api/messages/{id}")
//    public Message getById(@PathVariable("id") Integer messageId){
    public Message getById(@PathVariable Integer id) {
        return messageService.getMessageById(id);
    }

    @ResponseStatus(HttpStatus.CREATED) //status 201
    @PostMapping("/api/messages")
    public void create(@RequestBody Message message) {
        messageService.addMessage(message);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT) //status 204
    @PutMapping("/api/messages")
    public void update(@RequestBody Message message) {
        messageService.updateMessage(message);
    }

    @ResponseStatus(HttpStatus.OK) //status 200
    @DeleteMapping("/api/messages/{id}")
    public void delete(@PathVariable Integer id) {
        messageService.deleteMessage(id);
    }
}
