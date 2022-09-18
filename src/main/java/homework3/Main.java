package homework3;


import java.util.Scanner;
public class Main {

    //static method
    public static void letAnimalsEat() {
        Scanner input = new Scanner(System.in);
        //ask user how many pets they have. this is stored into integer numberOfPets
        System.out.println("How many pets do you have?");
        int numberOfPets = input.nextInt();
        input.skip(System.lineSeparator());

        //new object array of Pet class has the length of whatever number the user said
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
        //call the eatLunch method on all the elements of the object array
        for (int i = 0; i < listOfPets.length; i++){
            listOfPets[i].eatLunch();
        }


    }

    //main method
    public static void main(String[] args) {
        //call the static method
        letAnimalsEat();

//        System.out.println("How many pets do you have?");
//        int numberOfPets = input.nextInt();
//        input.skip(System.lineSeparator());
//
//        Pet[] listOfPets = new Pet[numberOfPets];
//
//
//        for (int i = 0; i < listOfPets.length; i++) {
//            System.out.println("What type of pet is Pet #" + (i+1) + "?");
//            String typeOfPet = input.nextLine();
//            if (typeOfPet.equalsIgnoreCase("Dog")){
//                listOfPets[i] = new Dog();
//            }else if (typeOfPet.equalsIgnoreCase("Cat")){
//                listOfPets[i] = new Cat();
//            }else if (typeOfPet.equalsIgnoreCase("Bunny")) {
//                listOfPets[i] = new Bunny();
//            }else {
//                listOfPets[i] = new Pet();
//            }
//        }
//
//        for (int i = 0; i < listOfPets.length; i++){
//                listOfPets[i].eatLunch();
//        }



//            System.out.println("Enter First Name");
////            listOfPets[i].setName(input.next());
//            System.out.println();
//            System.out.println("Enter Last Name");
//            listOfPets[i].setName(input.next());
//            System.out.println();

        //Pet myPet = new Pet();
        //myPet.giveDescription();
    }
}
