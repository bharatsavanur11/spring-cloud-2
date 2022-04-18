package gmbooking.gmbookingservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class GMBookingRest {

    private static Logger log = LoggerFactory.getLogger(GMBookingRest.class);


    @Value("${msg:Default}")
    private String msg;

    @GetMapping("/message")
    public String getMessage() {
        log.info("Enabling tracer and span id");
        return this.msg;
    }
}