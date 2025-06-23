package NAB_Coding_Test_2025_internship;

//replace(key, value) – thay thế value liên kết với Key được chỉ định bằng một value mới
//replace(key, old, new) – thay thế value old bằng value new nếu value old đã liên kết với Key được chỉ định
//replaceAll(function) – thay thế từng value của map bằng kết quả của hàm được chỉ định

import java.util.HashMap;

//Kết quả
//
//Original HashMap: {Second=2, Third=3, First=1}
//HashMap using replace: {Second=22, Third=33, First=1}
//HashMap using replaceAll: {Second=24, Third=35, First=3}

public class hashMap_practice7 {
    public static void main(String[] args) {

        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);
        System.out.println("Original HashMap: " + numbers);

        // Using replace()
        numbers.replace("Second", 22);
        numbers.replace("Third", 3, 33);
        System.out.println("HashMap using replace(): " + numbers);

        // Using replaceAll()
        numbers.replaceAll((key, oldValue) -> oldValue + 2);
        System.out.println("HashMap using replaceAll(): " + numbers);
    }
}
