import java.util.ArrayList;
import java.util.Scanner;

public class Tets {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var listOfficial = new ArrayList<Official>();
        Methodss methodss = new Methodss();
        var choice = 0;
        do {
            System.out.println("1: Them Nhan Vien");
            System.out.println("2: Hien Thi Thong Tin Nhan Vien");
            System.out.println("3: Tim Kiem Nhan Vien Theo Ten");
            System.out.println("0: Thoat");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 0:
                    System.exit(0);
                    System.out.println("Cam On Da Su Dung Dich Vu");
                case 1:
                    var add = methodss.ceart(input);
                    listOfficial.add(add);
                    System.out.println("Them Thanh Cong");
                    break;
                case 2:
                    if (listOfficial.size() > 0) {
                        methodss.dissplay(listOfficial);
                    } else {
                        System.out.println("Danh Sach rong");
                    }
                    break;
                case 3:
                    if (listOfficial.size() > 0) {
                        System.out.println("Nhap Ten");
                        var name = input.nextLine();
                        var result = methodss.searchName(listOfficial, name);
                        if (result.size() > 0) {
                            System.out.println("Tim Thay " + result.size() + " Ket Qua");
                            methodss.dissplay(result);
                        } else {
                            System.out.println("Khong Thim Thay Nhan Vien Nao " + name + ": ");
                        }
                    } else {
                        System.out.println("Ranh Sach Rong");
                    }
            }
        } while (true);
    }
}
