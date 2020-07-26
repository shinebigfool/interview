package com.interview.utils;

import java.io.*;
import java.util.Objects;

public class SerializeUtil {
    public static void serialize(Object obj){
        ObjectOutputStream outputStream = null;
        try {
            File file = new File("obj");
            outputStream = new ObjectOutputStream(new FileOutputStream(file));
            outputStream.writeObject(obj);
            outputStream.flush();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                outputStream.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public static Object unserialize(){
        ObjectInputStream inputStream = null;
        try {
            File file = new File("obj");
            inputStream = new ObjectInputStream(new FileInputStream(file));
            Object object = inputStream.readObject();
            return object;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
