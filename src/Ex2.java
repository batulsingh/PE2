import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();

        while(num>=4){
            if((num % 4) != 0){
            System.out.print("Not a Power of 4");
            }
            num /= 4;
        }
        if(num == 1){
            System.out.print("Power of 4");
        }
    }
}
