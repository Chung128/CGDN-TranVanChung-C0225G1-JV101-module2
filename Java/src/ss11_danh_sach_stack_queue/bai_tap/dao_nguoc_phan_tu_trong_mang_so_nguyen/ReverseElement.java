package ss11_danh_sach_stack_queue.bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ReverseElement {
    public static void main(String[] args) {
        int[] ints = new int[10];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i;
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < ints.length; i++) {
            stack.push(ints[i]);
        }
        System.out.println(stack);
        for (int i = 0; i < ints.length; i++) {
            ints[i] = stack.pop();
            System.out.print(ints[i]);
        }
        System.out.println("\n--------------------");
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
//        System.out.println(arrayList);
        Stack<Integer> stack1 = new Stack<>();
        for (int i = 0; i < arrayList.size(); i++) {
            stack1.push(arrayList.get(i));
        }
        System.out.println(stack1);
        arrayList.clear();
        int sizeStack1 = stack1.size();
        for (int i = 0; i < sizeStack1; i++) {
            arrayList.add(stack1.pop());
        }
        System.out.println(arrayList);
        System.out.println("--------------------");
        ArrayList<String> mWord = new ArrayList<>();
        mWord.add("chung");
        mWord.add("bình");
        mWord.add("đông");
//        System.out.println(mWord);
        Stack<String> wStack = new Stack<>();
        for (int i = 0; i < mWord.size(); i++) {
            wStack.push(mWord.get(i));
        }
        mWord.clear();
        System.out.println(wStack);
        int sizeStack = wStack.size();
        for (int i = 0; i < sizeStack; i++) {
            mWord.add(wStack.pop());
        }
        System.out.println(mWord);
    }
}
