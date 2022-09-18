package homework3;


//Make a method that accepts an array of animals
// and prints out what each animal eats!

import java.util.Scanner;

public class Pet{
    //properties
    private String name;

    //scanner thing
    Scanner input = new Scanner(System.in);

//contructor

    public Pet() {
        setName();
    }

// setters & getters

    public String getName() {
        return name;
    }

    public void setName() {
        System.out.println("Enter name");
        name = input.nextLine();
        this.name = name;
    }


    //methods

    public void eatLunch(){
        System.out.println(name+ " eats food");
    }



}
