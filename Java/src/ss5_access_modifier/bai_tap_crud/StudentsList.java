package ss5_access_modifier.bai_tap_crud;

public class StudentsList {
    public int id;
    public String name;

    public StudentsList(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentsList{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}


