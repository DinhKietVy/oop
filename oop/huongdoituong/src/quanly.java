

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class quanly {
    private List<canbo> officers;

    public quanly() {
        this.officers = new ArrayList<>();
    }

    public void addOfficer(canbo officer) {
        this.officers.add(officer);
    }

    public List<canbo> searchOfficerByName(String name) {
        return this.officers.stream().filter(o -> o.getname().contains(name)).collect(Collectors.toList());
    }

    public void showListInforOfficer() {
        this.officers.forEach(o -> System.out.println(o.toString()));
    }
}