package org.xproce.demoadvanced;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.xproce.demoadvanced.dao.entities.Product;
import org.xproce.demoadvanced.dao.repositories.CommandRepository;
import org.xproce.demoadvanced.dao.repositories.ProductRepository;
import org.xproce.demoadvanced.service.ProductManager;
import java.util.List;

@SpringBootApplication
public class DemoadvancedApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoadvancedApplication.class, args);
    }

    //@Bean
    public CommandLineRunner startDAO(ProductRepository productRepository) {
        return args -> {
            Product product = new Product();
            product.setName("PC");
            product.setDescription("msi i9 2to ssd");
            product.setPrice(2500.0);

            Product product1 = new Product();
            product1.setName("Ecran");
            product1.setDescription("Hp 165 hz refresh ... ");
            product1.setPrice(500.0);
            productRepository.saveAll(List.of(product1, product));
        };
    }

    //@Bean
    public CommandLineRunner startService(ProductManager productManager) {
        return args -> {
            Product product = new Product();
            product.setName("PC");
            product.setDescription("msi i9 2to ssd");
            product.setPrice(2500.0);


            Product product1 = new Product();
            product1.setName("Ecran");
            product1.setDescription("Hp 165 hz refresh ... ");
            product1.setPrice(500.0);
            productManager.addProduct(product);
            productManager.addProduct(product1);
        };
    }
}
