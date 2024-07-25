package constructors;

public class Student extends Person {
    private String name;
    private int age;
    private String studentNr;

    public Student(String name, int age) {
//        super(name);
        this(name, age, "1234");
//        this.age = age;
    }

    public Student(String name, int age, String studentNr) {
        super(name);
        this.age = age;
        this.studentNr = studentNr;

    }


    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        return this.age = age;
    }
}
