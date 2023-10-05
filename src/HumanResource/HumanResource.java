package HumanResource;

public class HumanResource {
    private String fullName;
    private String email;
    private String birthDate;

    public HumanResource(String fullName, String email, String birthDate) {
        this.fullName = fullName;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "HumanResource{" +
                "fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
