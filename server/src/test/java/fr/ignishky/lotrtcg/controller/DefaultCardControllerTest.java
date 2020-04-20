package fr.ignishky.lotrtcg.controller;

import fr.ignishky.lotrtcg.repository.model.ACard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.web.servlet.MockMvc;

import static javax.servlet.http.HttpServletResponse.SC_NOT_FOUND;
import static javax.servlet.http.HttpServletResponse.SC_OK;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class DefaultCardControllerTest {

    @Autowired
    private MockMvc mvc;
    @Autowired
    private MongoTemplate mongoTemplate;

    @BeforeEach
    void clean() {
        mongoTemplate.dropCollection(ACard.class);
    }

    @Test
    void given_unknown_number_should_get_404() throws Exception {
        mvc.perform(get("/api/cards/unknown"))
                .andExpect(status().is(SC_NOT_FOUND));
    }

    @Test
    void should_get_card_by_number() throws Exception {
        mongoTemplate.save(new ACard().withNumber("1").withTitle("Frodo"));

        mvc.perform(get("/api/cards/1"))
                .andExpect(status().is(SC_OK))
                .andExpect(content().contentType(APPLICATION_JSON))
                .andExpect(content().json("{'name':'Frodo', 'number':'1'}", true));
    }
}
