package university_collections;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class UniversityMain {
    public static void main(String[] args) {


        // genereate Faculties

        HashSet<SpecialityName> specialityNamesPhy = new HashSet<>();
        specialityNamesPhy.add(SpecialityName.Physics_Nuclear);
        specialityNamesPhy.add(SpecialityName.Physics_Semiconductors);

        Faculty physics_1 = new Faculty(FacultyName.Physics, specialityNamesPhy);

        HashSet<SpecialityName> specialityNamesPhilos = new HashSet<>();
        specialityNamesPhilos.add(SpecialityName.Philosophy_Sience);
        specialityNamesPhilos.add(SpecialityName.Philosophy_Real);

        Faculty philosophy_1 = new Faculty(FacultyName.Philosofy, specialityNamesPhilos);

        HashSet<SpecialityName> specialityNamesMath = new HashSet<>();
        specialityNamesMath.add(SpecialityName.Math_Real);
        specialityNamesMath.add(SpecialityName.Math_Science);

        Faculty math_1 = new Faculty(FacultyName.Mathematics, specialityNamesMath);

        HashSet<SpecialityName> specialityNamesBio = new HashSet<>();
        specialityNamesBio.add(SpecialityName.Bio_Aqua);
        specialityNamesBio.add(SpecialityName.Bio_Terra);

        Faculty bio_1 = new Faculty(FacultyName.Biology, specialityNamesBio);

        // generate University

        HashSet<Faculty> facultiesSet =  new HashSet<>();
        facultiesSet.add(physics_1);
        facultiesSet.add(philosophy_1);
        facultiesSet.add(math_1);
        facultiesSet.add(bio_1);

        University univ_Bucharest = new University("Universitatea-Bucuresti","Bd.Ferdinand nr.103,Bucharest,Sect.3",facultiesSet);

        // generate Groups



        Group physicGroup_1 = new Group(GroupName.Physics_Nuclear_A, SpecialityName.Physics_Nuclear, FacultyName.Physics);
        Group philosGroup_1 = new Group(GroupName.Philosophy_Real_A, SpecialityName.Philosophy_Real, FacultyName.Philosofy);
        Group bioGroup_1 = new Group(GroupName.Bio_Terra_A, SpecialityName.Bio_Terra, FacultyName.Biology);
        Group mathGroup_1 = new Group(GroupName.Math_Real_A, SpecialityName.Math_Real, FacultyName.Mathematics);

        List<Group> groupsList = List.of(physicGroup_1,philosGroup_1,mathGroup_1,bioGroup_1);

        // generate Students

        Student std_1 = new Student("doru","vasile","0744556788",GroupName.Physics_Nuclear_A);
        Student std_2 = new Student("andrei","sima","0766543234",GroupName.Philosophy_Real_A);
        Student std_3 = new Student("dumitru","corbu","0744535657",GroupName.Bio_Terra_A);
        Student std_4 = new Student("nicu","preoteasa","0766454323",GroupName.Math_Real_A);

        List<Student> studentsList = List.of(std_1,std_2,std_3,std_4);

        // probe metode
        HashSet<Faculty> faculSet = new HashSet<>();

        System.out.println(UniversityUtil.addFaculty(faculSet,physics_1));
        System.out.println(UniversityUtil.removeFaculty(faculSet,physics_1));

        System.out.println(univ_Bucharest.toString());


    }
}
