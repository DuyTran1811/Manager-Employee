import java.util.Date;

public class Worker extends Official {
    public Worker() {
    }

    public Worker(String id) {
        super(id);
    }

    public Worker(String id, String fullName,
                  Date dateOfBirth, String gender,
                  String address, String major) {
        super(id, fullName, dateOfBirth, gender, address, major);
    }
}
