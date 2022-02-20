package app.web.pavelk.batabase9.command;


import app.web.pavelk.batabase9.schema.Customer;
import app.web.pavelk.batabase9.schema.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Scanner;

@Component
@Slf4j
public class CustomRunner {

    @Autowired
    private Map<String, CommandUse> map;

    @Bean
    ApplicationRunner runner() {
        Scanner scanner = new Scanner(System.in);
        CommandUse customerMapper = map.get("customerMapper");
        CommandUse productMapper = map.get("productMapper");
        return args -> {
            while (true) {
                String next = scanner.next();
                if (next.equals("q"))
                    break;
                CommandTwo command = CommandTwo.valueOf(next.toUpperCase());
                switch (command) {
                    case I -> {
                        var c = new Customer(1, "JL", "jl@email.com");
                        var p = new Product(1, "JL", 10);
                        customerMapper.insert(c);
                        productMapper.insert(p);
                        log.info(String.valueOf(c));
                        log.info(String.valueOf(p));
                    }
                    case D -> {
                        Integer c = customerMapper.deleteById(1);
                        Integer p = productMapper.deleteById(1);
                        log.info(String.valueOf(c));
                        log.info(String.valueOf(p));
                    }
                    case F -> {
                        var c = customerMapper.findById(1);
                        var p = productMapper.findById(1);
                        log.info(String.valueOf(c));
                        log.info(String.valueOf(p));
                    }
                }
            }
        };
    }

}
