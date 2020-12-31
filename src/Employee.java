import java.util.Date;

public class Employee extends Official {

    public Employee() {
    }

    public Employee(String id) {
        super(id);
    }

    public Employee(String id, String fullName,
                    Date dateOfBirth, String gender, String address, String major) {
        super(id, fullName, dateOfBirth, gender, address, major);
    }
}
