package com.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/send")
public class SendController {

    @Autowired
    SendMessage sendMessage;

    @GetMapping("/{i}")
    public ResponseEntity<String> send(@PathVariable Integer i) {
        for(int j = 0; j < i; j++){
            sendMessage.sendMessage("Message "+ j);
            System.out.println("Envio Mensagem: " + j);
        }
        return new ResponseEntity<String>("GET Response : "
                + i, HttpStatus.OK);
    }



}
