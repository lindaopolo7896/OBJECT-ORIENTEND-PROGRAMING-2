package CODE_CHALLENGE2_VARIABLES;

public class Variables {
    void showInterest(){
        double amount;
        double interest;

        amount=1200.00;
        System.out.println("Amount"+amount);

        interest=3.0;
        amount=amount * (100+interest)/100;
        System.out.println("after a year:"+ amount);


    }
}
