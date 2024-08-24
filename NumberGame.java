import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        int round = 1;
        int score = 0;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Welcome To Number Game-----");
        System.out.println("Your Score Will Be out Of 100 Points");
        while (true) {
            System.out.println("-----Let's Start Round:" + round + "-----");
            int num = random.nextInt(1, 101);
            int attempt = 20;

            while (true) {
                if (attempt == 0) {
                    System.out.println("-------Game Over-------");
                    System.out.println("-------You Lost Round:" + round + "-------");
                    int round_score = 0;
                    System.out.println("Your Score Of Round " + round + " is:" + round_score);
                    score += round_score;
                    break;
                }
                System.out.println("You Have " + attempt + " Remaing Attempts To Guess The NUmber");
                System.out.println("-----Guess The Number Between 1 To 100-----");
                System.out.println("Enter The Number:");
                int Guess = sc.nextInt();
                if (Guess == num) {
                    System.out.println("-------Congratulations-------");
                    System.out.println("-------You Won Round:" + round + "-------");
                    int round_score = 100 - ((20 - attempt) * 5);
                    System.out.println("Your Score Of Round " + round + " is:" + round_score);
                    score += round_score;
                    break;
                } else {
                    if (Guess > num) {
                        int diff = Guess - num;
                        if (diff >= 50) {
                            System.out.println("The Number You Guessed Is");
                            System.out.println("---Too High---");
                            attempt--;
                        } else {
                            if (diff >= 25) {
                                System.out.println("The Number You Guessed Is");
                                System.out.println("---High---");
                                attempt--;
                            } else {
                                if (diff >= 10) {
                                    System.out.println("The Number You Guessed Is");
                                    System.out.println("---Close But High---");
                                    attempt--;
                                } else {
                                    System.out.println("The Number You Guessed Is");
                                    System.out.println("---Too Close But High---");
                                    attempt--;
                                }
                            }
                        }
                    } else {
                        int diff = num - Guess;
                        if (diff >= 50) {
                            System.out.println("The Number You Guessed Is");
                            System.out.println("---Too Low---");
                            attempt--;
                        } else {
                            if (diff >= 25) {
                                System.out.println("The Number You Guessed Is");
                                System.out.println("---Low---");
                                attempt--;
                            } else {
                                if (diff >= 10) {
                                    System.out.println("The Number You Guessed Is");
                                    System.out.println("---Close But Low---");
                                    attempt--;
                                } else {
                                    System.out.println("The Number You Guessed Is");
                                    System.out.println("---Too Close But Low---");
                                    attempt--;
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("---At the End Of The Round " + round + "---");
            System.out.println("Your Score:" + score / round);
            int c = 0;
            while (true) {
                System.out.println("To Play Another Round Enter 1");
                System.out.println("To End The Game Enter 0");
                System.out.println("Enter Your Choice");
                int Choice = sc.nextInt();
                if (Choice == 1) {
                    break;
                } else {
                    if (Choice == 0) {
                        c++;
                        break;
                    } else {
                        System.out.println("-------Enter a Valid Choice--------");
                    }
                }
            }
            if (c > 0) {
                break;
            } else {
                round++;
            }

        }
        System.out.println("-----Thanks For Playing The Game-----");
        System.out.println("-----You Played " + round + " Rounds-----");
        System.out.println("Your Score:" + score / round);

    }
}