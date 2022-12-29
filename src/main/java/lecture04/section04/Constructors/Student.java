package lecture04.section04.Constructors;

/* In this example, the Student class has three instance variables: name, age, and GPA.
The constructor is a method that has the same name as the class and is used to create an instance of the class.
The constructor takes three parameters: name, age, and GPA, which are used to initialize the instance variables.
The keyword is used to distinguish between the instance variables and the parameters.
For example, this.name refers to the instance variable name, while name refers to the parameter.
The Student class also has getters and setters for each of the instance variables.
These are used to retrieve or update the value of the instance variables. */

public class Student {
    // instance variables
    private String name;
    private int age;
    private double GPA;

    // constructor
    public Student(String name, int age, double GPA) {
        this.name = name; // assign the value of the parameter to the instance variable
        this.age = age;
        this.GPA = GPA;
    }

    // getters and setters for the instance variables
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

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", GPA=" + GPA +
                '}';
    }
}
