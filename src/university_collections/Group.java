package university_collections;

public class Group {

    private GroupName nameGroup;

    private SpecialityName speciality;

    private FacultyName nameOfFaculty;

    public Group(GroupName nameGroup, SpecialityName speciality, FacultyName nameOfFaculty) {
        this.nameGroup = nameGroup;
        this.speciality = speciality;
        this.nameOfFaculty = nameOfFaculty;
    }

    public GroupName getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(GroupName nameGroup) {
        this.nameGroup = nameGroup;
    }

    public SpecialityName getSpeciality() {
        return speciality;
    }

    public void setSpeciality(SpecialityName speciality) {
        this.speciality = speciality;
    }

    public FacultyName getNameOfFaculty() {
        return nameOfFaculty;
    }

    public void setNameOfFaculty(FacultyName nameOfFaculty) {
        this.nameOfFaculty = nameOfFaculty;
    }
}
