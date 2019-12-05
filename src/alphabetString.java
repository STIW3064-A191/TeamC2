import java.util.Scanner;
public class alphabetString {
   public static void main(String[] args) {
       Scanner inp = new Scanner(System.in);
       System.out.print("Input: ");
       String s = inp.nextLine();//read input string

       for (int i = 0; i < s.length(); i++) {//loop to cycle all single char in string
           char charAt2 = s.charAt(i);//loop all char from string
           if (Character.isLetter(charAt2)) {//alphabet check
               System.out.print(charAt2);
           }
       }
   }
}
