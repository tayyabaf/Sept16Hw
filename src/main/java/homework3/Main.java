package homework3;


import java.util.Scanner;
public class Main {

    //static method
    public static void letAnimalsEat() {
        Scanner input = new Scanner(System.in);


        //ask user how many animals they want to feed. this is stored into integer numberOfAnimals
        System.out.println("How many animals would you like to feed?");
        int numberOfAnimals = input.nextInt();
        input.skip(System.lineSeparator());

        //new object array of Animal class has the length of whatever number the user said
        Animal[] listOfAnimals = new Animal[numberOfAnimals];

        //create loop that asks for what type of pet the animal is. use if statements to check if it matches any of the child classes and make new objects from those child classes if true
        for (int i = 0; i < listOfAnimals.length; i++) {
            System.out.println("What type of animal is Animal #" + (i+1) + "?");
            String typeOfPet = input.nextLine();
            if (typeOfPet.equalsIgnoreCase("Dog")){
                listOfAnimals[i] = new Dog();
            }else if (typeOfPet.equalsIgnoreCase("Cat")){
                listOfAnimals[i] = new Cat();
            }else if (typeOfPet.equalsIgnoreCase("Bunny")) {
                listOfAnimals[i] = new Bunny();
            }else {
                listOfAnimals[i] = new Animal();
            }
        }



        //call the eatFood method on all the elements of the object array
        for (int i = 0; i < listOfAnimals.length; i++){
            System.out.print("Animal #" + (i+1) +": ");
            listOfAnimals[i].eatFood();
        }


    }

    //main method
    public static void main(String[] args) {
        //call the static method
        letAnimalsEat();

    }
}
