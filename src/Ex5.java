import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        int average,smallest,largest,temp,sum=0;

        for(int i=0; i<length; i++){
            System.out.print("Enter the marks of student "+ (i+1)+" :");
            arr[i] = sc.nextInt();
            if(arr[i]<0 || arr[i]>100){
                System.out.println("Entered Marks should be between 0 and 100, Enter again");
                i = i-1;
            }
        }

        for(int i =1; i<length; i++){
           for(int j=i; j>0; j--){
               if(arr[j]<arr[j-1]){
                   temp = arr[j];
                   arr[j] = arr[j-1];
                   arr[j-1] = temp;
               }
            }
        }
        largest = arr[length-1];
        smallest = arr[0];

        for(int i=0; i<length; i++){
            sum += arr[i];
        }
        average = sum/length;

        System.out.println("The average is :"+average);
        System.out.println("The minimum is :"+smallest);
        System.out.println("The maximum is :"+largest);
    }
}