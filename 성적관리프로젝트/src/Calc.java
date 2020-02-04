import java.util.Iterator;
import java.util.Vector;

public class Calc {
    private Vector<Student> vector;

    public Calc(Vector<Student> vector) {
        this.vector = vector;
    }

    public void calc(){
        Iterator<Student> iter = vector.iterator();
        while(iter.hasNext()){
            Student s = iter.next();
            int tot = s.getKor() + s.getEng() + s.getMat();
            double avg = tot/3.0;
            char grade = (avg >= 90)? 'A':
                    (avg >= 80)? 'B':
                            (avg >= 70)? 'C':
                                    (avg >= 60)? 'D':'F';
            s.setTot(tot);
            s.setAvg(avg);
            s.setGrade(grade);
        }
        for(Student s : this.vector){

        }
    }
}
