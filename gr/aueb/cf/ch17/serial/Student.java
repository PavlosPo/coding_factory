package gr.aueb.cf.ch17.serial;

import java.io.Serializable;

public class Student implements Serializable {
    private final static long serialVersionUID = 1;
    private int id;
    private String firstname;
    private String lastname;

    public Student() {}

    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (getId() != student.getId()) return false;
        if (getFirstname() != null ? !getFirstname().equals(student.getFirstname()) : student.getFirstname() != null)
            return false;
        return getLastname() != null ? getLastname().equals(student.getLastname()) : student.getLastname() == null;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getFirstname() != null ? getFirstname().hashCode() : 0);
        result = 31 * result + (getLastname() != null ? getLastname().hashCode() : 0);
        return result;
    }
}
