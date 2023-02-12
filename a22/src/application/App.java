package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class App {
    public static void main(String[] args) throws Exception {

        Account acc = new Account(1001, "Michel", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Michel", 0.0, 500.0);


        // UPCASTING
        // businessaccount é uma account (com umas coisinhas a mais), logo pode ser instanciada pela account tbm

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Magno", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Caput", 0.0, 0.03);


        // DOWNCASTING

        // força a conversão da account para businessaccount
        BusinessAccount acc4 = (BusinessAccount) acc2;
        // dessa forma, agora, com os dados da acc2, é possivel realizar um loan, método existente apenas em instancias do tipo businessaccount
        // acc2.loan() não é possível
        acc4.loan(100.0);


        // BusinessAccount acc5 = (BusinessAccount) acc3; - não funciona pois não é possível converter a SavingsAccount em BusinessAccount
        // para tentar evitar erros...
        // instanceof - server pra testar se é possível fazer o DOWNCASTING
        if(acc3 instanceof BusinessAccount)
        {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
        }

        if(acc3 instanceof SavingsAccount)
        {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
        }
 
    }
}
