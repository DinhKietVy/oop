

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        quanly managerOfficer = new quanly();
        while (true) {
            System.out.println("Ung dung quan ly cong ty");
            System.out.println("Enter 1: nhap can bo");
            System.out.println("Enter 2: tim can bo theo ten: ");
            System.out.println("Enter 3: hien thi thong tin cac can bo");
            System.out.println("Enter 4: thoat:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Enter a: nhap 1 ky su");
                    System.out.println("Enter b: nhap 1 cong nhan");
                    System.out.println("Enter c: nhap 1 tro ly");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            System.out.print("nhap ten: ");
                            String name = scanner.nextLine();
                            System.out.print("nhap tuoi:");
                            int age = scanner.nextInt();
                            System.out.print("gioi tinh: ");
                            scanner.nextLine();
                            String gender = scanner.nextLine();
                            System.out.print("dia chi: ");
                            String address = scanner.nextLine();
                            System.out.print("chi nhanh: ");
                            String branch = scanner.nextLine();
                            canbo engineer = new kysu(name, age, gender, address, branch);
                            managerOfficer.addOfficer(engineer);
                            System.out.println(engineer.toString());
                            break;

                        }
                        case "b": {
                            System.out.print("nhap ten: ");
                            String name = scanner.nextLine();
                            System.out.print("nhap tuoi:");
                            int age = scanner.nextInt();
                            System.out.print("gioi tinh: ");
                            scanner.nextLine();
                            String gender = scanner.nextLine();
                            System.out.print("dia chi: ");
                            String address = scanner.nextLine();
                            System.out.print("cap do: ");
                            int level = scanner.nextInt();
                            canbo worker = new congnhan(name, age, gender, address, level);
                            managerOfficer.addOfficer(worker);
                            System.out.println(worker.toString());
                            scanner.nextLine();
                            break;
                        }
                        case "c": {
                            System.out.print("nhap ten: ");
                            String name = scanner.nextLine();
                            System.out.print("nhap tuoi: ");
                            int age = scanner.nextInt();
                            System.out.print("gioi tinh: ");
                            scanner.nextLine();
                            String gender = scanner.nextLine();
                            System.out.print("dia chi: ");
                            String address = scanner.nextLine();
                            System.out.print("cong viec: ");
                            String task = scanner.nextLine();
                            canbo staff = new troly(name, age, gender, address, task);
                            managerOfficer.addOfficer(staff);
                            System.out.println(staff.toString());
                            break;
                        }
                        default:
                            System.out.println("khong co");
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.print("nhap ten: ");
                    String name = scanner.nextLine();
                    managerOfficer.searchOfficerByName(name).forEach(officer -> {
                        System.out.println(officer.toString());
                    });
                    break;
                }
                case "3": {
                    managerOfficer.showListInforOfficer();
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("khong thay");
                    continue;
            }

        }
    }

}