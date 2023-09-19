

import java.time.LocalDate;


public class kysu extends canbo {
    private String branch;
    public kysu(String name, int age, String gender, String address, String branch) {
        super(name, age, gender, address);
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "chi nhanh='" + branch + '\'' +
                ", ten='" + name + '\'' +
                ", tuoi=" + age +
                ", gioi tinh='" + gender + '\'' +
                ", dia chi='" + address + '\'' +
                '}';
    }
}