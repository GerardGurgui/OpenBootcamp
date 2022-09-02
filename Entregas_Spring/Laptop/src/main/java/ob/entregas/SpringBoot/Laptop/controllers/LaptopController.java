package ob.entregas.SpringBoot.Laptop.controllers;

import ob.entregas.SpringBoot.Laptop.clases.Laptop;
import ob.entregas.SpringBoot.Laptop.repositorys.LaptopRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LaptopController {

    private LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository laptopRepository){

        this.laptopRepository = laptopRepository;
    }

    //DEVOLVER LAPTOPS
    @GetMapping("ApiRest/Laptop/findAll")
    public List<Laptop> findAll(){

        return laptopRepository.findAll();

    }

    //GUARDAR OBJETO LAPTOP RECIBIDO DE EXTERIOR EN BDD
    @PostMapping("ApiRest/Laptop/createLaptop")
    public Laptop getAndSave(@RequestBody Laptop laptop){

        return laptopRepository.save(laptop);

    }



}
