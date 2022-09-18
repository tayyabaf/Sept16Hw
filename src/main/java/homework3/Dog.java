package homework3;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    public void eatFood(){
        System.out.println(getName()+ " eats dog food");
    }

}