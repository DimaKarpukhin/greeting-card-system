package com.handson.greetingcards.services;

import com.handson.greetingcards.entities.CardTemplate;
import com.handson.greetingcards.repositories.CardTemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CardTemplateService {

    @Autowired
    CardTemplateRepository cardTemplateRepository;

    public void saveTemplate(CardTemplate cardTemplate) {
        cardTemplateRepository.save(cardTemplate);
    }

    public CardTemplate findTemplate(Long id){
        return cardTemplateRepository.findById(id).orElse(null);
    }

    public List<CardTemplate> getAllTemplates() {
        List<CardTemplate> cardTemplates = new ArrayList<>();
        cardTemplateRepository.findAll().forEach(cardTemplates::add);

        return cardTemplates;
    }
}
