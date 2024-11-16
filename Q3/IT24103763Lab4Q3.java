import java.util.Scanner;
public class IT24103763Lab4Q2 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int num ;
        
        System.out.print("Enter a number:");
        num=input.nextInt();
        String message = (num==0) ? "This number is : Zero" : (num>0) ? "This number is : Positive" : "This number is : Negative";
        System.out.print(message);
    }
}
