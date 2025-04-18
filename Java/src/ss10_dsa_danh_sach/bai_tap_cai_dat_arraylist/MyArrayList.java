package ss10_dsa_danh_sach.bai_tap_cai_dat_arraylist;

import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0; //số lượng phần tử có trong ArrayList
    private static final int DEFAULT_CAPACITY = 10; // sức chứa của ArrayList
    Object[] element; //mảng chứa các phần tử

    public MyArrayList() {
        element = new Object[DEFAULT_CAPACITY]; // sức chứa mặc định khi khởi tạo bằng constructor không có tham số
    }

    public MyArrayList(int capacity) {
        if (capacity >= 0) {
            element = new Object[capacity];
        } else {
            throw new IllegalArgumentException("Capacity " + capacity);
        }
    }

    public int size() {      // phương thức trả về số lượng pần tủ trong mảng
        return this.size;
    }

    public void clear() {   //phương thức xóa toàn bộ giá trị trong mảng
        size = 0;
        for (int i = 0; i < element.length; i++) {
            element[i] = null;
        }
    }

    public boolean add(E elements) {// phương thức thêm 1 phần tử vào MyArrayList
        if (element.length == size) {
            this.ensureCapacity(5);
        }
        element[size] = elements;
        size++;
        return true;
    }

    public void add(E elements, int index) {
        if (index > element.length) {
            throw new IllegalArgumentException("index " + index);
        } else if (element.length == size) {
            this.ensureCapacity(5);
        }
        if (element[index] == null) {
            element[index] = elements;
        } else {
            for (int i = size + 1; i >= index; i--) {
                element[i] = element[i - 1];
            }
            element[index] = elements;
            size++;
        }
    }

    public void ensureCapacity(int minCapacity) {   //tăng kích thước mảng lên
        if (minCapacity >= 0) {
            int newSize = this.element.length + minCapacity;
            element = Arrays.copyOf(element, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity " + minCapacity);
        }
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("index " + index + ",size " + size);
        }
        return (E) element[index];
    }
}
