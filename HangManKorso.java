
package hangmankorso;

import java.util.Scanner;

public class HangManKorso{
     public static int count=0;
     public static String q1  ="what is the capital of Finland? "
     , q2 ="what is the capital of Sweden? "
     , q3 ="what is the capital of Iraq? "
     , q4 ="what is the capital of Thailand? "
     , q5 ="what is the capital of Indenosia? "
     , q6 ="what is the capital of norway? "
     , a1 ="helsinki"
     , a2 ="stockholm"
     , a3 ="bagdad"
     , a4 ="bangkok"
     , a5 ="jakarta"
     , a6 ="oslo";
     
        //making question classes   
        public static String question1(String q1) {
            Scanner sc = new Scanner(System.in);
            System.out.print(q1);
            String userAnswer = sc.nextLine();
            return (userAnswer);  
}
        public static String question2(String q2) {
            Scanner sc = new Scanner(System.in);
            System.out.print(q2);
            String userAnswer = sc.nextLine();
            return (userAnswer);  
}
        public static String question3(String q3) {
            Scanner sc = new Scanner(System.in);
            System.out.print(q3);
            String userAnswer = sc.nextLine();
            return (userAnswer);  
}
        public static String question4(String q4) {
            Scanner sc = new Scanner(System.in);
            System.out.print(q4);
            String userAnswer = sc.nextLine();
            return (userAnswer);  
}
        public static String question5(String q5) {
            Scanner sc = new Scanner(System.in);
            System.out.print(q5);
            String userAnswer = sc.nextLine();
            return (userAnswer);  
}
        public static String question6(String q6) {
            Scanner sc = new Scanner(System.in);
            System.out.print(q6);
            String userAnswer = sc.nextLine();
            return (userAnswer);  
}        
    public static void main(String[] args) {
        
        //add scanner method
        Scanner sc = new Scanner(System.in);
        
        //ask the user name
        System.out.println("Name: ");
        String userName = sc.nextLine();
        
        //show the welcome of the game
        System.out.println("I welcome you dear " + userName + "! answer each questiong correctly and you get a point. have fun!");
        System.out.println("");
        
        while(true){
        //in the loop we call all the classes in order
        String k = question1(q1);
        
        //check the user's answer && count points
        if(k.equals(a1)){
             count++;
             System.out.println(" your points is "+count);
        }else{
            count--;
            System.out.println("your answer were wrong!");
        }
        
        //same for the second question class
        k = question2(q2);
        
        if(k.equals(a2)){
            count++;
            System.out.println(" your points is "+count);
        }else{
            count--;
            System.out.println("your answer were wrong!");
        }
        
        //same for the third class and so on.
        k = question3(q3);
        
        if(k.equals(a3)){
            count++;
            System.out.println(" your points is "+count);
        }else {
            count--;
            System.out.println("your answer were wrong!");
        }
        
        //calling class
        k = question4(q4);
        
        //checking answer, countPoints
        if(k.equals(a4)){
            count++;
            System.out.println(" your points is "+count);
        }else {
            count--;
            System.out.println("your answer were wrong!");
        }
        
        //calling class
        k = question5(q5);
        
        //check the answer, count points
        if(k.equals(a5)){
            count++;
            System.out.println(" your points is "+count);
        }else {
            count--;
            System.out.println("your answer were wrong!");
        }
        
        //calling calss
        k = question6(q6);
        
        //check the answer, count points
        if(k.equals(a6)){
            count++;
            System.out.println(" your points is "+count);
        }else{
            count--;
            System.out.println("your answer were wrong!");
        }
        break;
        }
        System.out.println("your final score is  "+count+" have good one bye bye dear "+userName);
    }

    
}


