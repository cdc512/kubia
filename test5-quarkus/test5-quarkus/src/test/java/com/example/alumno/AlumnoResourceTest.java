package com.example.alumno;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class AlumnoResourceTest {
    @Test
    void testHelloEndpoint() {
        given()
          .when().get("/alumnos/obtener")
          .then()
             .statusCode(200)
             .body(is("¡Bienvenido a la aplicacion de gestion de alumnos!"));
    }

}
