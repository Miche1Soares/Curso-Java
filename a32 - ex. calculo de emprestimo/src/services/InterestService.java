package services;

public interface InterestService {
    
    public double getInterestRate();

    // definida como default (padrão), será um método herdado pelas classes filhas
    default double payment(double amount, int months)
    {
        return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
    }

}
