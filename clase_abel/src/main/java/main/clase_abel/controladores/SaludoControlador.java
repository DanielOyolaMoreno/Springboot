package main.clase_abel.controladores;

import java.util.concurrent.atomic.AtomicLong;

import main.clase_abel.dto.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SaludoControlador {

  private static final String template = "Hola, %s!";
  private final AtomicLong counter = new AtomicLong();

  @GetMapping("/greeting")
  public Greeting greeting(@RequestParam(defaultValue = "Mundo") String nombre) {
    return new Greeting(counter.incrementAndGet(), String.format(template, nombre));
  }

}
