package NAB_Coding_Test_2025_internship;
//
//Trong chương trình trên, lưu ý rằng chúng ta đã import gói java.util.Map.Entry. Ở đây, Map.Entry là class trong của Map interface. Class trong này trả về một view (các phần tử) của map.
//
//Ví dụ sử dụng hàm iterator()
//
//Cũng có thể lặp lại HashMap bằng cách sử dụng hàm iterator(). Để sử dụng hàm này, chúng ta phải import java.util.Iterator gói.

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

//Kết quả
//
//HashMap: {One=1, Two=2, Three=3}
//Entries: One=1, Two=2, Three=3
//Keys: One, Two, Three,
//Values: 1, 2, 3,

public class hashMap_practice11 {
	   public static void main(String[] args) {
	        // Creating a HashMap
	        HashMap<String, Integer> numbers = new HashMap<>();
	        numbers.put("One", 1);
	        numbers.put("Two", 2);
	        numbers.put("Three", 3);
	        System.out.println("HashMap: " + numbers);

	        // Creating an object of Iterator
	        Iterator<Entry<String, Integer>> iterate1 = numbers.entrySet().iterator();

	        // Accessing the Key/Value pair
	        System.out.print("Entries: ");
	        while(iterate1.hasNext()) {
	            System.out.print(iterate1.next());
	            System.out.print(", ");
	        }

	        // Accessing the key
	        Iterator<String> iterate2 = numbers.keySet().iterator();
	        System.out.print("\nKeys: ");
	        while(iterate2.hasNext()) {
	            System.out.print(iterate2.next());
	            System.out.print(", ");
	        }

	        // Accessing the value
	        Iterator<Integer> iterate3 = numbers.values().iterator();
	         System.out.print("\nValues: ");
	        while(iterate3.hasNext()) {
	            System.out.print(iterate3.next());
	            System.out.print(", ");
	        }
	    }
}

//Hàm	Mô tả
//clear()	Xóa tất cả các mục khỏi map
//containsKey()	Kiểm tra xem map có chứa key được chỉ định hay không và trả về giá trị boolean
//containsValue()	Kiểm tra xem map có chứa value được chỉ định hay không và trả về giá trị boolean
//size()	Trả về kích cỡ của map
//isEmpty()	Kiểm tra xem map có trống không và trả về giá trị boolean
