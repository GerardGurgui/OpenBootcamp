package maps;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Gerard","4340291Y",30);
        Persona persona2 = new Persona("Pepe","483425Y",40);
        Persona persona3 = new Persona("Lalu","343543h",24);

        Map<Integer,Persona> personasMap = new HashMap<>();

        personasMap.put(1,persona1);
        personasMap.put(2,persona2);
        personasMap.put(3,persona3);


        System.out.println(personasMap);

        //Print keys

        for (Integer keys: personasMap.keySet()){

            System.out.println(keys);

        }

        //print values

        for (Persona values: personasMap.values()){

            System.out.println(values);
        }

        System.out.println("----Complete List Entry Set-----");

        //Hashmap completo

        for (Map.Entry<Integer,Persona> completeList: personasMap.entrySet()){

            System.out.println(completeList);

        }

        for (Map.Entry<Integer,Persona> completeList: personasMap.entrySet()){

            System.out.println(completeList.getKey()+ "-" +completeList.getValue() );

        }




    }
}
