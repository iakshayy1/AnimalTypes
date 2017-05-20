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
public abstract class ExtinctAnimals implements Animals{
    private String animalType;
    private int yearOfExtinct;
    
    public ExtinctAnimals(int yearOfExtinct,String animalType)
    {
        this.animalType=animalType;
        this.yearOfExtinct=yearOfExtinct;
    }

    public String getAnimalType() {
        return animalType;
    }
    
    public abstract String getFoodType();

    public int getYearOfExtinct() {
        return yearOfExtinct;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public void setYearOfExtinct(int yearOfExtinct) {
        this.yearOfExtinct = yearOfExtinct;
    }

    @Override
    public String toString() {
        return "ExtinctAnimals{" + "animalType=" + animalType + ", yearOfExtinct=" + yearOfExtinct + '}';
    }
    
    

   
    
    
    
    
}
