
import java.util.Iterator;

// participant: ConcreteAggregate
// Note --> participant: Aggregate (using java.util.Iterable)
public class StudentAggregate implements Iterable<Student> {

    private final Student[] goodStudents;
    private final Student[] badStudents;
    
    public StudentAggregate() {
        // for a simple demo, the array size is limited to 3
        goodStudents = new Student[3];
        badStudents = new Student[3];
    }
    
    public void addGoodStudents(Student n1, Student n2, Student n3) {
        goodStudents[0] = n1;
        goodStudents[1] = n2;
        goodStudents[2] = n3;
        
    }
    
    public void addBadStudents(Student n1, Student n2, Student n3) {
        badStudents[0] = n1;
        badStudents[1] = n2;
        badStudents[2] = n3;
    }

    @Override
    public Iterator<Student> iterator() {
        StudentIterator studentIterator = new StudentIterator(goodStudents, badStudents);
        return studentIterator;
    }
}
