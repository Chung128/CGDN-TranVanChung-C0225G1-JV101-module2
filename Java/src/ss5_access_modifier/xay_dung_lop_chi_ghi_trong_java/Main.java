package ss5_access_modifier.xay_dung_lop_chi_ghi_trong_java;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Chung");
        student.setClasses("C02");
        System.out.println("Sinh viên " + student.getName() +
                " đang học ở lớp " + student.getClasses());
    }
}
