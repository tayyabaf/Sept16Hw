package homework3;

public class Bunny extends Animal {

    public Bunny() {
    }

    public Bunny(String name) {
        super(name);
    }

    public void eatFood(){
        System.out.println(getName()+ " eats carrots");
    }

}