package NAB_Coding_Test_2025_internship;

import java.util.*;


//put(K key, V value): Thêm một cặp khóa-giá trị vào HashMap.
//get(Object key): Trả về giá trị tương ứng với khóa đã cho.
//remove(Object key): Xóa cặp khóa-giá trị tương ứng với khóa đã cho.
//containsKey(Object key): Kiểm tra xem khóa có tồn tại trong HashMap không.
//containsValue(Object value): Kiểm tra xem giá trị có tồn tại trong HashMap không.
//size(): Trả về số lượng phần tử trong HashMap.
//keySet(): Trả về một tập hợp chứa tất cả các khóa trong HashMap.

//Giá trị của khóa 'Quýt': 2
//Có chứa khóa 'Mít' không? true
//Có chứa giá trị 4 không? true
//Các phần tử trong HashMap:
//null: 4
//Mít: 3
//Quýt: 2
//Cam: 1
//Dừa: null

public class hashMap_practice3 {
    public static void main(String[] args) {
        // Tạo một HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Thêm các phần tử vào HashMap
        map.put("Cam", 1);
        map.put("Quýt", 2);
        map.put("Mít", 3);
        map.put(null, 4); // Thêm khóa null
        map.put("Dừa", null); // Thêm giá trị null

        // Lấy giá trị từ HashMap
        System.out.println("Giá trị của khóa 'Quýt': " + map.get("Quýt")); // In ra 2

        // Kiểm tra xem HashMap có chứa khóa hoặc giá trị cụ thể không
        System.out.println("Có chứa khóa 'Mít' không? " + map.containsKey("Mít")); // In ra true
        System.out.println("Có chứa giá trị 4 không? " + map.containsValue(4)); // In ra true

        // Duyệt qua các phần tử của HashMap
        System.out.println("Các phần tử trong HashMap:");
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
