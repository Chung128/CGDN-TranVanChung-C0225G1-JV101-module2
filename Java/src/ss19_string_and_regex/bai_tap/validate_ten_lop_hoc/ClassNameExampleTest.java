package ss19_string_and_regex.bai_tap.validate_ten_lop_hoc;

public class ClassNameExampleTest {
    public static final String[] validName = new String[]{"C1234K","b1234" , "P0987K"};
    public static final String[] invalidName = new String[]{"A4321", "c4321", "e0987K"};
    private static ClassNameExample className = new ClassNameExample();

    public static void main(String[] args) {
        for (String name : validName) {
            boolean isValid = className.validate(name);
            if (isValid) {
                System.out.println("tên lớp " + name + " đúng định dạng.");
            } else {
                System.out.println("tên lớp " + name + " sai định dạng.");
            }
        }
        for (String name : invalidName) {
            boolean isinValid = className.validate(name);
            if (isinValid) {
                System.out.println("tên lớp " + name + " đúng định dạng.");
            } else {
                System.out.println("tên lớp " + name + " sai định dạng.");
            }
        }
    }
}
