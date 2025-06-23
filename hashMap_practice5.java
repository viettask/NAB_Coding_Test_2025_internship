package NAB_Coding_Test_2025_internship;

import java.util.HashMap;

//get()- Trả về value liên kết với key được chỉ định. Trả về null nếu không tìm thấy key.
//getOrDefault()- Trả về value liên kết với key được chỉ định. Trả về value mặc định đã chỉ định nếu không tìm thấy key.

//Kết quả
//
//HashMap: {One=1, Two=2, Three=3}
//Returned Number: 3
//Returned Number: 5

public class hashMap_practice5 {
    public static void main(String[] args) {

        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("HashMap: " + numbers);

        // Using get()
        int value1 = numbers.get("Three");
        System.out.println("Returned Number: " + value1);

        // Using getOrDefault()
        int value2 = numbers.getOrDefault("Five", 5);
        System.out.println("Returned Number: " + value2);
    }
}
