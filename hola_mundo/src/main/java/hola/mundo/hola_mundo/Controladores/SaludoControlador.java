package hola.mundo.hola_mundo.controladores;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hola.mundo.hola_mundo.dto.Saludo;

@RestController
public class SaludoControlador {

  private static final String template = "Hola, %s!";
  private final AtomicLong counter = new AtomicLong();

  @GetMapping("/greeting")
  public Saludo greeting(@RequestParam(defaultValue = "Mundo") String nombre) {
    return new Saludo(counter.incrementAndGet(), String.format(template, nombre));
  }

}
