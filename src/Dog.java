public class Dog extends Animal{

    Dog (String name, String breed, int age){
        super(name, breed, age);
    }
    @Override
    void speak() {
        System.out.println(this.name + " goes BARK!");
    }
}
