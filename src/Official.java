import java.util.Date;

public class Official {
    private static int nextId = 01;
    private String id;
    private FullName fullName;
    private Date dateOfBirth;
    private String gender;
    private String address;
    private String major;

    public Official() {
    }

    public Official(String id) {
        if (id == null) setId();
        else this.id = id;
    }

    public Official(String id, String fullName, Date dateOfBirth, String gender, String address, String major) {
        this(id);
        this.setFullNameString(fullName);
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
        this.major = major;
    }

    public void setFullNameString(String fullName) {
        this.fullName = new FullName();
        if (fullName != null && fullName.length() > 0) {
            var word = fullName.split("\\s+");
            this.fullName.first = word[word.length - 1];
            this.fullName.last = word[0];
            this.fullName.mind = "";
            for (int i = 0; i < word.length - 1; i++) {
                this.fullName.mind += word[i];
            }
        }
    }

    public String getId() {
        return id;
    }

    public void setId() {
        this.id = "MNV" + nextId;
        nextId++;
    }

    public FullName getFullName() {
        return fullName;
    }

    public String getFullNameString() {
        return fullName.first + " " + fullName.last + " " + fullName.mind;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getMajor() {
        return major;
    }

    class FullName {
        private String first;
        private String last;
        private String mind;

        public FullName() {
        }

        public String getFirst() {
            return first;
        }

        public String getLast() {
            return last;
        }

        public String getMind() {
            return mind;
        }
    }
}
