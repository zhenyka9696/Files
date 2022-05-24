package com.company;

import jakarta.xml.bind.annotation.*;

import java.util.List;
@XmlRootElement(name="person")
@XmlAccessorType(XmlAccessType.FIELD)
public class Person {
    private int id;
    private String name;

    @XmlElementWrapper(name="emails")
    @XmlElement(name="email")
    private List<String> emails;
    public  Person(){}

    public Person(int id, String name, List<String> emails) {
        this.id = id;
        this.name = name;
        this.emails = emails;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emails=" + emails +
                '}';
    }
}
