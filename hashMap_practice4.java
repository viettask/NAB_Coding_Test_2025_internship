package NAB_Coding_Test_2025_internship;

import java.util.HashMap;

//entrySet() – trả về một tập hợp gồm tất cả cặp key/value của map
//keySet() – trả về một tập hợp gồm tất cả các key của map
//values() – trả về một tập hợp gồm tất cả các value của map

//Kết quả
//
//HashMap: {One=1, Two=2, Three=3}
//Key/Value mappings: [One=1, Two=2, Three=3]
//Keys: [One, Two, Three]
//Values: [1, 2, 3]

public class hashMap_practice4 {
    public static void main(String[] args) {
        HashMap<String, Integer> numbers = new HashMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("HashMap: " + numbers);

        // Using entrySet()
        System.out.println("Key/Value mappings: " + numbers.entrySet());

        // Using keySet()
        System.out.println("Keys: " + numbers.keySet());

        // Using values()
        System.out.println("Values: " + numbers.values());
    }
}
