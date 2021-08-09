package q02;

public class Account {
    
    private long acctNumber;
    private double balance;
    public AuditStub audit;
    
    public void setAudit(AuditStub audit){
        this.audit = audit;
    }
    
    public double withdraw(double amount, double fee){
        if (amount >= 5000 && audit.permit(this.acctNumber, this.balance)){
            this.balance = this.balance - amount - fee;
        }
        return balance;
    }
}
