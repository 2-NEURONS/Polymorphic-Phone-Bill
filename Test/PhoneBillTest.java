import org.junit.Test;

import static org.junit.Assert.*;

public class PhoneBillTest
{
    @Test
    public void shouldIncrementTotalCost()
    {

        PhoneBill phoneBill = new PhoneBill(); // PhoneBill instance

        phoneBill.accept(new PhoneCall(5)); // pass a phone call
        phoneBill.accept(new SMSBundle(8 , 1.5 )); // pass an sms bundle
        phoneBill.accept(new DataBundle(200)); // for mega bytes less than 500mb

        phoneBill.accept(new PhoneCall(10)); // accept a phone call
        phoneBill.accept(new SMSBundle(3 , 1.76 )); // accept sms bundle
        phoneBill.accept(new DataBundle(700));  // for mega bytes > 500mb

        phoneBill.accept(new PhoneCall(15)); // accept a phone call
        phoneBill.accept(new SMSBundle(6 , 3.3 )); // accept sms bundle
        phoneBill.accept(new DataBundle(10000000));  // for mega bytes > 1000mb
        int result = (int)phoneBill.total(); // accept data bundles
        assertEquals((int)68.73 , result); // let check results


    }



}
