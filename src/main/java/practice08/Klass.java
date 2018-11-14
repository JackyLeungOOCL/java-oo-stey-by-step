package practice08;

public class Klass {
    private int classNum;
    private Student leader;

    public Klass(int classNum) {
        this.classNum = classNum;
    }

    public int getNumber() {
        return this.classNum;
    }

    public String getDisplayName() {
        return "Class " + this.classNum;
    }

    public void assignLeader(Student std) {
        this.leader = std;
    }

    public Student getLeader() {
        return this.leader;
    }
}