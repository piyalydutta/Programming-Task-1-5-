class PersonalDetails {
    private String name;
    private int age;

    PersonalDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display() {
        System.out.println(name + " is " + age + " years old.");
    }

    public static void main(String[] args) {
        PersonalDetails person1 = new PersonalDetails("Noah Green", 10);
        PersonalDetails person2 = new PersonalDetails("Mason Reed", 13);

        person1.display();
        person2.display();

        System.out.println("\nSet the new name and age:");

        person1.setAge(15);
        person2.setName("Liam Brooks");

        person1.display();
        person2.display();
    }
}
