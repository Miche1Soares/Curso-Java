package entities;

public class BusinessAccount extends Account {
    
    private Double loanLimit;

    public BusinessAccount(){}

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit)
    {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount)
    {
        if(amount <= loanLimit)
        {
            balance += (amount - 10.0);
        }
    }

    // no saque de conta normal será cobrado $5 pelo saque, mas na Business account será a taxa da conta normal + $2
    @Override
    public void withdraw(Double withdraw)
    {
        // reutiliza a operação já realizada na conta normal...
        super.withdraw(withdraw);
        // e dps complementa
        balance -= 2.0;
    }

}
