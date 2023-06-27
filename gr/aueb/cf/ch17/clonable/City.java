package gr.aueb.cf.ch17.clonable;

import java.util.Objects;

public class City implements Cloneable {
    private String name;

    public City() {}

    public City(String name) {
        this.name = name;
    }

    public City(City city) {
        this.name = city.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected City clone() throws CloneNotSupportedException {
        return (City) super.clone(); // Object.clone() - Shallow copy
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        City city = (City) other;
        return Objects.equals(getName(), city.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
