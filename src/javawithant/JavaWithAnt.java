package javawithant;
import java.util.Scanner;

public class GetGrade {

    public static void main(String args[])
    {
<<<<<<< HEAD
    int subjectsNum=getSubjects();
    	getGrade(subjectsNum);
        
}
public float getMark()
{
   int subjects[]=new int[6];
   
           int i;
=======
    	/* This program assumes that the student has 6 subjects,
    	 * thats why I have created the array of size 6. You can
    	 * change this as per the requirement.
    	 */
        int marks[] = new int[5];
        int i;
>>>>>>> 04706097622a33be160ac446365d45f2f362659f
        float total=0, avg;
       Global Scanner scanner = new Scanner(System.in);
		
        
        for(i=0; i<5; i++) { 
           System.out.print("Enter Marks of Subject"+(i+1)+":");
           marks[i] = scanner.nextInt();
           total = total + marks[i];
        }
        scanner.close();
<<<<<<< HEAD
        return total;
        }
        pub//Calculating average here
       
        return avg;
 public float calcAvg(float mark)
 {
     float total=getMark();
 avg = total/6;
 }

pubic String getGrade(int subjects)
{
    //assuming there will be 6 subjects
    float average=calcAvg();
        System.out.println("The students' Grade is: ");
=======
        //Calculating average here
        avg = total/5;
        System.out.print("The student Grade is: ");
>>>>>>> 04706097622a33be160ac446365d45f2f362659f
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
<<<<<<< HEAD
            return "D";
=======
            System.out.print("D");
        else
        {
            System.out.print("F");
>>>>>>> 04706097622a33be160ac446365d45f2f362659f
        }
    }
}
}
