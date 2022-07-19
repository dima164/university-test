package university_collections;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class Faculty {
    
    private FacultyName nameFaculty;
    
    private final HashSet<SpecialityName> specialitiesSet;

    public Faculty(FacultyName nameFaculty, HashSet<SpecialityName> specialitiesSet) {
        this.nameFaculty = nameFaculty;
        this.specialitiesSet = specialitiesSet;
    }

    public FacultyName getNameFaculty() {
        return nameFaculty;
    }

    public void setNameFaculty(FacultyName nameFaculty) {
        this.nameFaculty = nameFaculty;
    }

    public HashSet<SpecialityName> getSpecialitiesSet() {
        return specialitiesSet;
    }

    @Override
    public String toString(){
        List<String> specNames = new LinkedList<>();

        for (SpecialityName spec : specialitiesSet) {
            specNames.add(spec.name());
        }
        return specNames.toString();
    }
}
