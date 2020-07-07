import org.junit.Test;

import static org.junit.Assert.*;

public class PhoneCallTest
{

    @Test
    public void shouldHavePrice()
    {
        PhoneCall phone = new PhoneCall(11.5);
        assertEquals((int)11.5 , (int)phone.phoneCallPrice);
    }
    @Test
    public void shouldReturnTotalCost()
    {
        PhoneCall phone = new PhoneCall(11.5);

        assertEquals((int)11.5 , (int)phone.totalCost());
    }

}