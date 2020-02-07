public class ThreadDemo implements Runnable{
    public static void main(String[] args) {
        ThreadDemo td = new ThreadDemo();
        Thread my = new Thread(td, "한지민");
        my.start();

    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread());
    }
}
