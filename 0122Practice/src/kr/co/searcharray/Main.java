package kr.co.searcharray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3, 2, 3, 6, 90 , 5, 68, 12, 41, 63, 678, 2345, 123, 432, 654, 234};
        System.out.println("숫자 입력 : ");
        int n = sc.nextInt();

        try {
            searchArray(arr, n);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void searchArray(int[] arr, int n) throws NotFoundException{
        boolean flag = false;
        for(int i = 0; i < arr.length; i++){
            if(n == arr[i]){
                System.out.println(i + "번째에 있음.");
                flag = true;
            }
        }
        if(!flag) throw new NotFoundException("없다.");
    }
}
