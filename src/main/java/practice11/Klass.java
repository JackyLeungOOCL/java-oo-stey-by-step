package practice11;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int classNum;
    private Student leader;
    private List<Student> studentList;
    public Teacher teacher;

    public Klass(int classNum) {
        this.classNum = classNum;
        this.studentList = new ArrayList<Student>();
    }

    public int getNumber() {
        return this.classNum;
    }

    public String getDisplayName() {
        return "Class " + this.classNum;
    }

    public void appendMember(Student std) {
        studentList.add(std);
        if (this.teacher != null) {
            System.out.print("I am " + this.teacher.getName() + ". I know " + std.getName()+ " has joined " + getDisplayName() + ".\n");
        }
    }

    public void assignLeader(Student std) {
        if (studentList.contains(std)) {
            this.leader = std;
            if (this.teacher != null) {
                System.out.print("I am " + this.teacher.getName() + ". I know " + std.getName()+ " become Leader of " + getDisplayName() + ".\n");
            }
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() {
        return this.leader;
    }
}