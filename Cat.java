public class Cat {
    // Properties
    private String name;
    private int age;
    private String color;

    // Constructor
    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // Methods
    public void meow() {
        System.out.println(name + " says: Meow!");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Main method (for testing)
    public static void main(String[] args) {
        Cat myCat = new Cat("Whiskers", 3, "Gray");
        myCat.meow();
        myCat.sleep();
        myCat.eat();

        System.out.println("Name: " + myCat.getName());
        System.out.println("Age: " + myCat.getAge());
        System.out.println("Color: " + myCat.getColor());

        // You can also use setters to modify properties
        myCat.setName("Fluffy");
        System.out.println("New name: " + myCat.getName());
    }
}
