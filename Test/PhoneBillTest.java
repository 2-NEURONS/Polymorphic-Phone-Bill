import org.junit.Test;

import static org.junit.Assert.*;

public class PhoneBillTest
{
    @Test
    public void shouldIncrementTotal()
    {
        PhoneBill phoneBill = new PhoneBill();

        phoneBill.accept(new PhoneCall(5));
        int result = (int)phoneBill.total();
        assertEquals(5 , result);
    }



}