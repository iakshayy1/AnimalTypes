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
public interface DomesticatedAnimals extends Animals{
    
    default String getAnimalSound(String animal){
        if("Dog".equalsIgnoreCase(animal))
        {
            return "bow-wow";
        }else if("Cat".equalsIgnoreCase(animal))
        {
            return "Meow";
        }
        else
        {
            return "Domestic Animal Not Found";
        }
        
    }
    
    
}
