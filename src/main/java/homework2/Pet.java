package homework2;


import java.util.Scanner;

public class Pet{
    //properties
    private String name;

    //scanner thing
    Scanner input = new Scanner(System.in);

//contructors

    public Pet() {
        setName();
    }

    public Pet(String name){
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

    public void makeNoise(){
        System.out.println(name + " is making noise");
    }


    }

