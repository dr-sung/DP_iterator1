
// participant: ConcreteIterator
// Note --> participant: Iterator (using java.util.Iterator)
import java.util.Iterator;

public class StudentIterator implements Iterator<Student> {

    private final Student[] goodStudents, badStudents;
    private int whichArray = 0; // good (0) or bad (1) Students array
    private int position = 0; // 'next' position to read

    public StudentIterator(Student[] goodStudents, Student[] badStudents) {
        this.goodStudents = goodStudents;
        this.badStudents = badStudents;
    }

    @Override
    public boolean hasNext() {
        if (position > 2 && whichArray == 1) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Student next() {
        if (!hasNext()) {
            return null;
        }
        Student returnValue =
                whichArray == 0 ? goodStudents[position] : badStudents[position];
        position++;
        if (position > 2 && whichArray == 0) {
            position = 0;
            whichArray = 1;
        }
        return returnValue;
    }

    @Override
    public void remove() {
        // this code is left for students ^_^
    }
}
