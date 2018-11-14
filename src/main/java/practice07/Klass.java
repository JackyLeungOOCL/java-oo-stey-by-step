package practice07;

public class Klass {
    private int classNum;

    public Klass(int classNum) {
        this.classNum = classNum;
    }

    public int getNumber() {
        return this.classNum;
    }

    public String getDisplayName() {
        return "Class " + this.classNum;
    }
}
