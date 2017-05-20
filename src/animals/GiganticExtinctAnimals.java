/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

/**
 *
 * @author Akshay Reddy Vontari
 */
public class GiganticExtinctAnimals extends ExtinctAnimals {

    public GiganticExtinctAnimals(int yearOfExtinct, String animalType) {
        super(yearOfExtinct, animalType);
    }

    @Override
    public int getNumberOfLegs() {
        return NUMBER_OF_LEGS;
    }
    
    
    @Override
    public String getFoodType()
    {
        if(super.getAnimalType().equalsIgnoreCase("Brachiosaurus"))
        {
            return "Plant Eater(Herbivores)";
        }
        else if(super.getAnimalType().equalsIgnoreCase("Baryonyx"))
        {
            return "Meat-eaters (carnivores or theropods)" ;
        }
        else
        {
            return "omnivores (eating both plants and animals)";
        }
    }

    
    
    
}
