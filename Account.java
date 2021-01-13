package banking;

public class Account{
    private String customer_name;
    private String mobile_number;
    private String pin_number;
    private String account_number;
    private double balance;

    //User's information has been initialized without setting pin number
    public Account(String customer_name, String mobile_number,String account_number)
    {
        this.customer_name=customer_name;
        this.mobile_number=mobile_number;
        this.account_number=account_number;
        this.pin_number="";
    }
    //method overloading
    //User's information has been initialized with setting pin number
    public Account(String customer_name, String mobile_number,String account_number,String pin_number)
    {
        this.customer_name=customer_name;
        this.mobile_number=mobile_number;
        this.account_number=account_number;
        this.pin_number=pin_number;
    }

    //Showing the information of user
    @Override
    public String toString() {
        return "Account{" +
                "customer_name='" + customer_name + '\'' +
                ", mobile_number='" + mobile_number + '\'' +
                ", pin_number='" + pin_number + '\'' +
                ", account_number='" + account_number + '\'' +
                ", balance=" + balance +
                '}';
    }

    //User adding a certain amount of money to their account
    public void add_money(double amount) {
        this.balance+=amount;
        System.out.println(amount+"tk has been added in "+this.customer_name+"'s account.");
    }

    //If user's pin number has not set then they have to set pin number first in order to cash out.
    //Also user can't cash out money if their balance is low.


    public void cash_out(double amount,String pin_number,double cash_out_charge) {
        if(this.pin_number!=pin_number){
            System.out.println("Cash out not possible due to wrong pin number. Try again.");
        }
        else {
            if(this.balance>=amount+cash_out_charge){
                this.balance-=(amount+cash_out_charge);
                System.out.println("Cash out amount: "+amount+"tk, "+"charged: "+cash_out_charge+"tk");
            }
            else{
                double at_least_balance=amount+cash_out_charge;
                System.out.println("Your balance must contain at least "+at_least_balance+" tk in order to withdraw "+amount+" tk");
            }
            System.out.println("Your balance is("+this.customer_name+"): "+this.balance+"tk");
        }
    }

    //to check if user's pin number has been set yet.
    public boolean is_pin_set()
    {
        if(this.pin_number.length()==0){
            System.out.println("Your pin number has not been set yet! Set your pin number first.");
            return false;}
        else
            return true;
    }

    //if user's pin number has not set, then this function will set pin number.
    public void setPin_number(String new_pin_number,String what_have_done){
        this.pin_number=new_pin_number;
        System.out.println("Your pin number has been "+what_have_done+" successfully. New pin number("+this.customer_name+"):"+new_pin_number);
    }

    // if user submit the wrong pin number then updating pin number is possible
    public boolean is_pin_update_possible(String old_pin){
        if(this.pin_number!=old_pin){
            System.out.println("Sorry, upadate is not possible due to wrong pin number. Enter the correct pin number.");
            return false;
        }
        else
            return true;
    }

    public String getPin_number() {
        return pin_number;
    }
}


