package ss10_dsa_danh_sach.bai_tap_cai_dat_arraylist;

public class MyArrayListTest {
    public static class Student {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    " id= " + id +
                    "  name= " + name +
                    '}';
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1, "chung");
        Student b = new Student(2, "bình");
        Student c = new Student(3, "đông");
        Student d = new Student(4, "khánh");
        MyArrayList<Student> student = new MyArrayList<>();
        student.add(a);
        student.add(b);
        student.add(c);
        student.add(d);
//        student.remove(2);
//        student.clear();
        student.insert(c,1);
        for (int i = 0; i < student.size(); i++) {
            System.out.println("element " + (i + 1) + " : " + student.get(i));
        }
        System.out.println("size = " + student.size());
//        student.get(5);
    }
}
