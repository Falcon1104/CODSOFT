/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradecalculator;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author kulka
 */
class Student {

    Scanner sc;
    public int marks[]={0,0,0,0,0};
    public String subjects[]={"","","","",""};
    public String name;
    public int tot = 0;

    public Student() {
        sc = new Scanner(System.in);

        System.out.println("Enter student name");
        name = sc.nextLine();

        for (int i = 0; i < 5; i++) {
         
            System.out.println("Enter subjects");
            subjects[i]=sc.nextLine();


    }
        
        for (int i = 0; i < 5; i++) {
         
            System.out.println("Enter marks");
            marks[i]=sc.nextInt();

    }
 }
    public void calTotal() {



        //calculating total
        for (int i = 0; i < 5; i++) {
            
            
             
            System.out.print( subjects[i]+" : "+ marks[i]);
            tot += marks[i];
            System.out.println(" "+"Percentage for "+subjects[i]+" : "+marks[i]+"%");

        }

        System.out.println("Total : " + tot);
        System.out.println("Out-off"+" : "+(5*100));
        
        
        

    }
    
    
    public void getPerecentandGrade(){
    
    int percent=0;
    percent=(int)(tot*100)/(5*100);
    
    System.out.println("Total Percent : "+percent+"%");
    
    if(percent>=95){
    
    System.out.println("Grade achieved :  A+");
    }
    else if( percent>=90){
    
    System.out.println("Grade achieved : A ");
    } 
    else if(percent>=85 ){
    
        System.out.println("Grade achieved : B+ ");
        
    }
        else if(percent>=80 ){
    
        System.out.println("Grade achieved : B ");
        
    }
        else if(percent>=75 ){
    
        System.out.println("Grade achieved : C+ ");
        
    }
        else if(percent>=70 ){
    
        System.out.println("Grade achieved : C ");
        
    }
        else if(percent>=45 ){
    
        System.out.println("Grade achieved :  D+ ");
        
    }
        else if(percent>=35 ){
    
        System.out.println("Grade achieved : D ");
        
    }
        else if(percent<35 ){
    
        System.out.println("Grade achieved : E  ");
        
    }

    
    }

}

public class GradeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Student st = new Student();
        st.calTotal();
        st.getPerecentandGrade();
    }

}
