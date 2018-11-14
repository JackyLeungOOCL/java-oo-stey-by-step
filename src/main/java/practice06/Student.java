package practice06;

public class Student extends Person {
    private int classNum;

    public Student(String name, int age, int classNum) {
        super(name, age);
        this.classNum = classNum;
    }

    public int getKlass() {
        return this.classNum;
    }

    public String introduce() {
        return super.introduce() + " I am a Student. I am at Class " + this.classNum + ".";
    }
}