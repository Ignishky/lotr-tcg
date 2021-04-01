package fr.ignishky.lotrtcg.repository.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Value;
import lombok.With;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@With
@Value
@Document("cards")
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class ACard {
    @Id
    String id;
    String number;
    String title;
}
