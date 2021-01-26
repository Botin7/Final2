import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        
    
        int in = 0,sum=0;

        while (in < 1) {
            System.out.print("\nWelcome to planting shop\n**Menu**\n1. Banana\n2. Mangoes\n3. apple\n4. Orange\n5. coconut\n6. exit\n");
            int n,b,a;
            //char a;
            Scanner nu1 = new Scanner(System.in);
            System.out.print("\nEnter number of list fruits that your want to buy:");
            n = nu1.nextInt();


            if (n == 1) {
                Scanner nu2 = new Scanner(System.in);
                System.out.print("Enter quantity of item:");
                b = nu2.nextInt();
                Scanner nu10 = new Scanner(System.in);
                System.out.print("please chose the size(1 for small 2 for medium and 3 for large):");
                a = nu10.nextInt();
              //  System.out.print("\n"+a);
                if (a == 1) {
                    sum = sum + 10 * b;
                   // System.out.print("\n"+sum);
                }
                else if (a == 2) {
                    sum = sum + 15 * b;
                   // System.out.print("\n"+sum);
                }
                else {
                    sum = sum + 20 * b;
                  //  System.out.print("\n" + sum);
                }
            }
            else if (n == 2) {
                Scanner nu2 = new Scanner(System.in);
                System.out.print("Enter quantity of item:");
                b = nu2.nextInt();
                Scanner nu10 = new Scanner(System.in);
                System.out.print("please chose the size(1 for small 2 for medium and 3 for large):");
                a = nu10.nextInt();
                //System.out.print("\n"+a);
                if (a == 1) {
                    sum = sum + 15 * b;
                  //  System.out.print("\n"+sum);
                }
                else if (a == 2) {
                    sum = sum + 20 * b;
                    //System.out.print("\n"+sum);
                }
                else {
                    sum = sum + 25 * b;
                   // System.out.print("\n" + sum);
                }
            }
            else if (n == 3) {
                Scanner nu2 = new Scanner(System.in);
                System.out.print("Enter quantity of item:");
                b = nu2.nextInt();
                Scanner nu10 = new Scanner(System.in);
                System.out.print("please chose the size(1 for small 2 for medium and 3 for large):");
                a = nu10.nextInt();
                //System.out.print("\n"+a);
                if (a == 1) {
                    sum = sum + 15 * b;
                    //  System.out.print("\n"+sum);
                }
                else if (a == 2) {
                    sum = sum + 20 * b;
                    //System.out.print("\n"+sum);
                }
                else {
                    sum = sum + 25 * b;
                    // System.out.print("\n" + sum);
                }
            }
            else if (n == 4) {
                Scanner nu2 = new Scanner(System.in);
                System.out.print("Enter quantity of item:");
                b = nu2.nextInt();
                Scanner nu10 = new Scanner(System.in);
                System.out.print("please chose the size(1 for small 2 for medium and 3 for large):");
                a = nu10.nextInt();
                //System.out.print("\n"+a);
                if (a == 1) {
                    sum = sum + 15 * b;
                    //  System.out.print("\n"+sum);
                }
                else if (a == 2) {
                    sum = sum + 20 * b;
                    //System.out.print("\n"+sum);
                }
                else {
                    sum = sum + 25 * b;
                    // System.out.print("\n" + sum);
                }
            }
            else if (n == 5) {
                Scanner nu2 = new Scanner(System.in);
                System.out.print("Enter quantity of item:");
                b = nu2.nextInt();
                Scanner nu10 = new Scanner(System.in);
                System.out.print("please chose the size(1 for small 2 for medium and 3 for large):");
                a = nu10.nextInt();
                //System.out.print("\n"+a);
                if (a == 1) {
                    sum = sum + 15 * b;
                    //  System.out.print("\n"+sum);
                }
                else if (a == 2) {
                    sum = sum + 20 * b;
                    //System.out.print("\n"+sum);
                }
                else {
                    sum = sum + 25 * b;
                    // System.out.print("\n" + sum);
                }
            }

     else {

                break;
            }
        }
        System.out.print("\n Total price=" + sum+"\n");

    }
}
