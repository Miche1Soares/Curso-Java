package entities;

public class Account {

    private int number;
    private String name;
    private double money;
    
    public Account(int number, String name, double money)
    {
        this.number = number;
        this.name = name;
        this.money = money;
    }
    
    public Account(int number, String name)
    {
        this.number = number;
        this.name = name;
    }




    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void deposit(double money) {
        this.money += money;
    }

    public void withdraw(double money) {
        this.money -= (money + 5) ;
    }



    public String data()
    {
        return "Account "
        + number
        +", Holder: "
        + name
        + ", Balance: $ "
        + String.format("%.2f", money);
    }

    ///

}
