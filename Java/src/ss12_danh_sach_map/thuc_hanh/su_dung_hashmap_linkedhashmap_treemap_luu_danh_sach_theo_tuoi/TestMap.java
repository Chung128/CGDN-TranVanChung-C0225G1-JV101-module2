package ss12_danh_sach_map.thuc_hanh.su_dung_hashmap_linkedhashmap_treemap_luu_danh_sach_theo_tuoi;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        Map<Student, Integer> map = new HashMap<>();
        Student student1 = new Student(1, 12, "chung");
        Student student11 = new Student(1, 12, "chung");
        Student student2 = new Student(2, 13, "đông");
        Student student3 = new Student(3, 14, "bình");
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student11);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(new Student(12, 13, "fsfsc"));
        studentList.add(new Student(12, 4, "fsfsc"));
        studentList.add(new Student(12, 13, "fsfsc"));
        studentList.add(new Student(12, 14, "fsfsc"));

//        Set<Student> set=new LinkedHashSet<>();
//        for (Student keys : map.keySet()) {   // in ra các key gồm các student
//            System.out.println(keys);
//        }
//        for (Integer values : map.values()) {  //in ra các giá trị
//            System.out.println(values);
//        }
//        for (Map.Entry<Student, Integer> keysValues:map.entrySet()){ //in ra cả giá trị và key
//            System.out.println(keysValues);
//        }
//        if (map.containsKey(student1)){
//            map.put(student11, map.get(student11)+5);
//        } else {
//            map.put(student11,1);
//        }

        for (int i = 0; i < studentList.size(); i++) {
            if (map.containsKey(studentList.get(i))) {
                map.put(studentList.get(i), map.get(studentList.get(i)) + 1);
            } else {
                map.put(studentList.get(i), 1);
            }
        }

        map.forEach((student, quality) -> System.out.println(student.getAge() + ": so luong" + quality));
    }
}
