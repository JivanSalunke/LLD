package designPatterns.creational.prototypeDesignPattern;

import java.util.HashMap;

public class StudentRegistry {
    public HashMap<String, Student> map= new HashMap<>();

    public void register(String key, Student student){
        map.put(key,student);
    }
    public Student getStudent(String key){
        return  map.get(key);
    }
}
