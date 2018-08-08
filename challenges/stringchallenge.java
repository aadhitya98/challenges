/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        int tcase,i=1,len=0,count=0,len1=0,j,count1=0;String url;String url1="";char ch;
        Scanner sc=new Scanner(System.in);
        tcase=sc.nextInt();
        while(i<=tcase)
        {
            url=sc.next();
            len=url.length();
            //url1=new String[250];
            url1=url.substring(4);
            len1=url1.length();
            for(j=0;j<len1;j++)
            {
                ch=url1.charAt(j);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                count++;
            }
            count1=(len1-count)+1;
            System.out.println(count1+"/"+len);
            count=0;
            i++;
        }
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here

    }
}
