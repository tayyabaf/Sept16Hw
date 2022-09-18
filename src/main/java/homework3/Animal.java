package homework3;


//Make a method that accepts an array of animals
// and prints out what each animal eats!

import java.util.Scanner;
public class Animal {

    //properties
    private String name;

    //scanner thing
    Scanner input = new Scanner(System.in);


//contructors

    public Animal() {
        setName();
    }
    public Animal (String name){
        this.name = name;
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

    public void setName(String name){
        this.name = name;
    }


    //methods
    public void eatFood(){
        System.out.println(name+ " eats food");
    }

}
