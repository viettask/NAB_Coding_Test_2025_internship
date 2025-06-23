package NAB_Coding_Test_2025_internship;

//remove(key) – trả về và xóa mục liên kết với key được chỉ định khỏi map
//remove(key, value) – chỉ xóa mục khỏi map nếu key được chỉ định liên kết với value đã chỉ định và trả về giá trị boolean

import java.util.HashMap;

//Kết quả
//
//HashMap: {One=1, Two=2, Three=3}
//Removed value: 2
//Is the entry Three removed? True
//Updated HashMap: {One=1}

public class hashMap_practice6 {
    public static void main(String[] args) {

        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("HashMap: " + numbers);

        // remove method with single parameter
        int value = numbers.remove("Two");
        System.out.println("Removed value: " + value);

        // remove method with two parameters
        boolean result = numbers.remove("Three", 3);
        System.out.println("Is the entry Three removed? " + result);

        System.out.println("Updated HashMap: " + numbers);
    }
}
