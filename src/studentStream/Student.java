package studentStream;
import java.util.List;

public class Student implements Comparable<Student> {

    private String index;
    private List<Integer> points;

    public Student(String index, List<Integer> points) {

            this.index = index;
            this.points = points;

    }

    public String getIndex() {
        return this.index;
    }

    public List<Integer> getPoints() {
        return this.points;
    }

    public boolean getsSignature(){
        return this.getPoints().size() >= 8;
    }

    public double getSummedPoints() {
        return points.stream().mapToDouble(value -> value).sum()/10.0;
    }

    public String toString(){
        return this.index+ " " + this.getPoints().toString();
    }

    @Override
    public int compareTo(Student student) {
        int result = Double.compare(this.getSummedPoints(),student.getSummedPoints());
        if(result==0){
            return getIndex().compareTo(student.getIndex());
        }
        return result;
    }

}
