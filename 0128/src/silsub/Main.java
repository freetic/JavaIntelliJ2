package silsub;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    private Vector<Member> members = new Vector<>();
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Main m = new Main();
        m.print();
    }

    void print(){
        do{
            System.out.println("1.입력 2.출력 3.검색(이름으로) 4.삭제(이름으로)");
            System.out.println("선택 >> : ");
            int num = sc.nextInt();
            try{
                if(num > 4 || num < 1) throw new Exception();
            } catch (Exception e){
                System.out.println("잘못 입력했수다.");
            }
            switch(num){
                case 1:
                    Input input = new Input(members);
                    input.input();
                    break;
                case 2:
                    Collections.sort(members);
                    Output output = new Output(members);
                    output.output();
                    break;
                case 3:
                    Search search = new Search(members);
                    search.search();
                    break;
                case 4:
                    Remove remove = new Remove(members);
                    remove.remove();
            }
        }while(true);
    }
}
