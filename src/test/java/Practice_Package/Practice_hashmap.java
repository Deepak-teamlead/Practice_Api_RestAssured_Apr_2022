package Practice_Package;
import java.util.Collections;
import java.util.HashMap;
public class Practice_hashmap {

    //Hashmap
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        //Adding elements in key and value pair
        hm.put(1, "rock");
        hm.put("deepak", 2);
        hm.put(12.2, "brock");
        hm.put("snake", true);
        System.out.println(hm);
        //remove element
        hm.remove(12.2);
        System.out.println("After removing element" + "  " + hm);


    }
}