package com.example.Ejercicio3SpringDatajpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Coche {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String color;
    private Integer year;

    public Coche() {
    }

    public Coche(Long id, String marca, String color, Integer year) {
        this.id = id;
        this.marca = marca;
        this.color = color;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}
