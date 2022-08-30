package studentStream;
import java.util.*;
import java.util.stream.Collectors;

public class LabExercises {

    private Collection<Student> students;

    public void addStudent(Student student){
        students.add(student);
    }

    public void printByAveragePoints(boolean ascending, int n){

        students.stream().sorted(Student::compareTo).limit(n).forEach(System.out::println);

    }

    public List<Student> failedStudents() {

        return students.stream().filter(student -> !student.getsSignature())
                .sorted(Comparator.comparing(Student::getIndex)
                        .thenComparing(Student::getSummedPoints))
                .collect(Collectors.toList());
    }

//    public Map<Integer,Double> getStatisticsByYear() {
//
//        students.stream().filter(Student::getsSignature).sort;
//
//    }

}
