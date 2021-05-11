package fr.ignishky.lotrtcg.controller.api;

import fr.ignishky.lotrtcg.controller.model.Card;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@Api(tags = "Card")
@RequestMapping(value = "/api/cards", produces = APPLICATION_JSON_VALUE)
public interface CardController {

    @GetMapping("/{number}")
    @ApiOperation("Get the card with the given number or an error if unknown.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "The number was found and the card is returned."),
            @ApiResponse(code = 404, message = "The number could not be retrieved.")
    })
    Card getCard(
            @ApiParam(required = true, value = "The wanted card's serial number.", example = "01364")
            @PathVariable("number") String number);
}
