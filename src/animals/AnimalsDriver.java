/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Akshay Reddy Vontari
 */
public class AnimalsDriver {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("input.txt"));
        
        while(sc.hasNextLine())
        {
            String dw = sc.nextLine();
            if(dw.equalsIgnoreCase("DomesticAndWildAnimal"))
            {
                String ani = sc.nextLine();
                String bc = sc.nextLine();
                String mam = sc.nextLine();
                Boolean mamm = Boolean.parseBoolean(mam);
                
                DomesticAndWildAnimals a = new DomesticAndWildAnimals(bc,mamm);
                System.out.println("This Animal is called as: "+ani);
                System.out.println("Number of legs for this Animal: "+a.getNumberOfLegs());
                System.out.println("This animal sounds: "+a.getAnimalSound(ani));
                System.out.println("This animal skin type is: "+a.getBodyCovered());
                if(ani.equalsIgnoreCase("pig"))
                {
                    System.out.println("Explanation 1.The default method in DomesticatedAnimals is called because the method getAnimalSound in DomesticAndWildAnimals calls from interface DomesticatedAnimals(DomesticatedAnimals.super.getAnimalSound(animal)).");
                    System.out.println("Explanation 2.The one of way resolving is by using overriding method which overrides the superclass method in subclass.");
                    System.out.println("Explanation 3.The other of way of resolving is by calling method explicitly using interfaceName.super.MethodName in a class");
                }
                else
                {
                    System.out.println("Explanation 1.The default method in DomesticatedAnimals is called because the method getAnimalSound in DomesticAndWildAnimals calls from interface DomesticatedAnimals(DomesticatedAnimals.super.getAnimalSound(animal)).");
                    System.out.println("Explanation 2.By using overriding method which overrides the superclass method in subclass.");
                }
                
            }
            
                
                else if(dw.equalsIgnoreCase("ExtinctAnimal"))   
                        {
                        String exAni = sc.nextLine();
                        String yer = sc.nextLine();
                        int year = Integer.parseInt(yer);
                        String aniTy = sc.nextLine();
                        
                        ExtinctAnimals b = new GiganticExtinctAnimals(year,aniTy);
                            System.out.println("Name of Extinct Animal: "+exAni);
                            System.out.println("Food type of this Animal: "+b.getFoodType());
                            System.out.println("Year of Extinct: "+b.getYearOfExtinct());
                            System.out.println("Explanation 4.We cannot instantiate the abstract class directly whereas we can achieve this by polymorphic substitution  ");
                        }
                else if(dw.equalsIgnoreCase("GiganticExtinctAnimal"))
                {
                    String GexAni = sc.nextLine();
                    String yr =sc.nextLine();
                    int year1 = Integer.parseInt(yr);
                    String name = sc.nextLine();
                    
                    GiganticExtinctAnimals c = new GiganticExtinctAnimals(year1,name);
                    System.out.println("Type of Gigantic Extinct Animal: "+GexAni);
                    System.out.println("Name of Extinct Animal: "+c.getAnimalType());
                    System.out.println("Food type of this Animal: "+c.getFoodType());
                    System.out.println("Year of Extinct: "+c.getYearOfExtinct());
                    System.out.println("Explanation 5. It is not compulsory for an abstract class to have an abstract method");
                    System.out.println("Explanation 6.A class can implement more than one interface and A class cannot extends more than one class because it doesn't support multiple inheritance instead of that we use interface.  ");
                }
            
        }
        
    }
}
    

