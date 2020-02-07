import java.util.Scanner;

public class ThreadDemo2 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t = new Thread(mt);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.start();
        System.out.println("gogogogogo");

        Scanner sc = new Scanner(System.in);
        while(true){
            if(sc.next().equals("s")){
//                mt.mystop();
                t.interrupt();
                break;
            }
        }
    }
}
