import javax.swing.*;

public class Progam {


    public static void main (String[] args) {

        System.out.println("hello java");
        System.out.println("hello prog");

        // loop decrement
        for (int i = 10; i > 0; i--)
            System.out.println("Hello loop decrement  " + i);
        for (int i = 1; i <= 10; i++) {
            System.out.println(19 * i);
        }

        String name = "rahul";
        {
            System.out.println(name);
        }
        String cityname = "Tundla";{ System.out.println(cityname); }
        {
            cityname=  "Gujarat";{
            System.out.println( cityname );
            }

        int age=25; {
         System.out.println(  age   +     cityname); }
        }
        for (int i=1; i<10; i++){
            System.out.println("condition" + i);}
            for (int i = 10;  (i <= 0); i--)
            {
        System.out.println(2*i);
        }


    }
}


