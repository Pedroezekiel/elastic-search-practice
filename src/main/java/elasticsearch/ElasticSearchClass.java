package elasticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "elasticsearch.**")
public class ElasticSearchClass {
    public static void main(String[] args) {
        SpringApplication.run(ElasticSearchClass.class, args);

    }
}
