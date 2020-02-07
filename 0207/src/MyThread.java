public class MyThread implements Runnable {
    private boolean flag = false;
    public void mystop(){
        this.flag = false;
    }

    @Override
    public void run() {
        // Thread가 해야 할 일
        this.flag = true;
        try {
            while(this.flag){
                Thread.sleep(500);
                System.out.println("i'm alive");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("- - - - - - - - - - - - - DEAD - - - - - - - - - - - -");
    }
}
