package NAB_Coding_Test_2025_internship;

//merge() - liên kết value được chỉ định với để key được chỉ định nếu key đó 
//chưa được liên kết với value nào. 
//Tuy nhiên, nếu key được chỉ định đã được liên kết với một value, 
//nó sẽ hợp nhất value được chỉ định mới với value cũ hiện có.

import java.util.HashMap;

//Kết quả
//
//Original HashMap: {Second=2, First=1}
//New HashMap: {Second=2, First=5}

public class hashMap_practice9 {
    public static void main(String[] args) {

        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("First", 1);
        numbers.put("Second", 2);
        System.out.println("Original HashMap: " + numbers);

        // Using merge() Method
        numbers.merge("First", 4, (oldValue, newValue) -> oldValue + newValue);
        System.out.println("New HashMap: " + numbers);
    }
}
