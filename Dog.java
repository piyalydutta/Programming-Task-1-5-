public class Dog {
    private String name;
    private String breed;

    // Constructor
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    // Main method
    public static void main(String[] args) {
        Dog dog1 = new Dog("Max", "Labrador");
        Dog dog2 = new Dog("Buddy", "Beagle");

        // Update attributes
        dog1.setName("Charlie");
        dog1.setBreed("Golden Retriever");

        dog2.setName("Rocky");
        dog2.setBreed("German Shepherd");

        System.out.println("Dog 1: Name = " + dog1.getName() + ", Breed = " + dog1.getBreed());
        System.out.println("Dog 2: Name = " + dog2.getName() + ", Breed = " + dog2.getBreed());
    }
}
