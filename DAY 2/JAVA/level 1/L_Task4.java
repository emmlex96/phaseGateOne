import java.util.Scanner;
public class L_Task4{
public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("print firstNumber");
    int firstNumber = input.nextInt();

    System.out.print("print secondNumber");
    int secondNumber = input.nextInt();

    int sum =(firstNumber + secondNumber);
    System.out.print(sum);
}
}
