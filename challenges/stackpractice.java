import java.util.*;
class TestClass {
   
    
    public static void stackpushchef(Stack<Integer>st,int a) //Chef Query
    {
       // int a;
        //a=sc.nextInt();
        st.push(a);
        
    }
    public static void stackpushcustomer(Stack<Integer>st1,int i)//Customer Query
    {
        st1.push(i);
    }
    
    public static void stackpopchef(Stack<Integer>st)
    {
        
        Integer p=(Integer)st.pop();
        System.out.println(p);
    }
    public static void main(String args[] ) throws Exception {
        Stack<Integer>st=new Stack<Integer>();
        Stack<Integer>st1=new Stack<Integer>();
         Scanner sc=new Scanner(System.in);
        int tcase,cas;
        
        tcase=sc.nextInt();
        int limit=1;
        while(limit<=tcase)
        {
            cas=sc.nextInt();
            switch(cas)
            {
                case 1:
                    {
                    try
                    {
                      stackpopchef(st);  
                    }catch(Exception e)
                    {
                        System.out.println("No Food");
                    }
                    break;
                    }
                    case 2:
                        {
                            int price;
                            price=sc.nextInt();
                            stackpushchef(st,price);
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
