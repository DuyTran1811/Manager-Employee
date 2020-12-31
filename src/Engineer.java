import java.util.Date;

public class Engineer extends Official {
    public Engineer() {
    }

    public Engineer(String id) {
        super(id);
    }

    public Engineer(String id, String fullName, Date dateOfBirth,
                    String gender, String address, String major) {
        super(id, fullName, dateOfBirth, gender, address, major);
    }
}
