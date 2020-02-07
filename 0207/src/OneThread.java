public class OneThread {
    public static void main(String[] args){
        OneThread ot = new OneThread();
        System.out.println(Thread.currentThread().getName());
        ot.go();
    }

    private void go(){
        int count = 0;
        for(int i = 1; i <= 1000; i++){
            System.out.print(i + " ");
            if((count++ % 100) == 0){
                System.out.println();
            }
        }
    }
}
