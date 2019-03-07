/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animalia;

import java.io.Serializable;

/**
 *
 * @author Leonardo Leite, Artur Bani
 */
public abstract class Animal implements Serializable{
    private static final long serialVersionUID = 1L;

    protected String species;
    protected String gender;
    protected String name;
    
    public Animal(String species, String gender, String name) {
        this.species = species;
        this.gender = gender;
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

    