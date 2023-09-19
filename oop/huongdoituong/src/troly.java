

import java.time.LocalDate;

public class troly extends canbo {
    private String task;
    public troly(String name, int age, String gender, String address, String task) {
        super(name, age, gender, address);
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "cong viec='" + task + '\'' +
                ", ten='" + name + '\'' +
                ", tuoi=" + age +
                ", gioi tinh='" + gender + '\'' +
                ", dia chi='" + address + '\'' +
                '}';
    }
}