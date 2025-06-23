package NAB_Coding_Test_2025_internship;

//compute() - Tính toán một value mới bằng cách sử dụng hàm được chỉ định. Sau đó, nó liên kết value được tính toán với key được chỉ định.
//computeIfAbsent() - Nếu key được chỉ định không được liên kết với bất kỳ value nào, hàm này sẽ tính toán một value mới bằng cách sử dụng hàm được chỉ định. Sau đó, nó liên kết value mới với key.
//computeIfPresent() - Nếu key được chỉ định đã được liên kết với bất kỳ value nào, hàm này sẽ tính toán một value mới bằng cách sử dụng hàm được chỉ định. Sau đó, nó liên kết value mới với key.

import java.util.HashMap;

//Kết quả
//
//Original HashMap: {Second=2, First=1}
//HashMap using compute(): {Second=3, First=3}
//HashMap using computeIfAbsent(): {Second=3 First=3, Three=5}
//HashMap using computeIfPresent(): {Second=6, First=3, three=5}

public class hashMap_practice8 {
    public static void main(String[] args) {

        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("First", 1);
        numbers.put("Second", 2);
        System.out.println("Original HashMap: " + numbers);

        // Using compute()
        numbers.compute("First", (key, oldValue) -> oldValue + 2);
        numbers.compute("Second", (key, oldValue) -> oldValue + 1);
        System.out.println("HashMap using compute(): " + numbers);

        // Using computeIfAbsent()
        numbers.computeIfAbsent("Three", key -> 5);
        System.out.println("HashMap using computeIfAbsent(): " + numbers);

        // Using computeIfPresent()
        numbers.computeIfPresent("Second", (key, oldValue) -> oldValue * 2);
        System.out.println("HashMap using computeIfPresent(): " + numbers);
    }
}
