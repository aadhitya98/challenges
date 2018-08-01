import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int a[],n,i,number,pos=0;
        n=sc.nextInt();
        number=sc.nextInt();
        a=new int[100000];
        for(i=1;i<=n;i++)
        a[i]=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(a[i]==number)
            pos=i;
        }
        System.out.println(pos);