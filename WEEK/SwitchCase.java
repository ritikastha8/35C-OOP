public class SwitchCase {
    public static void main(String[] args) {
        char value = 'a';
        int numVal = 10;
        switch (value){
            case 'a':
            //Nested Switch
               switch(numVal){
                case 10:
                 System.out.println("10");
                 break;
                default:
                System.out.println("Default");
                break;
               }
            System.out.println("Apple");
            break;
            case 'b':
            System.out.println("Ball");
            break;
            case 'c':
            System.out.println("Cat");
            break;
            case 'd':
            System.out.println("Dog");
            break;
            default:
            System.out.println("No word found");
            break;

        }

        /*Task 
 * Consider the variable week in int
 * if the value is 
 * 0 - Print Sunday
 * 1 - Print Monday
 * 2 - Print Tuesday
 * 3 - Print Wednesday
 * 4 - Print Thursday
 * 5 - Print Friday
 * 6 - Print Saturday
 * if the value is other than these Print Invalid Week
 */
       int weekday = 3;
       switch (weekday){
        case 0 :
        System.out.println("Sunday");
        break;
        case 1 :
        System.out.println("Monday");
        break;
        case 2 :
        System.out.println("Tuesday");
        break;
        case 3 :
        System.out.println("Wednesday");
        break;
        case 4 :
        System.out.println("Thursday");
        break;
        case 5 :
        System.out.println(" Friday");
        break;
        case 6 :
        System.out.println("Saturday");
        break;
        default:
        System.out.println(" Invalid Week");
        break;

       }
    }

}



 


