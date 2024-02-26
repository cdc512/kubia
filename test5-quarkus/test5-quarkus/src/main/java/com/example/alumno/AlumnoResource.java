package com.example.alumno;

import org.jboss.logging.Logger;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.core.MediaType;

@Path("/alumnos")
public class AlumnoResource {
    private static final Logger LOG = Logger.getLogger(AlumnoResource.class);
    
    @Path("/obtener")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello2() {
        LOG.infof("¡Bienvenido a la aplicacion de gestion de alumnos!");
        return "¡Bienvenido a la aplicacion de gestion de alumnos!";
    }
    
    @Path("/insertar")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addAlumno(Alumno alumno) {
	long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
	String requestBody = "{\"nombre\": \"" + alumno.getNombre() + "\", \"edad\": " + alumno.getEdad() +
                ", \"materia\": \"" + alumno.getMateria() + "\", \"calificacion\": " + alumno.getCalificacion() +
                ", \"elapsedTime\": " + elapsedTime + "}";

//LOG.infof("Timestamp: %d - Petición: %s", System.currentTimeMillis(), requestBody);
	LOG.infof(requestBody);
    }
}
