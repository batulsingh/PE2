import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        String reversed = "";
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String :");
        String strinput = sc.nextLine();

        String lowerCaseString = strinput.toLowerCase();

        int length;
        length = lowerCaseString.length();

        for(int i = length-1 ; i>=0 ; i--)
            reversed+= lowerCaseString.charAt(i);

        if(strinput.equals(reversed)){
            System.out.println("String is a palindrome.");
        }
        else{
            System.out.println("String is not a palindrome.");
        }
        System.out.println("You Entered :" + strinput);
        System.out.println("Reversed String is :" + reversed);
    }
}
