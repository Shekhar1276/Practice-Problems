import java.util.Scanner;
class ForLoopFactorial {
    int fact=1;
    int fact(int num){
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }
}
class WhileLoopFactorial {
    int i=1,fact=1;
    int fact(int num){
        while(i<=num){
            fact=fact*i;
            i++;
        }
        return fact;
    }
}
class DoLoopFact {
    int i=1,fact=1;
    int fact(int num){
        do{
            fact=fact*i;
            i++;
        }while(i<=num);
        return fact;
    } }
    class main{
        public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();
        ForLoopFactorial forloop = new ForLoopFactorial();
        WhileLoopFactorial whileloop = new WhileLoopFactorial();
        DoLoopFact doloop = new DoLoopFact();
        System.out.println("Using for loop" + forloop.fact(num));
        System.out.println("Using while loop" + whileloop.fact(num));
        System.out.println("Using do loop" + doloop.fact(num));
        }
        }
