package ss12_danh_sach_map.thuc_hanh.su_dung_hashmap_linkedhashmap_treemap_luu_danh_sach_theo_tuoi;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private int age;

    public Student() {
    }

    public Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        Student student = (Student) o;
        return  age == student.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id= " + id +
                " name= " + name  +
                " age= " + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.age,o.getAge());
    }
}
