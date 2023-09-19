
public class congnhan extends canbo {
    private int level;

    public congnhan(String name, int age, String gender, String address, int level) {
        super(name, age, gender, address);
        this.level=level;
    }
    public int getlevel() {
        return level;
    }
    public void setlevel() {
        this.level=level;
    }
    @Override

    public String toString() {
        return "Worker{" +
        "cap do=" + level +
        ", ten='" + name + '\'' +
        ", tuoi=" + age +
        ", gioi tinh='" + gender + '\'' +
        ", dia chi='" + address + '\'' +
        '}';
    }
}
