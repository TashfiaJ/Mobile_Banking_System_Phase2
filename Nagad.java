package banking;

public class Nagad extends Account {
    private double amount;

    public Nagad(String user_name, String mobile_num, String check_digit, String pin_num) {
        super(user_name, mobile_num, mobile_num + check_digit, pin_num);
    }

    public Nagad(String user_name, String mobile_num, String account_num) {
        super(user_name, mobile_num, account_num);
    }

    @Override
    public void add_money(double amount) {
        if (amount <= 30000)
            super.add_money(amount);
        else
            System.out.println("Add money limit exceeded. You can add maximum 30000tk.");
    }

    //First we will make sure that usr's pin number has been set after entering amount
    public void cash_out_amount(double amount)
    {
        if(!is_pin_set()) {
            super.setPin_number("1235", "set");
        }
        this.amount=amount;
    }

    public void cash_out_pin(String pin_number){
        double cash_out_charge=.00999*amount;
        if(amount<=25000)
            super.cash_out(amount,pin_number,cash_out_charge);
        else
            System.out.println("You can't cash out more than 25000tk.");
    }

    public String get_pin_updated(String old_pin,String new_pin)
    {
        if(is_pin_update_possible(old_pin))
        {
            if(new_pin.length()==4)
                super.setPin_number(new_pin,"updated");
            else
                System.out.println("Pin number must contain 4 digits.");
        }
        return getPin_number();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getPin_number() {
        return super.getPin_number();
    }
}
