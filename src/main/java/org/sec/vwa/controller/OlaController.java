package org.sec.vwa.controller;

import org.sec.vwa.model.Mensagem;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kleber on 14/12/16.
 */
@RestController
public class OlaController {

    @RequestMapping(value = "/getOla", method = RequestMethod.GET)
    public Mensagem getOla() {
        Mensagem mensagem = new Mensagem();
        mensagem.setMensagem("Olá");
        return mensagem;
    }

    @RequestMapping(value = "/postOla", method = RequestMethod.POST)
    public Mensagem postOla(@RequestBody String nome) {
        Mensagem mensagem = new Mensagem();
        mensagem.setNome(nome);
        mensagem.setMensagem("Olá");
        return mensagem;
    }

}
