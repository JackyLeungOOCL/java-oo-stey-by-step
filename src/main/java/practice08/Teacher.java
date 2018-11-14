package practice08;

public class Teacher extends Person {
    private Klass klass = null;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return this.klass;
    }

    public String introduce() {
        if (this.klass == null) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
        return super.introduce() + " I am a Teacher. I teach Class " + this.klass.getNumber() + ".";
    }

    public String introduceWith(Student std) {
        if (this.klass == std.getKlass()) {
            return super.introduce() + " I am a Teacher. I teach " + std.getName() + ".";
        }
        return super.introduce() + " I am a Teacher. I don't teach " + std.getName() + ".";
    }
}
