/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week2;

/**
 *
 * @author dwiti
 */
public class Week2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        student[] list= new student[3];
        student s1=new student();
        s1.setName("Peter");
        s1.setAge(21);
        
        student s2=new student();
        s2.setName("Jonh");
        s2.setAge(25);
        
        student s3=new student();
        s3.setName("Hemi");
        s3.setAge(20);
        
        list[0]=s1;
        list[1]=s2;
        list[2]=s3;
         for(int i=0;i<list.length;i++)
         {
             System.out.println(list[i].getName()  +  list[i].getAge());
         }
        //push
        //fetch
        
    }
}

   
