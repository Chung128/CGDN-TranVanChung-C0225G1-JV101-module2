package ss10_dsa_danh_sach.thuc_hanh;

public class Test{
    public static void main(String[] args) {
        LinkedListClass listClass=new LinkedListClass(3);
        listClass.addFirst(6);
        listClass.add(9,2);
        listClass.add(11,3);
        listClass.add(12,4);
        System.out.println(listClass.get(1));
        listClass.printList();
    }
}
