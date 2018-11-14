package practice06;

public class Teacher extends Person {
    private int classNum = -1;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, int classNum) {
        super(name, age);
        this.classNum = classNum;
    }

    public int getKlass() {
        return this.classNum;
    }

    public String introduce() {
        if (this.classNum == -1) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
        return super.introduce() + " I am a Teacher. I teach Class " + this.classNum + ".";
    }
}
