package in.n6h.ms.dummy.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Karanbir Singh on 5/21/2019.
 **/
@RestController
@RequestMapping("/dummy/v1/")
public class DummyControllerV1 {

    private Logger logger = LoggerFactory.getLogger(DummyControllerV1.class);

    @GetMapping("get")
    public String testGet(@RequestParam(required = false, defaultValue = "Hello World!") String message){
        return message;
    }

}
