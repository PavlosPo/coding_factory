package gr.aueb.cf.ch17.clonable;

import java.util.Objects;

public class Trainee implements Cloneable{
    private String name;
    private City city;

    public Trainee() {}

    public Trainee(String name, City city) {
        this.name = name;
        this.city = city;
    }

    public Trainee(Trainee trainee) {
        this.name = trainee.getName();
        this.city = new City(trainee.getName()); // Here is the immutability - Deep Copy
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "name='" + name + '\'' +
                ", city=" + city +
                '}';
    }

    @Override
    protected Trainee clone() throws CloneNotSupportedException {
//        return (Trainee) super.clone();
        Trainee trainee = (Trainee) super.clone();
        trainee.setCity(new City(this.getCity().getName()));
        return trainee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trainee trainee = (Trainee) o;

        return Objects.equals(getName(), trainee.getName()) && Objects.equals(getCity(), trainee.getCity());
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + getName().hashCode();
        result = 31 * result + getCity().hashCode();
        return result;
    }
}
