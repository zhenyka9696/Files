package com.company;

import java.io.*;

public class Read_BinFile {
    public static void main(String[] args) {
        String fileName="src/com/company/data/data.bin";
        try(FileInputStream fis = new FileInputStream(fileName);
            DataInputStream dis = new DataInputStream(fis)){
            String text=dis.readUTF();
            double value=dis.readDouble();
            int i=dis.readInt();
            System.out.printf("text: %s, double: %f, int: %d%n",text,value,i);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }}