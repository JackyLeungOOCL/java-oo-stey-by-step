package practice11;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;

public class Teacher extends Person {
    private LinkedList<Klass> klassList = new LinkedList<>();

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klassList.add(klass);
        klass.teacher = this;
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> klasses) {
        super(id, name, age);
        for (Klass klass : klasses) {
            this.klassList.add(klass);
            klass.teacher = this;
        }
    }

    public Klass getKlass() {
        return this.klassList.get(0);
    }

    public LinkedList<Klass> getClasses() {
        return this.klassList;
    }

    public String introduce() {
        String intro;
        if (this.klassList.size() <= 0) {
            intro = super.introduce() + " I am a Teacher. I teach No Class";
        } else {
            intro = super.introduce() + " I am a Teacher. I teach Class ";
            for (int i = 0; i < this.klassList.size(); i++) {
                intro += this.klassList.get(i).getNumber();
                if (i < this.klassList.size()-1) {
                    intro += ", ";
                }
            }
        }
        intro += ".";
        return intro;
    }

    public String introduceWith(Student std) {
        if (isTeaching((std))) {
            return super.introduce() + " I am a Teacher. I teach " + std.getName() + ".";
        }
        return super.introduce() + " I am a Teacher. I don't teach " + std.getName() + ".";
    }

    public boolean isTeaching(Student std) {
        return this.klassList.contains(std.getKlass());
    }
}
