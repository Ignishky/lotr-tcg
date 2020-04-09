package fr.ignishky.lotrtcg.controller.model;

import lombok.RequiredArgsConstructor;
import lombok.Value;
import lombok.With;

@Value
@With
@RequiredArgsConstructor
public class Card {

    String id;
    String name;
    String cardNumber;

    public Card() {
        this(null, null, null);
    }
}
