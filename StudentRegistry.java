package Design_Pattern_Prototype_Registry;

import java.util.HashMap;

public class StudentRegistry {
    private HashMap<String,Student> map;

   public StudentRegistry(){
       this.map = new HashMap<>();
   }
   public void register(String key, Student prototype){
       map.put(key, prototype);
   }

   public Student  get(String key){
       return map.get(key);
   }
}
