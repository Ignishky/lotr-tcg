package fr.ignishky.lotrtcg.repository;

import fr.ignishky.lotrtcg.repository.model.ACard;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends MongoRepository<ACard, String> {

    ACard findByNumber(String number);
}
