public class week2 { 
    public static void main(String[] args) {
            /*Task 1  
            Write a program to check whether a person can cast a vote or not. The condition is you must be over 18 years old to vote.*/
         
            int a1 = 2;
            System.out.println("Is a greater or equals to 18 ?" + (a1 >= 18));
    
    
             /* Task 2
              * Write a program to print simple interest from variables
              * Make 3 variable for amount , time nd rate and save the calculation into a varaible
              * Formula:
              * si = amount * time* rate/100:
              */
            int amount1 = 2000;
            int time1 = 2;
            int rate1 = 10;
            /*double // */
            int si1 = (amount1 * time1 * rate1 ) / 100;
            System.out.println("The si is "+(si1));
    
    
    
            /* Task 3
             * Write a program to print the area and perimeter of rectangle
             * a= l *b
             * p= 2(l+b)
             */
    
            int l11 = 20;
            int b11= 50;
            int a11 = l11 * b11;
            int p11 = 2*(l11+b11);
            System.out.println("The area of rectangle is "+a11);
            System.out.println("The perimeter of reectangle is "+p11);
             
           
    
    
    
            /* Task 4 
             * complete the task 1 using ternary opertors
             */
           int ok =  1;
           boolean re = ok >= 18; 
           String result = re ? "It is greater or equal to 18."
                                 : "It is less than 18 ";
           System.out.println(result);  

           /* Task 10
            * Write a program to calculate the total marks of four subjects of a student and the total percentage secured.
            * And use the following conditions to generate the final result;
            * a. If equal to or more than 70 -> First Class
            * b. If more than 59 -> Upper Second Class
            * c. If more than 49 -> Second class
            * d. If more than 39 -> Third class and if below than 40 the result is fail. 
            * Hint: Use ternary operator*/



           int math = 38 , science = 60 , english = 35 , biology = 90;
           int total = math+science+english+biology;
 
           float percentage= (float)(total)*100/400;
           System.out.println(percentage);
   
       
           String result1= percentage >= 70 ? "First Class":
                          percentage > 59 ?"Upper Second Class":
                          percentage > 49? "Second Class":
                          percentage > 39 ?"Third Class"
                                      :"Fail" ;
           System.out.println(result1);

          

          /* Task 5
           Write a program to take two integer inputs from the user and print the sum and product of them.*/









          /*6. Take two integer inputs from the user. First, calculate the sum of two, then the product of two. 
          Finally, calculate the division of the thus obtained sum and product and print the result.*/



          
          /*7. Take the name, roll number, and field of interest from the user and print in the format below:
           Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz.*/



           
          /*8. Take side of a square from user and print area and perimeter of it.
           Also, calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid. Take the attributes as user input.*/





          /*9.  Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.*/
          




         
           /* Task 10
          Write a program to calculate the total marks of four subjects of a student and the total percentage secured.
           And use the following conditions to generate the final result;
           a. If equal to or more than 70 -> First Class
           b. If more than 59 -> Upper Second Class
           c. If more than 49 -> Second class
           d. If more than 39 -> Third class and if below than 40 the result is fail. 
           */
 
          //WITHOUT USE OF TERNARY OPERATOR

          int math1 = 38 , science1 = 60 , english1 = 35 , biology1 = 90;
          int total1 = math1+science1+english1+biology1;

          float percentage1= (float)(total1)*100/400;
          System.out.println(percentage1);
  
          /*make total variable and percentage variable */
          if (percentage1 >= 70){
              System.out.println("First Class");
          }else if (percentage1>59){
              System.out.println("Upper Second Class");
          }else if (percentage1> 49){
              System.out.println("Second Class");
          }else if (percentage1>39){
              System.out.println("Third Class");
          }else{
              System.out.println("Fail");
          }


         
  



    }
}
