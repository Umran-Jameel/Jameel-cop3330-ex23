import java.util.*;

public class Exercise23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String yes = "y";
        String no = "n";

        System.out.print("Is the car silent when you turn the key? ");
        String ans1 = in.nextLine();

        if (ans1.equals(yes)) {
            System.out.print("Are the battery terminals corroded? ");
            String ans2 = in.nextLine();

            if (ans2.equals(yes)) {
                System.out.println("Clean terminals and try starting again.");
            }
            else {
                System.out.println("Replace cables and try again.");
                System.exit(0);
            }
        }
        else {
            System.out.print("Does the car make a slicking noise? ");
            String ans3 = in.nextLine();

            if (ans3.equals(yes)) {
                System.out.println("Replace the battery.");
                System.exit(0);
            }
            else {
                System.out.print("Does the car crank up but fail to start? ");
                String ans4 = in.nextLine();

                if (ans4.equals(yes)) {
                    System.out.println("Check spark plug connections.");
                    System.exit(0);
                }
                else {
                    System.out.print("Does the engine start and then die? ");
                    String ans5 = in.nextLine();

                    if (ans5.equals(yes)) {
                        System.out.print("Does you car have fuel injection? ");
                        String ans6 = in.nextLine();

                        if (ans6.equals(yes)) {
                            System.out.println("Get it in for service.");
                            System.exit(0);
                        }
                        else {
                            System.out.println("Check to ensure the choke is opening and closing.");
                            System.exit(0);
                        }
                    }
                    else {
                        System.out.println("This should not be possible.");
                    }
                }

            }
        }
    }
}
