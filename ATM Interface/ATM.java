import java.util.Scanner;

class ATM
{
    public static void DisplayMenu()
    {
        System.out.println();
        System.out.println(" 1. \t\t Check the balance");
        System.out.println(" 2. \t\t Deposit money");
        System.out.println(" 3. \t\t Withdraw money");
        System.out.println(" 4. \t\t Exit");
        System.out.println();
        
    }
    public static double CheckBalance(double balance)
    {
        return balance;
    }
    public static double DepositMoney(double balance)
    {
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter  your deposit amount : ");
        double depocit = input.nextDouble();

        balance = balance+depocit;

        System.out.print("Your current balance is : " + balance);
        System.out.println();
        return balance;
        
    }
    public static double WithdrawMoney(double balance)
    {
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter  your withdraw  amount : ");
        double withdraw = input.nextDouble();
        System.out.println();

        if(withdraw < balance)
        {
            balance = balance - withdraw;
            System.out.print("Your current balance is : " + balance);
            System.out.println();
            return balance;
        }
        else
        {
            System.out.print("Insufficent balance . Please check your balance..!" );
            System.out.println();
            return -1;
        }
    }
    public static void Exit()
    {
        System.out.println();
        System.out.println("<<<<  THANK YOU WELCOME...!  >>>>");
    }

    public static void main (String args[])
    {
        Scanner input =  new Scanner(System.in);

        double balance = 5000000.00;
        while(true)
        {
            DisplayMenu();

            System.out.print("Enter your choice :   ");
            int choice = input.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Your current balance is : " + CheckBalance(balance));
                    System.out.println();
                    break;
                }
                case 2:
                {
                    DepositMoney(balance);
                    break; 
                }
                case 3:
                {
                    WithdrawMoney(balance);
                    break; 
                }
                case 4:
                {
                    Exit();
                    return ;
                }
                default:
                {
                    System.out.println("Invalid input . Please enter a valid input..!! ");
                    System.out.println();
                }
            }
        }
    }
}
