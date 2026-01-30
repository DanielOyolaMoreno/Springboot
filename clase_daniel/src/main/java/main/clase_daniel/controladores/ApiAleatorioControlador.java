package main.clase_daniel.controladores;

import main.clase_daniel.dto.Respuesta;
import main.clase_daniel.dto.Valor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Random;

@RestController
public class ApiAleatorioControlador {

    @GetMapping("/api/random")
    public Respuesta randomQuote() {
        int id = new Random().nextInt(100);
        return new Respuesta("success", new Valor(id, "Really loving Spring Boot, makes stand alone Spring apps easy."));
    }

}
