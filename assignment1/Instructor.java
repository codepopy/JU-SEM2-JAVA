package assignment1;

public class Instructor {
    private String name;
    private String phone;

    public Instructor(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    public Instructor() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
