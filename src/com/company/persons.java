package com.company;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;
@XmlRootElement(name="persons")
@XmlAccessorType(XmlAccessType.FIELD)
public class persons {
    @XmlElement(name="person")
    private List<Person> persons=new ArrayList<>();

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
    public void add(Person person){
        persons.add(person);
    }
}
