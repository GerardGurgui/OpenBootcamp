package com.example.obSpringData;

import javax.persistence.*;

@Entity
@Table(name = "Coche")
public class Coche {

    @Id
    @Column(name = "identifier")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer identifier;

    @Column(name = "manu")
    private String manufacturerP;

    @Column(name = "model")
    private String modelP;

    @Column(name = "anyo")
    private Integer anyo;

    public Coche() {
    }

    public Coche(Integer identifier, String manufacturerP, String modelP, Integer anyo) {
        this.identifier = identifier;
        this.manufacturerP = manufacturerP;
        this.modelP = modelP;
        this.anyo = anyo;
    }

    public Integer getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Integer identifier) {
        this.identifier = identifier;
    }

    public String getManufacturerP() {
        return manufacturerP;
    }

    public void setManufacturerP(String manufacturerP) {
        this.manufacturerP = manufacturerP;
    }

    public String getModelP() {
        return modelP;
    }

    public void setModelP(String modelP) {
        this.modelP = modelP;
    }

    public Integer getAnyo() {
        return anyo;
    }

    public void setAnyo(Integer anyo) {
        this.anyo = anyo;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "id=" + identifier +
                ", manufacturer='" + manufacturerP + '\'' +
                ", model='" + modelP + '\'' +
                ", year=" + anyo +
                '}';
    }
}
