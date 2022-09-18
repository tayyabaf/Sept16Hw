package homework3;

public class Bunny extends Pet {
//    public Bunny(String name, int age, String color) {
//        super(name, age, color);
//    }

    public void eatLunch(){
        System.out.println(getName()+ " eats carrots");
    }
    public void makeNoise() {
        System.out.println("Bunny is hissing");
    }
}