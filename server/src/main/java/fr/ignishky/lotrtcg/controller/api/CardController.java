package fr.ignishky.lotrtcg.controller.api;

import fr.ignishky.lotrtcg.controller.model.Card;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@Api(tags = "API for Cards")
@RequestMapping(value = "/api/cards", produces = APPLICATION_JSON_VALUE)
public interface CardController {

    @GetMapping("/{number}")
    @ApiOperation("Get card with the given number")
    Card getCard(
            @ApiParam(required = true, value = "The serial number of the card", example = "01364")
            @PathVariable("number") String number);
}
