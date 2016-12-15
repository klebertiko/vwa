package org.sec.vwa.controller;

import org.apache.commons.io.IOUtils;
import org.sec.vwa.utils.ComandosUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kleber on 14/12/16.
 */
@RestController
public class OlaController {

    @Autowired
    private ComandosUtils comandosUtils;

    @RequestMapping(value = "/getOla", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    public String getOla() {
        //return "Olá Mundo";
        return "{{" +
                    "'a'.constructor.fromCharCode=[].join;\n" +
                    "'a'.constructor[0]='\\u003ciframe onload=alert(/Backdoored/)\\u003e';" +
                "}}";
    }

    @RequestMapping(value = "/postOla", method = RequestMethod.POST, produces = MediaType.TEXT_PLAIN_VALUE)
    public String postOla(@RequestBody String nome) {
        return "Olá " + nome;
    }

    @RequestMapping(value = "/criarArquivo", method = RequestMethod.POST, produces = MediaType.TEXT_PLAIN_VALUE)
    public String olaArquivo(@RequestBody String nome) throws IOException {
        List<String> lines = Arrays.asList("Olá " + nome + " o arquivo foi criado");
        Path file = Paths.get(nome+".txt");
        Files.write(file, lines, Charset.forName("UTF-8"));

        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file.toFile()), "UTF-8");
        return IOUtils.toString(inputStreamReader);
    }

    @RequestMapping(value = "/downloadArquivo", method = RequestMethod.GET)
    public String downloadArquivo() throws IOException {
        return "";
    }

    @RequestMapping(value = "/executarComando", method = RequestMethod.POST, produces = MediaType.TEXT_PLAIN_VALUE)
    public String executarComando(@RequestBody String comando) throws IOException {
        return this.comandosUtils.executarComando(comando);
    }
}
