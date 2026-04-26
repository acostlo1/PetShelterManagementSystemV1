public class Animal {

     String name;
     String breed;
     int age;

     //Counting the amount of times an animal object is created
     static int animalCounter = 0;

     //constructor for animal
     Animal (String name, String breed, int age) {
         animalCounter++;
           this.name = name;
           this.breed = breed;
           this.age = age;
     }
     //default speak if not overridden  by other classes
     void speak(){
          System.out.println("This animal speaks!");
     }
     //rather than returning a memory address when calling animal, you get the actual output
     @Override
     public String toString() {
          return "Name: " + this.name + " | Breed: " + this.breed + " | Age: " + this.age;
     }

    public String getName() {
         return this.name;
    }
}
