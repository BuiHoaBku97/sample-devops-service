package startup.vn.sampleservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import startup.vn.sampleservice.models.Product;
import startup.vn.sampleservice.repositories.ProductRepository;

@SpringBootApplication
public class SampleServiceApplication {

    @Autowired
    private static ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(SampleServiceApplication.class, args);

        if (productRepository.findAll().isEmpty()) {
            productRepository.save(new Product(0L,"Sample Product", "This is a sample product.", 0.0));
        }
    }

}
