package hola.mundo.hola_mundo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// Record para representar el valor en la petición REST
@JsonIgnoreProperties(ignoreUnknown = true)
public record Valor(Integer id, String quote) { }
