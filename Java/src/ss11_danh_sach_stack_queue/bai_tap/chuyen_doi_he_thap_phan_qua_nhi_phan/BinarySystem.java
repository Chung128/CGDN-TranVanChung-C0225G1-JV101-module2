package ss11_danh_sach_stack_queue.bai_tap.chuyen_doi_he_thap_phan_qua_nhi_phan;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class BinarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần chuyển qua hệ nhị phân : ");
        int number = scanner.nextInt();
        System.out.print("Số " + number + " chuyển qua hệ nhị phân thành : ");
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; 0 < number; i++) {
            arrayList.add(number % 2);
            number = number / 2;
        }
//        System.out.println(arrayList);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arrayList.size(); i++) {
            stack.push(arrayList.get(i));
        }
        arrayList.clear();
        int sizeStack = stack.size();
        for (int i = 0; i < sizeStack; i++) {
            arrayList.add(stack.pop());
        }
        System.out.print(arrayList);
    }
}
