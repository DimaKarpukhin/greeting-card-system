package com.handson.greetingcards.repositories;

import com.handson.greetingcards.entities.CardTemplate;
import org.springframework.data.repository.CrudRepository;

public interface CardTemplateRepository extends CrudRepository<CardTemplate,Long> { }
