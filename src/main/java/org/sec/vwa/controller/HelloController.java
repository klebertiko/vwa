package org.sec.vwa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kleber on 14/12/16.
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public Map<String, String> hello() {
        Map bosta = new HashMap();
        bosta.put("Comida", "Na lata");
        return bosta;
    }

}
