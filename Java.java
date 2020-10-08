// /**
//  * Java
//  */
import java.util.Scanner;

// public class Java {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("What was the grade?");
//         int grade = Integer.parseInt(input.nextLine());

//         if (grade>= 90){
//             System.out.println("Your grade is an A");
//         }
//         else if (grade>= 80) {
//             System.out.println("Your grade is a B");
//         }
//         else if (grade>= 70){
//             System.out.println("Your grade is a C");
//         }
//         else if (grade>=60){
//             System.out.println("Your grade is a D");
//         }
//         else {
//             System.out.println("Your grade is an F. Study more.");
//         }
//     }
// }

// // This is the switch statement
// public class Java {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("What was the grade?");
//         Integer grade = Integer.parseInt(input.nextLine());
//         grade= grade/10;

//         switch (grade) {
//             case 9:
//                 System.out.println("Your grade is an A");
//                 break;
            
//             case 8:
//                 System.out.println("Your grade is a B");
//                 break;
            
//             case 7:
//                 System.out.println("Your grade is a C");
//                 break;
            
//             case 6:
//                 System.out.println("Your grade is a D");
//                 break;
//             default:
//                 System.out.println("Your grade is an F. Study more.");
//             }
//         }
        
//     }
// Switch statements are easier to read so they are used more frequently than if statements

    /**
     * InnerJava
     */
    public class Java {
    
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("what toppings do you like on Pizza? ");
            String topping= input.nextLine();
            
            if (topping.equals("pineapple")){
                System.out.println("Oh, I like that too!\n Any other toppings?");
                topping= input.nextLine();
                if(topping.equals("sausage")){
                    System.out.println("Oh, I like that too!\n Any other toppings?");
                    topping=input.nextLine();
                }
                else if(topping.equals("onion")){
                    System.out.println("Oh, I like that too!\n Any other toppings?");
                    topping=input.nextLine();
                }
                else if(topping.equals("tomato")){
                    System.out.println("Oh, I like that too!\n Any other toppings?");
                    topping=input.nextLine();
                }
                else if(topping.equals("peppers")){
                    System.out.println("Oh, I like that too!\n Any other toppings?");
                    topping=input.nextLine();
                }
                else {
                    System.out.println("Oh, I've never tried that!");}}
            
            else if(topping.equals("sausage")){
                System.out.println("Oh, I like that too!\n Any other toppings?");
                topping=input.nextLine();
                if(topping.equals("pineapple")){
                    System.out.println("Oh, I like that too!\n Any other toppings?");
                    topping=input.nextLine();
                }
                else if(topping.equals("onion")){
                    System.out.println("Oh, I like that too!\n Any other toppings?");
                    topping=input.nextLine();
                }
                else if(topping.equals("tomato")){
                    System.out.println("Oh, I like that too!\n Any other toppings?");
                    topping=input.nextLine();
                }
                else if(topping.equals("peppers")){
                    System.out.println("Oh, I like that too!\n Any other toppings?");
                    topping=input.nextLine();
                }
                else 
                    System.out.println("Oh, I've never tried that!");}
            
            else if(topping.equals("onion")){
                System.out.println("Oh, I like that too!\n Any other toppings?");
                topping=input.nextLine();
                if(topping.equals("sausage")){
                    System.out.println("Oh, I like that too!\n Any other toppings?");
                    topping=input.nextLine();
                }
                else if(topping.equals("pineapple")){
                    System.out.println("Oh, I like that too!\n Any other toppings?");
                    topping=input.nextLine();
                }
                else if(topping.equals("tomato")){
                    System.out.println("Oh, I like that too!\n Any other toppings?");
                    topping=input.nextLine();
                }
                else if(topping.equals("peppers")){
                    System.out.println("Oh, I like that too!\n Any other toppings?");
                    topping=input.nextLine();
                }
                else {
                    System.out.println("Oh, I've never tried that!");
            }}
            else if(topping.equals("tomato")){
                System.out.println("Oh, I like that too!\n Any other toppings?");
                topping=input.nextLine();
                if(topping.equals("sausage")){
                    System.out.println("Oh, I like that too!\n Any other toppings?");
                    topping=input.nextLine();
                }
                else if(topping.equals("onion")){
                    System.out.println("Oh, I like that too!\n Any other toppings?");
                    topping=input.nextLine();
                }
                else if(topping.equals("pineapple")){
                    System.out.println("Oh, I like that too!\n Any other toppings?");
                    topping=input.nextLine();
                }
                else if(topping.equals("peppers")){
                    System.out.println("Oh, I like that too!\n Any other toppings?");
                    topping=input.nextLine();
                }
                else {
                    System.out.println("Oh, I've never tried that!");}}
            
            else if(topping.equals("peppers")){
                System.out.println("Oh, I like that too!\n Any other toppings?");
                topping=input.nextLine();
                if(topping.equals("sausage")){
                    System.out.println("Oh, I like that too!\n Any other toppings?");
                    topping=input.nextLine();
                }
                else if(topping.equals("onion")){
                    System.out.println("Oh, I like that too!\n Any other toppings?");
                    topping=input.nextLine();
                }
                else if(topping.equals("tomato")){
                    System.out.println("Oh, I like that too!\n Any other toppings?");
                    topping=input.nextLine();
                }
                else if(topping.equals("pineapple")){
                    System.out.println("Oh, I like that too!\n Any other toppings?");
                    topping=input.nextLine();
                }
                else {
                    System.out.println("Oh, I've never tried that!");
            }}
            else {
                System.out.printf("Oh, I've never tried %s on my pizza!", topping);
            }
        }
    }
