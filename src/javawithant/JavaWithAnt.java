package javawithant;
import java.util.Scanner;
//////This program is CLI based and gets marks for 6subjects and prints calculated grade to console
public class GetGrade {

    public static void main(String args[])
    {
    int subjectsNum=getSubjects();
    String grade=getGrade(subjectsNum);


        System.out.println("Grade for entered marks is :"+grade);
        
}
public float getMark()
{
   int subjects[]=new int[6];
   
           int i;
        float total=0, avg;
       Global Scanner scanner = new Scanner(System.in);
		
        
        for(i=0; i<5; i++) { 
           System.out.print("Enter Marks of Subject"+(i+1)+":");
           marks[i] = scanner.nextInt();
           total = total + marks[i];
        }
        scanner.close();
        return total;
        }
        //Calculating average here
       
        
 public float calcAvg(float total)
 {
 float totalMark=total;
 float avg = totalMark/6;
 return avg;


 }

pubic String getGrade(float avg)
{
    //assuming there will be 6 subjects
    float average=avg;
        System.out.println("The students' Grade is: ");
        if(avg>=80)
        {
            return "A";
        }
        else if(avg>=60 && avg<80)
        {
           return "B";
        } 
        else if(avg>=40 && avg<60)
        {
           return "C";
        }
         else if(avg>=35 && avg<39)
        {
            return "D";
        }
        else if(avg<35 && avg >0)
        {
            return "F";
        }
        else{
            return"invalid input";
        }
    }
}
}
