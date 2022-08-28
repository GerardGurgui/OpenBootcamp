package clases;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        //Ejercicio 1
        ApplicationContext context = new  ClassPathXmlApplicationContext("beans.xml");
//        Saludo claseSaludo = (Saludo) context.getBean("Saludo");

//        claseSaludo.imprimirSaludo();

        //Ejerecicio 2
        UserService userService = (UserService) context.getBean("userService");
        userService.getNotificationService().saludarUser();




    }

}
