public class Cat extends Animal{

    Cat (String name, String breed, int age){
        super(name, breed, age);
    }
    @Override
    void speak() {
        System.out.println(this.name + " goes MEOW!");
    }
}
