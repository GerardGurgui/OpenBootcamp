package entregas.Interfaces;

public class Main {

    public static void main(String[] args) {


        CocheCRUDImpl coche = new CocheCRUDImpl("Seat", "leon");

        coche.save();
        coche.findAll();
        coche.delete();

    }
}
