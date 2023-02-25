package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {
    
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService)
    {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months)
    {
        double basicQuota = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) 
        {
            LocalDate dueDate = contract.getDate().plusMonths(i);

            double interest = onlinePaymentService.interest(basicQuota, i);
            double fee = onlinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;

            contract.getInstallments().add(new Installment(dueDate, quota));
        }

        /*
        contract.getInstallments().add(new Installment(LocalDate.of(2018, 7, 25), 206.04));
        contract.getInstallments().add(new Installment(LocalDate.of(2018, 8, 25), 208.08));
        */
    }

}
