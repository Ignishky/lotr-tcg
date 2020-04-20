package fr.ignishky.lotrtcg.controller.model;

import fr.ignishky.lotrtcg.repository.model.ACard;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Value;

@Value
@ApiModel(description = "A playing card representation")
public class Card {

    @ApiModelProperty(value = "The card's name", required = true)
    String name;
    @ApiModelProperty(value = "The card's serial number", required = true)
    String number;

    public static Card toCard(ACard aCard) {
        return new Card(aCard.getTitle(), aCard.getNumber());
    }
}
