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
        int tcase,limit=1,input,size=0,i=-1,d=0;char letter;
        Scanner sc=new Scanner(System.in);
        tcase=sc.nextInt();
        Queue<Integer> q=new LinkedList<Integer>();
        while(limit<=tcase)
        {
            letter=sc.next().charAt(0);
            switch(letter)
            {
                case 'E':
                    {
                        input=sc.nextInt();
                        q.add(input);
                        size=q.size();
                        System.out.println(size);
                        break;
                    }
                case 'D':
                    {
                       if(size!=0)
                       {
                      d=q.poll();
                      size=q.size();
                      System.out.println(d+" "+size);
                    }
                    else
                    {
                        System.out.println(i+" "+size);
                    }
                
                    }
                    break;
            }
            limit++;
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
