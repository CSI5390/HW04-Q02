package q02;

import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTest {
    
    public AccountTest() {
    }

    /**
     * Test verifies that AuditStub is set up properly.
     */
    @Test
    public void testAuditStubSetup() {
        Account account = new Account();
        account.setAudit(new AuditStub());
        assertTrue(account.audit.permit(24335684896L, 5001.0));
    }
    
    /**
     * Test verifies the functionality of withdraw method.
     */
    @Test
    public void testWithdraw(){
        Account account = new Account();
        account.setAudit(new AuditStub());
        double expected = -5002.0;
        double actual = account.withdraw(5001.0, 1.0);
        assertEquals(expected, actual, 0.01);
    }
    
}
