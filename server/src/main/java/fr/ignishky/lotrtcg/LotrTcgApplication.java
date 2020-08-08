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

        if (repository.findByNumber("01001") == null) {
            repository.save(new ACard().withNumber("01001").withTitle("The One ring"));
        }
        if (repository.findByNumber("01290") == null) {
            repository.save(new ACard().withNumber("01290").withTitle("Frodo"));
        }
        if (repository.findByNumber("01364") == null) {
            repository.save(new ACard().withNumber("01364").withTitle("Gandalf"));
        }
    }
}
