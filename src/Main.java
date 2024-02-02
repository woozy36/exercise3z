import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double farr = 0;
        while (farr > -460){
            farr = userInput();
            double celc = math(farr);
            print(celc);
        }



        //while(){
            //method1 get user input... pass it out
            //method2 calculate Celsius from f
            //method3 print out message
            //ask user for new number? break if under -460}


    }
    static double userInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("please give me a Fahrenheit: ");
        double farr = input.nextInt();
        return farr;

        //System.out.println(num);
    }

    static double math(double farr){
        double celc = ((farr - 32)*5/9);
        return celc;
    }


    static void print(double celc){
        System.out.println(celc);
    }


}
