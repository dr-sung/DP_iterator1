
// example: iterator design pattern
// (c) Dr. Hong K. Sung

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        StudentAggregate myStudents = new StudentAggregate();
        myStudents.addGoodStudents(
                new Student("good John"), 
                new Student("good Mary"), 
                new Student("good Kim")
        );
        myStudents.addBadStudents(
                new Student("bad John"), 
                new Student("bad Mary"), 
                new Student("bad Kim")
        );

        Iterator iterator = myStudents.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        System.out.println("---------------------");
        Iterator anotherOne = myStudents.iterator();
        System.out.println(anotherOne.next());

    }
}
