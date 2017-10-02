import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    //8.4! ful

    public static void main(String[] args) throws NoSuchElementException{
        u8_4();

    }

    private static void u8_11(){
        char[] a = {'J', 'a', 'v', 'a', 'R', 'u', 'l', 'e', 's'};

        for (int i = a.length-1; i >= 0; i--) {
            System.out.print(a[i]);
        }
    }

    private static void u8_1_2(){
        char[] a = {'J', 'a', 'v', 'a', 'R', 'u', 'l', 'e', 's'};
        for (int i = 0; i <=a.length-1 ; i+=2) {
            System.out.print(a[i]);
        }
    }
    private static void u8_1_3(){
        char[] a = {'J', 'a', 'v', 'a', 'R', 'u', 'l', 'e', 's'};

        String s ="";
        for (int i = 0; i <a.length ; i++) {
            s = s+a[i];
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
        }

        System.out.println(s);
        System.out.println(sb);
    }

    private static void u8_1_4(){
        String name ="Java Svensson";
        char[] chars = new char[name.length()];

        for (int i = 0; i < name.length(); i++) {
            chars[i] =name.charAt(i);
        }
        for (char c:chars){
            System.out.print(c);
        }

    }

    private static void u8_1_5(){
        String input ="1,2,4,9,8,7,6,4,1";
        int[] integers = new int[100];
        int numberInts=0;
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) != ','){
                integers[numberInts]=input.charAt(i)-48;//convert char to int
                numberInts++;
            }
        }
        for (int i = 0; i < numberInts ; i++) {
            System.out.print(" "+integers[i]);
        }
}

    private static void u8_2(){

        System.out.println();
        System.out.println("ASCII TABLE (no specials)");
        System.out.print("================================================================================================");
        System.out.println();
        for (int i = 33; i <127 ; i++) {
            char c = (char) i;
            System.out.print("[hex "+Integer.toHexString(i)+" ]:"+c+" ");
            if(i%8 == 0){
                System.out.println();
            }
        }
        System.out.println();
        System.out.print("================================================================================================");
    }

    private static void u8_3(){//ev. rörig kod p.g.a många omskrivningar
        while(true){
            System.out.println("Write string");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            if(s == null){
                System.out.println("exit");
                break;
            }
            if(s.equals("")){
                System.out.println("exit");
                break;
            }

            int leftIndex = s.indexOf('(');
            int rightIndex = s.indexOf(')');

            if(leftIndex <0 || rightIndex <0 || leftIndex > rightIndex ){
                System.out.println("input error");
                break;
            }
            System.out.println("OK!");

        }//end of infinity
    }

    private static void u8_4(){

        String s ="33.ab.66.hh.7k";//remove dots

        StringBuilder sb = new StringBuilder(s.length());

        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i) != '.'){
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
        System.out.println();

        s = "123, 45,-34,231, 0,-1,-12312 , 12312,23423"; //tar bort negativa & mellanrum
        String sfinal = "";


        while(true){
            int nextComma = s.indexOf(',');

            if (nextComma == -1){
                if(s.charAt(0) != '-'){
                    sfinal += ","+s;
                    break;
                }
                else{
                    sfinal += ",0";
                    break;
                }
            }

            String temp = s.substring(0,nextComma);
            temp = temp.trim();
            if(temp.charAt(0) != '-'){
                sfinal += ","+temp;
            }
            else{
                sfinal += ",0";
            }
            sfinal = sfinal.trim();
            s = s.substring(nextComma+1);


        }
        sfinal = sfinal.substring(1);//tar bort första kommat
        System.out.println(sfinal);
        System.out.println("123,45,0,231,0,0,0,12312,23423");//för att jämföra med facit
        System.out.println();

        s="ghkdfsd jksdfhjk dfjkd kkl    ";//lägger till punkt
        s = s.trim();
        if( s.charAt(s.length()-1) != '.'){
            s += '.';
        }
        System.out.println(s);
    }

    private static void u8_5(){//&8.6
        StringBuilder sb = new StringBuilder();
        String bgColor;

        sb.append("<table>\n");


        for (int i = 1; i <=10 ; i++) {
            if(i%2 == 0){
                bgColor = "bgcolor=\"#ffffff\"";
            }
            else{
                bgColor = "bgcolor=\"#cccccc\"";

            }

            sb.append("  <tr "+bgColor+">\n");
            sb.append("     <td>Row"+i+"</td>\n");
            sb.append("     <td>xxxxx<td>\n");
            sb.append("  </tr>\n");
        }
        sb.append("</table>\n");
        System.out.println(sb);

    }

    private static void u8_6(){//random

        Random rand = new Random(-229985452);
        for(int i=0;i<5;i++) {
            int r=96 + rand.nextInt(27);
            char c = (char)r; System.out.print(c);
        }
        rand = new Random(-147909649);
        for(int i=0;i<5;i++) {
            int r = 96 + rand.nextInt(27);
            char c = (char) r;
            System.out.print(c);
        }
        System.out.println();
        long[] a = {-73, -157512326, -112386651, 71425, -104434815,
                -128911, -88019, -7691161, 1115727};
        for (int i = 0; i < a.length; i++) {
            Random r = new Random(a[i]);
            StringBuilder sb = new StringBuilder();
            int n;
            while ((n = r.nextInt(27)) > 0) sb.append((char)('`' + n));
            System.out.println(sb);
        }

    }

    private static void u8_7(){ // reciept

        Scanner sc = new Scanner(System.in);
        double sum = 0;
        double tax = 0;
        String recieptString="";

        while(true){
            System.out.println("Product name?");
            String item = sc.next();
            if (item == null || item.equals("") || item.equals("0")) {
                break;
            }

            System.out.println("price per unit?");
            double price = sc.nextDouble();
            if(price == Double.NaN){
                break;
            }
            System.out.println("Quantity bought?");
            int quant = sc.nextInt();
            if(quant == 0){
                break;
            }
            System.out.println("Food item? y/n");
            String food = sc.next();
            if(!(food.equals("y") || food.equals("n"))){
                break;
            }

            recieptString += item+"\n";
            sum += price*quant;
            if(food.equals("y")){
                tax +=sum*0.1;
            }
            else{
                tax += sum*0.25;
            }
        }
        sc.close();

        System.out.println("===== RECEIPT =====");
        System.out.print(recieptString);
        System.out.println();
        System.out.println("Total amount without tax: "+sum);
        System.out.println("Total amount with tax: "+(sum+tax));
        System.out.println("Tax: "+tax);
        System.out.println("===================");
    }


}
