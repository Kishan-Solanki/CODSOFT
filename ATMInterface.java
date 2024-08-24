import java.util.Scanner;

public class ATMInterface {
    class BankAccount extends ATMInterface{
        float BankBalance=10000;
        public void Withdraw(int amount){
            if(amount>BankBalance){
                System.out.println("---Your Transaction Failed---");
                System.out.println("Not Sufficient Balance For Withdrawals");
                System.out.println("Current Balance:"+BankBalance);
            }
            else{
                BankBalance-=amount;
                System.out.println("---Your Transaction is Success---");
                System.out.println("You Withdrawed:"+amount);
                System.out.println("Current Balance:"+BankBalance);
            }
        }
        public void Deposite(int amount){
            BankBalance+=amount;
                System.out.println("---Your Transaction is Success---");
                System.out.println("You Depositeded:"+amount);
                System.out.println("Current Balance:"+BankBalance);
        }
        public void CheckBalance(){
            System.out.println("Current Balance:"+BankBalance);
        }
    }
    
    public static void main(String[] args) {
        ATMInterface atm = new ATMInterface();
        BankAccount ac1 = atm.new BankAccount();
        Scanner sc=new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("----------Menu----------");
            System.out.println("Enter 0 For Exit");
            System.out.println("Enter 1 For Withdraw");
            System.out.println("Enter 2 For Deposite");
            System.out.println("Enter 3 For CheckBalance");
            System.out.println("Enter CHoice:");
            choice=sc.nextInt();
            if(choice==0){
                break;
            }
            else{
                if(choice==1){
                    System.out.println("Enter a Withdrawal Amount:");
                    int amount=sc.nextInt();
                    ac1.Withdraw(amount);
                }
                else{
                    if(choice==2){
                    System.out.println("Enter a Deposite Amount:");
                    int amount=sc.nextInt();
                    ac1.Deposite(amount);
                    }
                    else{
                        if(choice==3){
                            ac1.CheckBalance();
                        }
                        else{
                            System.out.println("Enter a Valid Choice");
                        }
                    }
                }
            }
        }
    }
}
