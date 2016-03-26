package com.test.basic.chapter5;

/**
 * Created by beigui on 2016/3/26.
 */
public class Person {
    private double id;

    public Person(double id) {
        this.id = id;
    }

    public Person() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return Double.compare(person.id, id) == 0;

    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(id);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}
