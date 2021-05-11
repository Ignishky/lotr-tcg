package fr.ignishky.lotrtcg.controller;

import fr.ignishky.lotrtcg.controller.api.CardController;
import fr.ignishky.lotrtcg.controller.model.Card;
import fr.ignishky.lotrtcg.repository.CardRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import static fr.ignishky.lotrtcg.controller.model.Card.toCard;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@Slf4j
@RestController
public class DefaultCardController implements CardController {

    @Autowired
    private CardRepository cardRepository;

    public Card getCard(String number) {
        var aCard = cardRepository.findByNumber(number);
        if(aCard == null) {
            log.error("Unable to find card with number {}", number);
            throw new ResponseStatusException(NOT_FOUND);
        }
        return toCard(aCard);
    }
}
