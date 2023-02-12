package entities;

// final - determina que a classe SavingsAccount não poderá ser herdada
public final class SavingsAccount extends Account{

    private Double interestRate;

    public SavingsAccount(){}

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate)
    {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance()
    {
        balance += (balance * interestRate);
    }


    // no saque de conta normal será cobrado $5 pelo saque, mas na Savings account não
    // override - recupera um metodo já usado na superclasse, que se faz presente aqui na classe filha, mas permite realizar um comportamento personalizado
    // final - determina que o metodo withdraw não poderá ser sobreposto (realizado um Override em outra classe filha)
    @Override
    public final void withdraw(Double withdraw)
    {
        balance -= withdraw;
    }

}
