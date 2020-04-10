package fr.ignishky.lotrtcg.controller;

import fr.ignishky.lotrtcg.controller.api.CardController;
import fr.ignishky.lotrtcg.controller.model.Card;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultCardController implements CardController {

    public Card getCard(String number) {
        return new Card().withName("Frodo").withNumber(number);
    }
}
