/*

SOMENTE HÁ CONTAS POUPANÇA (SAVINGS) E CONTAS PJ (BUSINESS), logo a classe acount será abstrata (n pode ser instanciada)

*/

package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class App {
    public static void main(String[] args) throws Exception {

        //Account acc1 = new Account(1001, "Michel", 0.0);
        Account acc2 = new BusinessAccount(1003, "Magno", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Caput", 0.0, 0.03);
 
    }
}
