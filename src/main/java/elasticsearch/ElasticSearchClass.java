package elasticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EntityScan(basePackages = "elasticsearch.**")
@EnableAsync
@EnableScheduling
public class ElasticSearchClass {
    public static void main(String[] args) {
        SpringApplication.run(ElasticSearchClass.class, args);
    }

}
