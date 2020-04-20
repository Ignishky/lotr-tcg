package fr.ignishky.lotrtcg.repository.model;

import lombok.RequiredArgsConstructor;
import lombok.Value;
import lombok.With;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Value
@With
@Document("cards")
@RequiredArgsConstructor
public class ACard {

    @Id
    String id;
    String number;
    String title;

    public ACard() {
        this(null, null, null);
    }
}
