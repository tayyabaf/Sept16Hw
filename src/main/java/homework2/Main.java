package homework2;


//Sources: https://www.cs.utexas.edu/~nclement/aces/javaII/10-polymorphism-arraylists.html
// https://www.geeksforgeeks.org/constructors-in-java/?ref=lbp

import java.util.Scanner;
public class Main {


    //main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ask user how many pets they have. this is stored into integer numberOfPets
        System.out.println("How many pets do you have?");
        int numberOfPets = input.nextInt();
        input.skip(System.lineSeparator());

        //new object array of Pet class has the length of numberOfPets(whatever number the user said)
        Pet[] listOfPets = new Pet[numberOfPets];

        //create loop that asks for what type of pet the animal is. use if statements to check if it matches any of the child classes and make new objects from those child classes if true
        for (int i = 0; i < listOfPets.length; i++) {
            System.out.println("What type of pet is Pet #" + (i+1) + "?");
            String typeOfPet = input.nextLine();
            if (typeOfPet.equalsIgnoreCase("Dog")){
                listOfPets[i] = new Dog();
            }else if (typeOfPet.equalsIgnoreCase("Cat")){
                listOfPets[i] = new Cat();
            }else if (typeOfPet.equalsIgnoreCase("Bunny")) {
                listOfPets[i] = new Bunny();
            }else {
                listOfPets[i] = new Pet();
            }
        }
        //invoke the makeNoise method on all the elements of the object array
        for (int i = 0; i < listOfPets.length; i++){
            System.out.print("Pet #" + (i+1) +": ");
            listOfPets[i].makeNoise();
        }

    }
}
