/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

/**
 *
 * @author Akshay Reddy vontari
 */
public interface WildAnimals extends Animals {
    default String getAnimalSound(String animal)
    {
        if(animal.equalsIgnoreCase("Lion"))
        {
            return  "Roar";
        }
        else if(animal.equalsIgnoreCase("Tiger"))
        {
            return "Grrr";
        }
         return "Wild Animal Not Found";
    }
    
    
}
