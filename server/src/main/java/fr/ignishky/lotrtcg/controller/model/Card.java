package fr.ignishky.lotrtcg.controller.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import lombok.With;

@Value
@With
@ApiModel(description = "A playing card representation")
@RequiredArgsConstructor
public class Card {

    @ApiModelProperty(value = "The card's name", required = true)
    String name;
    @ApiModelProperty(value = "The card's serial number", required = true)
    String number;

    public Card() {
        this(null, null);
    }
}
