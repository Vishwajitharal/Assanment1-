package assament;
import java.util.Scanner;
public class alternat {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("entar string");
        String input= sc.nextLine();


        int j=0;
        for ( j=0; j<=input.length(); j=j+2){
            System.out.println (" altaer string is "+input.charAt(j));
        }
    }
}
