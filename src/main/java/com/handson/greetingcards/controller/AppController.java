package com.handson.greetingcards.controller;

import com.handson.greetingcards.entities.CardOrder;
import com.handson.greetingcards.entities.CardTemplate;
import com.handson.greetingcards.entities.GreetingCard;
import com.handson.greetingcards.services.CardTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "")
public class AppController {

    @Autowired
    CardTemplateService cardTemplateService;
//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
//    public String sayHello()
//    {
//        return "Hello!";
//    }
    @RequestMapping(value = "/newCardTemplate", method = RequestMethod.PUT)
    public ResponseEntity<Void> addCardTemplate(@RequestBody CardTemplate cardTemplate) {
        cardTemplateService.saveTemplate(cardTemplate);

        return new ResponseEntity<Void>(new HttpHeaders(), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/greetingCard", method = RequestMethod.POST)
    public GreetingCard createGreetingCard(@RequestBody CardOrder cardOrder) {
        CardTemplate cardTemplate = cardTemplateService.findTemplate(cardOrder.getTemplateId());

        return new GreetingCard(cardTemplate,
                cardOrder.getRecipientName(),
                cardOrder.getSenderName());
    }

    @RequestMapping(value = "/allCardTemplates", method = RequestMethod.GET)
    public List<CardTemplate> getCardTemplates(){
        return cardTemplateService.getAllTemplates();
    }
}
