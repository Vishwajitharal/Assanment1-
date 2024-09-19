package assament;

public class armstrong
{
    public static void main(String[] args) {
        int num=153 ;
        int  sum=0 ;
        int rem;
     int   tem=num;

     while (num>0){
         rem=num%10;
         sum=sum+(rem*rem*rem);
         num=num/10;
     }
     if(tem==sum){
         System.out.println("the number is armstrom");
     }
     else {
         System.out.println("The number is not armstrom");
     }
    }
}
