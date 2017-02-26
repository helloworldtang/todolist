package com.lpp.restful;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tangcheng on 2017/2/22.
 */
@RestController
public class DefaultController {
    @RequestMapping(value = "lpp", method = RequestMethod.GET)
    public ResponseEntity<String> returnHello() {
        return ResponseEntity.ok("Hello LPP");
    }

    @RequestMapping(value = "love", method = RequestMethod.GET)
    public ResponseEntity<String> lovePP() {
        return ResponseEntity.ok("Love lpp");
    }
}
