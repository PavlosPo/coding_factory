package gr.aueb.cf.ch16.functionalInterfaces;

public class StudentApp {

    public static void main(String[] args) {
        Student[] students = new Student[] {
            new Student(1, "Alice", "W."),
            new Student(2, "Bob", "D."),
            new Student(3, "C.", "A."),
            new Student(4, "Jim", "K.")
        };

        // We implement a class that implements an Interface named IDChecker!
        // sugar syntax
        // anonymous classes, instead of named.
        printStudents(students, new IDChecker() {
            @Override
            public boolean ckeckId(Student student) {
                return student.getId() >= 3;
            }
        });

        // Lambda expression ~ Implements the checkId in the second parameter.
        printStudents(students, (student) -> {return student.getId() <= 2;});

        // lesser example
        // we can change the parameter from student to st, its local variable.
        printStudents(students, (st) -> st.getId() <= 2);
    }

    // As a parameter we inject a method!! IDChecker
    // Call-back functions
    public static void printStudents(Student[] students, IDChecker checker) {
        for (Student student : students) {
            if (checker.ckeckId(student)) { // Predicate = boolean check
                System.out.println(student);
            }
        }
    }
}
