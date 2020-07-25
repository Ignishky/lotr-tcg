package fr.ignishky.lotrtcg;

import fr.ignishky.lotrtcg.repository.CardRepository;
import fr.ignishky.lotrtcg.repository.model.ACard;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class LotrTcgApplication  implements CommandLineRunner {

    @Autowired
    private CardRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(LotrTcgApplication.class, args);
    }

    @Override
    public void run(String... args) {

        repository.deleteAll();

        log.info("Save a couple of cards.");
        repository.save(new ACard().withNumber("01001").withTitle("The One ring"));
        repository.save(new ACard().withNumber("01290").withTitle("Frodo"));
        repository.save(new ACard().withNumber("01364").withTitle("Gandalf"));
    }
}
