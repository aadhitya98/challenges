/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ll1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author aadhitya98
 */
public class LL1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1,j,k,element,a1[],a2[],a3[],n,count=0,index;
        a1=new int[100];
        a2=new int[100];
        a3=new int[100];
        LinkedList<Integer> l=new LinkedList<Integer>();
        while(i==1)
        {
        element=sc.nextInt();
        
        l.add(element); 
        n = l.size();
        
        Iterator<Integer> li1=l.iterator();
       
        while(li1.hasNext())
        {
        //for(Integer c:l)
        //{
           for(k=0;k<n;k++)
            {
                a1[k]=(int) li1.next();
               //a1[k]=c;
            }
            //System.out.println("--");
            //System.out.println(li.next());
         }
        //for(k=0;k<n;k++)
        //{
          //  System.out.println(a1[k]);
        //}
         ListIterator<Integer> li=l.listIterator(l.size());
        while(li.hasPrevious())
        {
            for(k=0;k<n;k++)
            {
                a2[k]=(int)li.previous();
            }
        }
        //for(k=n-1;k>=0;k--)
        //{
           // index=0;
         //a3[index]  =a2[k];
         //index++;
       // }
        //for(i=0;i<n;i++)
           // {
              //  System.out.println(a2[i]);
            //}
        System.out.println("Do you want to add another element");
        i=sc.nextInt();
        }
       
        
       /* for(k=0;k<n;k++)
        {
            //j=k;
            for(j=0;j<n;j++)
            {
            if(a1[k]==a2[j])
            {
                count++;
                break;
                //System.out.println(count);
            }
            //j++;
        }
        }
        System.out.println(count);
        //if(count==n)*/
       if(Arrays.equals(a1,a2))
            System.out.println("List is Palindromic");
        else 
            System.out.println("Not Palindromic");
        
       // for(Integer e:l)
           // System.out.println("The list in normal order "+e);
        
        // TODO code application logic here
    
    }
    
}
