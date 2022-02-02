package java_concept_programmimg;

import java.util.HashMap;

public class Hashmap_Entry_set {

	public static void main(String[] args) {
      HashMap m=new HashMap();
      m.put("createby", "joga");
      m.put("project", "Tyss");
      m.put("teamSize", 10);
      m.put("dateofstart", "01-20-2022");
      System.out.println(m.values());
      System.out.println(m.keySet());
      for(Object obj:m.entrySet()) {
    	  System.out.println(obj);
      }
	}

}
