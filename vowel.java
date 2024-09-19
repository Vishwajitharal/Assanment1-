package assament;

public class vowel {
    public static void main(String[] args) {


        int i;
        String R = " i am don";

        for (i = 0; i < R.length(); i++) {

            if(R.charAt(i)=='a'|| R.charAt(i)=='e'||R.charAt(i)=='o'||R.charAt(i)=='u'||R.charAt(i)=='i'){

                System.out.println("Given string vowel is "+R.charAt(i));
            }


        }

    }
}