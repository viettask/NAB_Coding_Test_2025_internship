package NAB_Coding_Test_2025_internship;

//Trong một HashMap, chúng ta có thể
//
//Lặp qua các key của nó
//Lặp qua các value của nó
//Lặp qua các key/value của nó
//Ví dụ sử dụng forEach

import java.util.HashMap;
import java.util.Map.Entry;

//Kết quả
//
//HashMap: {One=1, Two=2, Three=3}
//Entries: One=1, Two=2, Three=3
//Keys: One, Two, Three,
//Values: 1, 2, ,3,

public class hashMap_practice10 {
    public static void main(String[] args) {

        // Creating a HashMap
        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("HashMap: " + numbers);

        // Accessing the key/value pair
        System.out.print("Entries: ");
        for(Entry<String, Integer> entry: numbers.entrySet()) {
            System.out.print(entry);
            System.out.print(", ");
        }

        // Accessing the key
        System.out.print("\nKeys: ");
        for(String key: numbers.keySet()) {
            System.out.print(key);
            System.out.print(", ");
        }

        // Accessing the value
        System.out.print("\nValues: ");
        for(Integer value: numbers.values()) {
            System.out.print(value);
            System.out.print(", ");
        }
    }
}
