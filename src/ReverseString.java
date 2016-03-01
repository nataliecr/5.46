import java.util.Scanner;

public class ReverseString {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String s = input.nextLine();

    String reverse = "";
    for(int i = s.length() - 1; i >= 0; i--)
      reverse = reverse + s.charAt(i);
    
    System.out.println("The reverse string is " + reverse);  
  } // main   
} // ReverseString
