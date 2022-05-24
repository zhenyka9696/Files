package com.company;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class ReadXML_file {
    public static void main(String[] args) {
        persons persons=null;
        JAXBContext jaxbContext   = null;
        try {
            jaxbContext = JAXBContext.newInstance( persons.class );
            Unmarshaller jaxbMarshaller   = jaxbContext.createUnmarshaller();
            persons= (com.company.persons) jaxbMarshaller.unmarshal(new File("src/com/company/data/data.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
persons.getPersons().stream().forEach( System.out::println);;




    }
    }

