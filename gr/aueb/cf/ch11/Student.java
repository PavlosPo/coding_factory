package gr.aueb.cf.ch11;

import java.util.Scanner;

/**
 * Definition of a simple Student class.
 * POJO (Plain Old Java Object)
 * Student Java Bean
 */
public class Student {
    // Initializing static instances ~ ανήκουν στην κλάση Students)
    private static int studentsCount = 0;
    static Scanner in = new Scanner(System.in);


    // Initializing block
    // Μπορούμε να έχουμε και κώδικα εδώ μέσα
    // και αυτή είναι η διαφορά με την αρχικοποίηση των static instances.
    static {
        int num = in.nextInt();
        studentsCount = (num == 1) ? 1 : 0;
    }


    private int id;
    private String firstname;
    private String lastname;

    public Student() {
        studentsCount++;
    }

    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        studentsCount++;
    }

    // Οι μέθοδο static ανήκουν στην κλάση και όχι στα objects που φτιάχνει η κλάση.
    // Άρα για να το πάρουμε Student.getStudentsCount() και όχι π.χ. alice.getStudentsCount().
    public static int getStudentsCount() {
        return studentsCount;
    }

    // Instance μέθοδος, άρα ανήκει στο αντικείμενο που φτιάχνει η κλάση.
    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
