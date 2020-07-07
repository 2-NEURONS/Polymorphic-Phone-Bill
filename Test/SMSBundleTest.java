import org.junit.Test;

import static org.junit.Assert.*;

public class SMSBundleTest
{


    @Test
    public void shouldHaveQty()
    {
        SMSBundle sms = new SMSBundle(1,.5);
        assertEquals(1, sms.qty);
    }
    @Test
    public void shouldHavePrice()
    {
        SMSBundle sms = new SMSBundle(1,1.5);
        assertEquals((int)1.5 , (int)sms.smsPrice);
    }
    @Test
    public void shouldReturnTotalCost()
    {
        SMSBundle sms = new SMSBundle(2,2.5);
        assertEquals((int)5.0, (int)(sms.qty * sms.smsPrice));
    }

}