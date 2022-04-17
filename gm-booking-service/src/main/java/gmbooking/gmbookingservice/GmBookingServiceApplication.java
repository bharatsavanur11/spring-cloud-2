package gmbooking.gmbookingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GmBookingServiceApplication {


    // for cloud config server we need to send bootstrap.properties only and then only it will work.
    public static void main(String[] args) {
        SpringApplication.run(GmBookingServiceApplication.class, args);
    }

}
