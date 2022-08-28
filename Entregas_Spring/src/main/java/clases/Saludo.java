package clases;

import org.springframework.stereotype.Component;

@Component
public class Saludo {

    public Saludo() {

        System.out.println("entro constructor saludo");
    }

    public void imprimirSaludo(){

        System.out.println("Hola mundo desde Spring");

    }

}
