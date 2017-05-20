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
public class DomesticAndWildAnimals implements  DomesticatedAnimals, WildAnimals{
    private String bodyCovered;
    private boolean mammal;

    public DomesticAndWildAnimals(String bodyCovered, boolean mammal) {
        this.bodyCovered = bodyCovered;
        this.mammal = mammal;
    }

    public String getBodyCovered() {
        return bodyCovered;
    }

    public boolean isMammal() {
        return mammal;
    }

    public void setBodyCovered(String bodyCovered) {
        this.bodyCovered = bodyCovered;
    }

    public void setMammal(boolean mammal) {
        this.mammal = mammal;
    }
    
    @Override
    public int getNumberOfLegs(){
        return NUMBER_OF_LEGS;
    }
    @Override
    public String getAnimalSound(String animal){
      return DomesticatedAnimals.super.getAnimalSound(animal);
    }

    @Override
    public String toString() {
        return "DomesticAndWildAnimals{" + "bodyCovered=" + bodyCovered + ", mammal=" + mammal + '}';
    }
    
    
}
