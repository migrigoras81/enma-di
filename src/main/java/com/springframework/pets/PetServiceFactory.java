/**
 * 
 */
package com.springframework.pets;

import org.springframework.stereotype.Service;

/**
 * Created by Marius I. Grigoras
 * 
 * on 31/10/2023
 */
public class PetServiceFactory {

	public PetService getPetService(String petType) {
		switch (petType) {
		case "dog": {
			return new DogPetService();
		}
		case "cat":
			return new CatPetService();
		default:
			return new DogPetService();
		}
	}
}
