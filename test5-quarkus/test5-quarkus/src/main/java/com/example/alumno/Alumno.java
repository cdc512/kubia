package com.example.alumno;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RegisterForReflection // Esto es necesario para que Quarkus pueda serializar/deserializar objetos con Lombok
public class Alumno {
    private String nombre;
    private String edad;
    private String materia;
    private String calificacion;
}

