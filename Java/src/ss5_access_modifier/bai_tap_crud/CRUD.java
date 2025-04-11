package ss5_access_modifier.bai_tap_crud;

import java.util.Scanner;

public class CRUD {
    private static final StudentsList[] students = new StudentsList[10];

    static {
        students[0] = new StudentsList(1, "Chung");
        students[1] = new StudentsList(2, "Bình");
        students[2] = new StudentsList(3, "Đông");
        students[3] = new StudentsList(4, "Khánh");
    }

    Scanner scanner = new Scanner(System.in);

    public void display() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i]);
            }
        }
    }

    public void add() {
        System.out.print("Nhập id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập tên : ");
        String name = scanner.nextLine();
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = new StudentsList(id, name);
                break;
            }
        }
    }
    public  void delete(){
        int index=scanner.nextInt();
        for (int i = 0; i < students.length; i++) {
            if (index==i){
                for (int j = i; j < students.length - 1; j++) {
                    students[j] = students[j + 1];
                }
                break;
            }
        }
    }
}
