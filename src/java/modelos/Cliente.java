/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 *
 * @author jefferson
 */
@Entity
public class Cliente extends Pessoa {
    
    @OneToOne
    private Animal animal;

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
