public class ThreadDemo3 implements Runnable{
    public static void main(String[] args) {
        ThreadDemo3 td = new ThreadDemo3();
        Thread sujan = new Thread(td, "Sujan");
        Thread smith = new Thread(td, "Smith");
        sujan.start();
        smith.start();

    }

    @Override
    public void run() {
        for(int i = 0; i <= 100; i++){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}
