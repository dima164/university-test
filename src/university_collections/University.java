package university_collections;

import java.util.*;

public class University {

    private String nameUniversity;

    private String adress;

    private HashSet<Faculty> facultiesSet;


    public University(String nameUniversity, String adress, HashSet<Faculty> facultiesSet) {
        this.nameUniversity = nameUniversity;
        this.adress = adress;
        this.facultiesSet = facultiesSet;
    }

    public String getNameUniversity() {
        return nameUniversity;
    }

    public void setNameUniversity(String nameUniversity) {
        this.nameUniversity = nameUniversity;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public HashSet<Faculty> getFacultiesSet() {
        return facultiesSet;
    }

    public void setFacultiesSet(HashSet<Faculty> facultiesSet) {
        this.facultiesSet = facultiesSet;
    }

    @Override
    public String toString() {

        List<String> facNames = new LinkedList<>();
        List<String> specNames = new LinkedList<>();
        for (Faculty fac : facultiesSet) {
            facNames.add(fac.getNameFaculty().toString());
        }

        return "university name : " + nameUniversity + "\n" + "adress : " + adress + "\n" + "faculties names :"
                + facNames;
    }
}
