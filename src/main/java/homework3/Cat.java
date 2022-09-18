package homework3;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    public void eatLunch(){
        System.out.println(getName()+ " eats mice");
    }

}
