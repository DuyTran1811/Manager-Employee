import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Methodss {

    public Official ceart(Scanner input) {
        System.out.println("Chon :\n1.Them Nhan Vien\n2.Them Ky Su\n3.Them Cong Nhan");
        var option = input.nextInt();

        System.out.println("Nhap Ten");
        var fullName = input.nextLine();
        input.nextLine();
        System.out.println("Nhap Ngay Thang nam sinh");
        Date dateOfBirth = null;
        var format = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        try {
            dateOfBirth = dateFormat.parse(input.nextLine());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Nhap Gioi Tinh");
        var gender = input.nextLine();
        System.out.println("Nhap Dia Chi");
        var address = input.nextLine();
        switch (option) {
            case 1:
                System.out.println("Chuc Vu");
                var work1 = input.nextLine();
                return new Employee(null, fullName, dateOfBirth, gender, address, work1);
            case 2:
                System.out.println("Chuc Vu");
                var work2 = input.nextLine();
                return new Engineer(null, fullName, dateOfBirth, gender, address, work2);
            case 3:
                System.out.println("Chuc Vu");
                var work3 = input.nextLine();
                return new Worker(null, fullName, dateOfBirth, gender, address, work3);
        }
        return null;
    }

    public void dissplay(ArrayList<Official> listOfficial) {
        var format = "dd/MM/yyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        System.out.printf("%-13s%-13s%-13s%-13s%-13s%-13s\n",
                "Ma NV", "Ho Va Ten", "Ngay Sinh", "Gio Tinh", "Dia Chi", "Chuc Vu");
        for (Official index : listOfficial) {
            System.out.printf("%-13s%-13s%-13s%-13s%-13s%-13s\n",
                    index.getId(), index.getFullNameString(), dateFormat.format(index.getDateOfBirth()), index.getGender(),
                    index.getAddress(), index.getMajor());
        }
    }

    public ArrayList<Official> searchName(ArrayList<Official> listOfficial, String name) {
        ArrayList<Official> list = new ArrayList<>();
        for (var index : listOfficial) {
            var firstName = getFirstName(index.getFullNameString());
            if (firstName.compareToIgnoreCase(name)==0){
                list.add(index);
            }
        }
        return list;
    }

    private String getFirstName(String fullNameString) {
        var index = fullNameString.lastIndexOf(" ");
        return fullNameString.substring(index+1);
    }
}
