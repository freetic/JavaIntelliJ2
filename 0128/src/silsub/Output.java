package silsub;

import java.util.Scanner;
import java.util.Vector;

public class Output {
    private Vector<Member> members;

    public Output(Vector<Member> members) {
        this.members = members;
    }

    public void output(){
        for(Member m : members){
            System.out.println(m);
        }
    }
}
