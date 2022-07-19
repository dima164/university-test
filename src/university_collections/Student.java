package university_collections;

public class Student {

    private String firstName;

    private String lastName;

    private String teleNumber;

    private GroupName nameOfGroup;

    public Student(String firstName, String lastName, String teleNumber, GroupName nameOfGroup) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.teleNumber = teleNumber;
        this.nameOfGroup = nameOfGroup;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTeleNumber() {
        return teleNumber;
    }

    public void setTeleNumber(String teleNumber) {
        this.teleNumber = teleNumber;
    }

    public GroupName getNameOfGroup() {
        return nameOfGroup;
    }

    public void setNameOfGroup(GroupName nameOfGroup) {
        this.nameOfGroup = nameOfGroup;
    }
}
