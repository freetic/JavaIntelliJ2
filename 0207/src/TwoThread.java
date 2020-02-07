public class TwoThread extends Thread{
    public TwoThread() {
        super.setName("한지민");
    }

    public static void main(String[] args) {
        TwoThread tt = new TwoThread();
        tt.start();
        System.out.println(Thread.currentThread().getName()); // 이게 먼저
    }

    @Override
    public void run() {
        int count = 1;
        for(int i = 1; i <= 100; i++){
            System.out.print(Thread.currentThread().getName() + "=" + i + " ");
            if((count++ % 30) == 0){
                System.out.println();
            }
        }
    }
}
