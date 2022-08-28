package entregas.Interfaces;

public class CocheCRUDImpl implements CocheCRUD{

    private String marca;
    private String modelo;

    public CocheCRUDImpl(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }


    @Override
    public void save() {

        System.out.println("Save");

    }

    @Override
    public void findAll() {

        System.out.println("Find all");
    }

    @Override
    public void delete() {

        System.out.println("Delete");

    }
}
