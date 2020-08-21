/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

/**
 *
 * @author ELCOT
 */
public class degrees {
    
    public static void main(String[] args)
    {
        undergraduate obj=new undergraduate();
        obj.getdegree();
        postgraduate obj1=new postgraduate();
        obj1.getdegree();
    }
    
}
class degree
{
        public void getdegree()
        {
            System.out.println("I GOT A DEGREE");
        }
}
class undergraduate extends degree
{
    public void getdegree()
        {
            super.getdegree();    
            System.out.println("I AM AN UNDERGRADUATE");
        } 
}
class postgraduate extends degree
{
     public void getdegree()
        {
            super.getdegree();
            System.out.println("I AM AN POSTGRADUATE");
        }
}