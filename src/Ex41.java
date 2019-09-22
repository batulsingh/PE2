import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = sc.nextInt();
        boolean res = Ex42.isEven(num);
        System.out.print(res);
    }
}

