import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int userChoice;
        String askName;

        //My dogs
        Dog dog1 = new Dog("Penelope", "Cavalier", 2);
        Dog dog2 = new Dog("Dior", "Chihuahua", 5);

        //My cats
        Cat cat1 = new Cat("Steve", "Maine Coon", 4);
        Cat cat2 = new Cat("Max", "Birman", 6);

        //Storing them into an array
        Animal[]  animal = {dog1, dog2, cat1, cat2};

        //Using a "do" to make sure user is given prompt until they exit
        do {
            System.out.println();
            System.out.println("**************************************");
            System.out.println("Welcome to PetNLove!");
            System.out.println("**************************************");
            System.out.println("Option 1 - Show all animals");
            System.out.println("Option 2 - Make all animals speak");
            System.out.println("Option 3 - Show total animals");
            System.out.println("Option 4 - Search for an animal by name");
            System.out.println("Option 5 - Exit");
            System.out.print("Please type your destination (1, 2, 3...): ");
            userChoice = scanner.nextInt();
            scanner.nextLine();

            System.out.println();

            if (userChoice == 1) {
                for (Animal animals : animal) {
                    System.out.println("_________________________");
                    System.out.println(animals);
                }
            } else if (userChoice == 2) {
                for(Animal animals : animal) {
                    animals.speak();
                }
            } else if (userChoice == 3) {
                System.out.println("Total number of animals is: " + Animal.animalCounter);
            } else if (userChoice == 4) {
                System.out.print("Who are you looking for?: ");
                askName = scanner.nextLine();
                boolean found = false;
                for(Animal animals : animal) {
                    if(animals.getName().equalsIgnoreCase(askName)) {
                        System.out.println("Found! Here is " + animals);
                        found = true;
                    }
                } if(!found) {
                    System.out.println("Animal not found:(");
                }
            } else if (userChoice == 5) {
                System.out.println("Goodbye! Please tell your friends about us!!!");
            } else {
                System.out.println("Invalid choice, try again.");
                System.out.println();
            }
        } while (userChoice != 5);




        scanner.close();
    }
}