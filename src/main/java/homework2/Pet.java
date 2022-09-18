package homework2;


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

    public void makeNoise(){
        System.out.println(name + " is making noise");
    }


    }

