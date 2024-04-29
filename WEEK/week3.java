public class week3 {
    public static void main(String[] args) {
       // 1. Write a JAVA program to find the maximum between three numbers.
            int num1 = 10;
            int num2 = 25;
            int num3 = 15;
    
            int max = num1;
    
            if (num2 > max) {
                max = num2;
            }
    
            if (num3 > max) {
                max = num3;
            }
    
            System.out.println("The maximum number among " + num1 + ", " + num2 + ", and " + num3 + " is: " + max);
        }
    }
    
    
    
    

