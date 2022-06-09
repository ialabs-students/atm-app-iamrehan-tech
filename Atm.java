import java.util.*;

public class Atm{
    int total_amount=0;
    int withdraw_amount=0;
    int left_amount2=0;
    public  void deposit()
    {
        int twoThousands, fiveHundreds, twoHundreds, hundreds ;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number of 2000s ");
        twoThousands=sc.nextInt();
        System.out.println("enter the number of 500s ");
        fiveHundreds=sc.nextInt();
        System.out.println("enter the number of 200s ");
        twoHundreds=sc.nextInt();
        System.out.println("enter the number of 100s ");
        hundreds=sc.nextInt();
        if(twoThousands<0 || twoHundreds<0||fiveHundreds<0||hundreds<0)
        {
            System.out.println("Incorrect Deposite Amount");
        }
        else if(twoThousands==0 && twoHundreds==0&&fiveHundreds==0&&hundreds==0)
        {
            System.out.println("Deposite Amount Cannot be 0");
        }
        else{
            int total_2000s=twoThousands*2000;
            int total_500s=fiveHundreds*500;
            int total_200s=twoHundreds*200;
            int total_100s=hundreds*100;
            total_amount=total_100s+total_2000s+total_200s+total_500s;
            System.out.println("Balance:"+" "+"2000s="+twoThousands+" "+"500="+fiveHundreds+" "+"200="+twoHundreds+" "+"100="+hundreds);
        }
        System.out.println("Your Total Amount Is  "+ total_amount);
        main_menu();
    }
    public void withdraw()
    {
        int left_amount=0;
        System.out.println("Enter How Much Amount You Have to Withdraw");
        Scanner sc=new Scanner(System.in);
        int withdraw_amount=sc.nextInt();
        if(withdraw_amount>total_amount)
        {
            System.out.println("Insufficent Balance");
        }
        else {
            int twoThousands=0, fiveHundreds=0, twoHundreds=0, hundreds=0 ;
            left_amount=withdraw_amount-left_amount;
            left_amount2=total_amount-withdraw_amount;
            total_amount=left_amount;
            while(left_amount!=0)
            {
                if(left_amount>2000)
                {
                    twoThousands=left_amount/2000;
                    left_amount=left_amount-twoThousands*2000;
                }
                else if(left_amount>500)
                {
                    fiveHundreds=left_amount/500;
                    left_amount=left_amount-fiveHundreds*500;
                    
                }
                else if(left_amount>200)
                {
                    twoHundreds=left_amount/200;
                    left_amount=left_amount-twoHundreds*200;

                }
                else {
                    hundreds=left_amount/100;
                    left_amount=left_amount-hundreds*100;
                }
            }
            System.out.println("Balance:"+" "+"2000s="+twoThousands+" "+"500="+fiveHundreds+" "+"200="+twoHundreds+" "+"100="+hundreds);
        }
        main_menu();
    }
    public void check(){
        System.out.println("Your Total Amount left is  "+left_amount2);
    }
    public void main_menu()
    {
        System.out.println("plz enter the choice \n press 1. for depositing the money \n press 2. for withdraw your money  \n press 3. for check bank remaning bank balance");
        Scanner sc=new Scanner (System.in);
        int option=sc.nextInt();
        switch(option)
        {
            case 1:
            deposit();
            break;
            case 2:
            withdraw();
            break;
            case 3:
            check();
        }
    }
    public static void main(String[] args) {
       Atm object=new Atm();
        object.main_menu();
    }
}
