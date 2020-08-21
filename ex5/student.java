/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;
import java.util.Scanner;
/**
 *
 * @author ELCOT
 */
public class student {
    
    public static void main(String[] args)
    {
        result s=new result();
        s.calculate();
        s.display();
    }
}
class stud
{
    //super.read();
  String name;
   String rollno;
   //String dept;
   Scanner obj=new Scanner(System.in);
   public void read()
   {
       System.out.println("enter the name of the student:");
       name=obj.next();
       System.out.println("enter the roll no of the student:");
       rollno=obj.next();
       //System.out.println("enter the department of student:");
       //dept=obj.next();
   }
   public void display()
   {
      System.out.println("\nSTUDENT DETAILS\n");
      System.out.println("NAME:"+name);
      System.out.println("ROLLNO:"+rollno);
     // System.out.println("DEPARTMENT:"+dept);
   }
}
class mark extends stud
{
    
    double m1;
    double m2;
    double m3;
    //Scanner obj=new Scanner(System.in);
    
      public void read()
    {
        super.read();
      System.out.println("enter the marks of student:");
       m1=obj.nextDouble();
       m2=obj.nextDouble();
       m3=obj.nextDouble();      
    }
    public void display()
    {
        super.display();
        System.out.println("MARK1:"+m1+"\nMARK2:"+m2+"\nMARK3:"+m3);
    }
}
class result extends mark
{
    double total,avg;
    public void calculate()
    {
     super.read();
     total=m1+m2+m3;
     avg=total/3;
    }
    public void display()
    {
        super.display();
        //System.out.println("marks result:");
        System.out.println("total: "+total);
        System.out.println("average: "+avg);
    }
}