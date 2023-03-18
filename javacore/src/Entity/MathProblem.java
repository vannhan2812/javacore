package Entity;

import java.util.Random;

public class MathProblem {
    public void checkOddEven(){
        int[] arr = new int[10];
        Random random = new Random();
        for (int i=0;i<arr.length;i++){
            arr[i] = random.nextInt(12) + 1;
            if(arr[i]%2 != 0){
                System.out.println(arr[i] +" Weird");
            }else {
                if(arr[i] >= 2&&arr[i] <= 5){
                    System.out.println(arr[i] + " Not Weird");
                }
                else if(arr[i] >= 6&&arr[i] <= 20){
                    System.out.println(arr[i] + " Weird");
                }
                else System.out.println(arr[i] +" Not Weird");
            }
        }
    }
    public void soNguyenTo(){
        int[] arr = {5,6,7,8,9,11,12,13};
        Random random = new Random();
        Boolean flag = true;
        for (int i=0;i<arr.length;i++){
            int value = arr[i];
            for ( int k = 2 ; k < value/2 ;k++){
                if(value % k == 0 && value!=k){
                    flag = false;
                    break;
                }
            }
            if(flag==true){
                System.out.println(arr[i] + " la so NGUYEN TO");
            }else {
                System.out.println(arr[i] + " khong phai so nguyen to");
            }
        }
    }
}
