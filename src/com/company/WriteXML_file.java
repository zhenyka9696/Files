package com.company;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;


import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WriteXML_file {
    public static void main(String[] args) {
        Person person = new Person(1, "John", Arrays.asList("John@gmail.com","John@yndex.ru"));
        Person person2 = new Person(2, "Jahn", Arrays.asList("Jahn@gmail.com","Jahn@yndex.ru"));
        List<Person> personsList = new ArrayList<>();
        personsList.add(person);
        personsList.add(person2);

        persons persons = new persons();
        persons.setPersons(personsList);
        JAXBContext jaxbContext   = null;
        try {
            jaxbContext = JAXBContext.newInstance( persons.class );
            Marshaller jaxbMarshaller   = jaxbContext.createMarshaller();
            jaxbMarshaller.marshal(persons, new File("src/com/company/data/data.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }




    }
}