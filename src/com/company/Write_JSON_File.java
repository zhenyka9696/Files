package com.company;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class Write_JSON_File {
    public static void main(String[] args) {
        FileWriter fw = null;
        JSONArray persons= new JSONArray();
        JSONObject obj=new JSONObject();
        obj.put("persons",persons);

        JSONObject person1=new JSONObject();
        person1.put("id",1);
        person1.put("name","John");
        JSONArray emails=new JSONArray();
        emails.put("email: jhon@gmail.com");
        person1.put("emails",emails);
        persons.put(person1);
        JSONObject person2=new JSONObject();
        person2.put("id",2);
        person2.put("name","Jane");
        JSONArray emails2=new JSONArray();
        emails2.put("email: jane@gmail.com");
        person2.put("emails",emails);
        persons.put(person2);

   // persons.put(person1);

        String fileName="src/com/company/data/data.json";
        try {
            fw = new FileWriter(fileName);
            fw.write(obj.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }         }


    }

