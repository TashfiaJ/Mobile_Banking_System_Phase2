package banking;

public class Bank {
    public String tashfia_pin ="2345";
    public String tasnim_pin ="";
    public String anik_pin ="2453";
    public String horizontal_line="-------------------------------------------------";

    public void startBanking() {
        Nagad tashfia = new Nagad("Tashfia Ahmed", "01712345678","6", tashfia_pin);
        Bkash tasnim = new Bkash("Tasnim Islam", "01777888999");
        Rocket anik = new Rocket("Tamim Rahman", "01688996655", anik_pin);

        System.out.println("Nagad:");
        tashfia.add_money(20000);

        tashfia.cash_out_amount(20000);
        tashfia.cash_out_pin(tashfia_pin);
        tashfia.cash_out_amount(2000);
        tashfia.cash_out_pin(tashfia_pin);
        System.out.println(tashfia);
        System.out.println(horizontal_line);

        System.out.println("Bkash:");
        tasnim.add_money(40000);
        tasnim.add_money(5000);

        tasnim.cash_out_amount(2000);
        tasnim_pin = tasnim.getPin_number();
        tasnim.cash_out_pin(tasnim_pin);
        System.out.println(tasnim);
        System.out.println(horizontal_line);

        System.out.println("Rocket:");
        anik.add_money(10000);
        anik.cash_out_amount(40000);
        anik.cash_out_pin(anik_pin);
        anik.cash_out_amount(5000);
        anik.cash_out_pin("6783");
        anik_pin =anik.get_pin_updated("6783","3467");
        anik_pin =anik.get_pin_updated(anik_pin,"3767");

        anik.cash_out_amount(3000);
        anik.cash_out_pin(anik_pin);
        System.out.println(anik);
    }
}

