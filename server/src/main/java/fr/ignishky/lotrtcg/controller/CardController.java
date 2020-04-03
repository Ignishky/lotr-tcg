package fr.ignishky.lotrtcg.controller;

import fr.ignishky.lotrtcg.controller.model.Card;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {

    @GetMapping("/cards/{id}")
    public Card getCard(@PathVariable("id") String id) {
        return new Card().withId(id).withName("Frodo");
    }
}
