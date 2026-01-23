package hola.mundo.hola_mundo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//Data Transfer Object(Objeto de transferencia de datos)
// Record que se devuelve en la petición REST como respuesta
@JsonIgnoreProperties(ignoreUnknown = true)
public record Respuesta(String type, Valor valor) { }
