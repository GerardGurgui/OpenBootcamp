package entregas;

import java.io.*;
import java.util.*;

public class App {

    public static void main(String[] args) {

        //1- texto invertido
        System.out.println("---- 1: Texto invertido------");

        String texto = pedirTexto("Introduzca un texto");
        String resultado = reverse(texto);

        System.out.println("texto: " +texto);
        System.out.println("Texto invertido: " +resultado);

        //2-Array Unidimensional
        System.out.println("---- 2: Recorrer Array unidimensional------");
        recorrerUniDimensional();

        //3-Array Bidimensional
        System.out.println("---- 3: Recorrer Array bidimensional------");
        recorrerBiDimensional();

        //4- Eliminar elementos vector
        System.out.println("---- 4: Elimnar elementos de un array------");
        eliminarElementos();

        //5-

        //6-ArrayList to LinkedList
        System.out.println("---- 7: ArrayList to LinkedList------");
        copiarListas();

        //7-Recorrer y eliminar pares
        System.out.println("---- 7: Recorrer array y eliminar pares-----");
        recorrerYeliminar();

        //8-Función dividePorCero
        System.out.println("---- 8: Función divide por cero con throws-----");
        int resultadoDiv = dividePorCero();

        //9- FileIn FileOut
        System.out.println("----9: Función recibe un fichero y lo copia en otro");

        String textoFichero = leerFichero();
        escribirFichero(textoFichero);


    }

    //1- texto invertido

    public static String reverse(String texto) {

        String resultado = " ";

        for (String reccorreTexto : texto.split(" ")) {

            resultado += new StringBuilder(reccorreTexto).reverse() + " ";

        }

        return resultado;
    }

    //2-Array Unidimensional

    public static void recorrerUniDimensional() {

        String[] arrayUni = new String[4];

        arrayUni[0] = "Roberto";
        arrayUni[1] = "Laura";
        arrayUni[2] = "Marc";
        arrayUni[3] = "Manuel";


        for (String recorrerArray : arrayUni) {

            System.out.println(recorrerArray);

        }

    }

    //3-Array Bidimensional

    public static void recorrerBiDimensional() {


        int[][] matriz1 = new int[4][3];

        //INTRODUCIR DATOS EN EL ARRAY

        for (int i = 0; i < 4; i++)  //I para filas, 4
        {
            for (int j = 0; j < 3; j++)  //J para las columnas, 3
            {
                do {
                    System.out.print("valor para la fila " + (i + 1) + " y columna " + (j + 1) + ":");
                    matriz1[i][j] = pedirNumero(" ");
                } while ((matriz1[i][j] < 0) || (matriz1[i][j] > 10));
            }
        }

        //MOSTRAR DATOS INTRODUCIDOS

        for (int i = 0; i < 4; i++)  //I para filas, 4
        {
            for (int j = 0; j < 3; j++)  //J para las columnas, 3
            {
                System.out.print(matriz1[i][j] + " ");

            }
            System.out.println(); // SEGUNDO PRINT PARA MOSTRAR LA MATRIZ POR COLUMNAS Y FILAS
        }

    }

    //4- Eliminar elementos vector

    public static void eliminarElementos() {

        List<String> listaNombres = new ArrayList<>();

        listaNombres.add("Laura");
        listaNombres.add("Pepe");
        listaNombres.add("Marc");
        listaNombres.add("Jose");
        listaNombres.add("Edu");

        System.out.println("--Lista completa:");
        for (String listaCompleta : listaNombres) {

            System.out.println(listaCompleta);

        }

        listaNombres.remove(1);
        listaNombres.remove("Marc");

        System.out.println("Lista con nombres eliminados: ");
        for (String listaNombresEliminados : listaNombres) {

            System.out.println(listaNombresEliminados);

        }

    }

    //6-ArrayList to LinkedList

    public static void copiarListas() {

        List<String> nombres = new ArrayList<>();

        nombres.add("Laura");
        nombres.add("Pepe");
        nombres.add("Marc");
        nombres.add("Alba");

        System.out.println("--Lista desde ArrayList");

        for (String listaArray : nombres) {

            System.out.println(listaArray);

        }

        System.out.println("--Lista desde linked");
        List<String> nombresLinked = new LinkedList<>(nombres);

        for (String listaLinked : nombresLinked) {

            System.out.println(listaLinked);

        }


    }

    //7-Recorrer y eliminar pares

    public static void recorrerYeliminar() {

        List<Integer> listaNumeros = new ArrayList<>();

        int j = 0;

        System.out.println("Lista completa");
        for (int i = 0; i < 10; i++) {

            listaNumeros.add(j++);
            System.out.println(listaNumeros.get(i));

        }

        System.out.println("Lista solo impares");

        for (int i = 0; i < listaNumeros.size(); i++) {

            if (listaNumeros.get(i) % 2 == 0) {

                listaNumeros.remove(i);

            }

            System.out.println(listaNumeros.get(i));

        }
    }


    //8-Función divide por cero

    public static int dividePorCero() throws ArithmeticException {

        int num = 14;
        int resultado;

        try {
            resultado = num / 0;

        } catch (ArithmeticException e) {

            throw new ArithmeticException("esto no puede hacerse");

        } finally {
            System.out.println("Demo de código");
        }

        return resultado;

    }

    //9- FileIn FileOut

    public static String leerFichero() {

        File fichero = new File("C:\\Users\\gerri\\OneDrive\\Escritorio\\fileIn.txt");
        FileReader fr = null;
        BufferedReader br;

        String contenido = "";
        String temp = "";
        String texto;

        try {

            fr = new FileReader(fichero);
            br = new BufferedReader(fr);

            while ((texto = br.readLine()) != null) {

                temp = temp + texto;

            }

            contenido = temp;

        } catch (FileNotFoundException e) {

            System.out.println("No existe el fichero");

        } catch (IOException e3) {

            throw new RuntimeException(e3);

        } finally {

            try {

                if (null != fr) {

                    fr.close();
                }


            } catch (Exception e4) {

                e4.printStackTrace();

            }

        }

        return contenido;

    }

    public static void escribirFichero(String contenido){

        PrintWriter pw = null;

        try {

            pw = new PrintWriter("fileOut.txt", "UTF-8");
            pw.println(contenido);
            pw.close();
            System.out.println("Archivo creado correctamente");

        }catch (FileNotFoundException e){

            e.printStackTrace();

        }catch (Exception e2){

            e2.printStackTrace();

        }

        finally {

            if (pw != null){

                pw.close();
            }
        }

    }


    public static int pedirNumero(String missatge) {

        Scanner input = new Scanner(System.in);

        int valor = 0;
        boolean capturaError = false;

        do {

            try {

                System.out.println(missatge);
                valor = input.nextInt();
                capturaError = true;

            } catch (InputMismatchException e) {

                System.out.println("Error de format, has d'introduir un número enter");

            }

            input.nextLine();

        } while (!capturaError);

        return valor;

    }


    public static String pedirTexto(String missatge) {

        Scanner input = new Scanner(System.in);

        String cadena = "";


        System.out.println(missatge);
        cadena = input.nextLine();


        return cadena;

    }
}
