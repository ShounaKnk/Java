import java.util.*;

public class javastrings {
    public static void main (String args[])
    {
        String s1 = new String("hello");
        String s2 = new String("hello");

        // System.out.println(s1);
        // s1.concat(" java");
        // System.out.println(s1);
        // s1.intern();

        //toUpperCase/toLowerCase prints the string in uppercase/lowercase WITHOUT DOING ANY 
        //CHANGES TO THE ORIGINAL STRING
        System.out.println("Uppercase: "+s1.toUpperCase());

        //compares 2 strings CONSIDERING the cases
        System.out.println("Equal: "+s1.equals(s2));
        //compares 2 strings ignoring the cases      
        System.out.println("Equal: "+s1.equalsIgnoreCase(s2));

        //compares 2 strings CONSIDERING the cases
        int k = s1.compareTo(s2);
        if(k == 0 )
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("NOt Equal");
        }

        //SPLIT function(not working here)
        String h1 = new String("DML is: ");
        String h2 = new String("data manipulation language,"+" data markup lang");
        System.out.println(h1);
        for(String options: h2.split(","))
        {
            System.out.println(h2);
        }

        //REPLACE function
        String f1 = new String("warren is bad boy. warren does bullshit");
        System.out.println(f1);
        System.out.println(f1.replaceAll("warren", "rayyan"));

        // TRIM funtion is used to remove trialing and ending whitespaces
        String h3 = new String("   malong cook");
        System.out.println(h3);
        System.out.println(h3.trim());

        //CONTCAT funtion combines 2 strings (DOESNT AFFTECT THE ORIGINAL STRING)
        String h4 = new String("no. 1 tt player");
        System.out.println(h3.concat(h4));

        //STRING TOKENIZER does similar functionality as split function
        String message = new String("java is an OOP lang");
        StringTokenizer str = new StringTokenizer(message, " ");
        while(str.hasMoreTokens())
        {
            System.out.println(str.nextToken());
        }

        //getCHars copies some part f the string into a charater array
        String h5 = new String("GobbleStick");
        char c1[] = new char[h5.length()-5];
        h5.getChars(0, h5.length()-5, c1, 0);
        System.out.println("using getCHars(): ");
        for(int i=0; i<c1.length; i++ )
        {
            System.out.print(c1[i]);
        }
    }
}
