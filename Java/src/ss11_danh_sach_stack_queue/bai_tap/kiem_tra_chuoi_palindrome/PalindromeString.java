package ss11_danh_sach_stack_queue.bai_tap.kiem_tra_chuoi_palindrome;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeString {
    public static void main(String[] args) {
//        String[] strings=new String[1];
//        strings[0]="Able was I ere I saw Elba";
//        System.out.println(strings[0]);
//        String input = "Able was I ere I saw Elba".toLowerCase();
//        String[] words = input.split("");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Able was I ere I saw Elba");
        String string = arrayList.get(0);
        String[] words = string.split("");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < words.length; i++) {
            stack.push(words[i]);
        }
        System.out.println(stack);
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < words.length; i++) {
            queue.offer(words[i]);
        }
        System.out.println(queue);
        int n = stack.size();
        boolean isTrue = false;
        for (int i = 0; i < n; i++) {
            if (!stack.pop().equalsIgnoreCase(queue.remove())) {
                isTrue = false;

                break;
            } else {
                isTrue = true;
            }
        }
        if (isTrue) {
            System.out.println("is palindrome string");
        } else {
            System.out.println("is not palindrome string");
        }

    }
}
