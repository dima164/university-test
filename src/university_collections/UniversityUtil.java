package university_collections;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class UniversityUtil {


    // for Faculty

    public static boolean addFaculty(HashSet<Faculty> facSet, Faculty faculty) {
        return facSet.add(faculty);
    }

    public static boolean removeFaculty(HashSet<Faculty> facSet, Faculty faculty) {
        return facSet.remove(faculty);

    }

    //for Group

    public static boolean addGroup(List<Group> listGroup, Group group) {
        return listGroup.add(group);
    }

    public static boolean removeGroup(List<Group> listGroup, Group group) {
        return listGroup.remove(group);
    }
    // for Student

    public static boolean addStudent(List<Student> listStudent, Student student) {
        return listStudent.add(student);
    }

    public static boolean remouveStudent(List<Student> listStudent, Student student) {
        return listStudent.remove(student);
    }

    public List<String> studentsFromGroup(String groupName, String studentName, List<Student> listSt) {
       return  listSt.stream()
                .filter(s -> s.getNameOfGroup().name() == groupName)
                .filter(s -> s.getFirstName()==studentName)
                .map(s -> s.getFirstName())
                .collect(Collectors.toList());
    }

}
