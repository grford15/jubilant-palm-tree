package payroll;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Employee("Bilbo", "Baggins", "Burglar")));
            log.info("Preloading " + repository.save(new Employee("Fred", "Flintstone", "Miner")));
            log.info("Preloading " + repository.save(new Employee("Scooby", "Doo", "Detective")));
            log.info("Preloading " + repository.save(new Employee("Rick", "Sanchez", "Scientist")));
            log.info("Preloading " + repository.save(new Employee("Bruce", "Wayne", "Millionaire")));
        };
    }
}
