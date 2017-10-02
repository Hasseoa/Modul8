import java.util.Scanner;

public class MainChallenges {

    public static void main(String[] args) {
        //toASCII();
        //myToUpper();
        extractNum();
    }

    private static void toASCII(){
        System.out.print("Ange en sträng: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("The characters are:");

        for (int i = 0; i <input.length() ; i++) {
            char c = input.charAt(i);
            System.out.println(c+" - "+ (int) c);
        }
    }

    private static void myToUpper(){
        System.out.print("input: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print("output: ");
        char[] cArray = s.toCharArray();

        for (int i = 0; i < s.length() ; i++) {
            if(cArray[i] == ' ' || cArray[i] < 97 || cArray[i] >122){
            }
            else{
                cArray[i] -= 32;
            }
        }

        s = new String(cArray);
        System.out.print(s);
    }

    private static void extractNum(){
        System.out.print("input: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print("output: ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i) >= 48 && s.charAt(i) <= 57){
                sb.append(s.charAt(i));
            }
        }
        s = sb.toString();
        System.out.println(s);





    }



}
