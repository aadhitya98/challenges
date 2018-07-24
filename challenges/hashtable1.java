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
       
        int key,i,n,number;int a[];String str;
        Scanner sc=new Scanner(System.in);
        Map<Integer,String> hash=new HashMap<Integer,String>();
        n=sc.nextInt();
       
        for(i=0;i<n;i++)
        {
            key=sc.nextInt();
            str=sc.next();
            hash.put(key,str);
        }
        number=sc.nextInt();
         a=new int[100];
        for(i=0;i<number;i++)
        {
           
            a[i]=sc.nextInt();
        }
        for(i=0;i<number;i++)
        {
            System.out.println(hash.get(a[i]));
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
