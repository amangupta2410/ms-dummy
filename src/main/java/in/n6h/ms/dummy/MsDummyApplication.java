package in.n6h.ms.dummy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsDummyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsDummyApplication.class, args);
    }

}
