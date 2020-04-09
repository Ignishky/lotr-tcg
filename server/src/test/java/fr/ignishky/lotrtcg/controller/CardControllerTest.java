package fr.ignishky.lotrtcg.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static javax.servlet.http.HttpServletResponse.SC_OK;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class CardControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    void should_get_card_by_id() throws Exception {
        mvc.perform(get("/api/cards/1"))
                .andExpect(status().is(SC_OK))
                .andExpect(content().contentType(APPLICATION_JSON))
                .andExpect(content().json("{\"id\":\"1\", \"name\":\"Frodo\"}"));
    }
}