package gmbooking.gmbookingservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class GMBookingRest {

    @Value("${msg:Default}")
    private String msg;

    @GetMapping("/message")
    public String getMessage() {
        return this.msg;
    }
}