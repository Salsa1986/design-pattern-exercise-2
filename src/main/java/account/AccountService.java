package account;

public class AccountService {

    public void withdraw(String accountNumber, double amount) {
        if(amount>0 && AccountNumberValidator.validate(accountNumber)) {
            String message = "amount + \" has been withdraw from \" + accountNumber";
            Logger logger = Logger.getInstance();
            logger.log(message);

        }
    }

    public void deposit(String accountNumber, double amount) {
        if(amount>0 && AccountNumberValidator.validate(accountNumber)) {
            String message ="amount + \" has been deposit into \" + accountNumber";
            Logger logger = Logger.getInstance();
            logger.log(message);
        }
    }
}
