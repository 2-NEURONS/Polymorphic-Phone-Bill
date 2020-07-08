import org.junit.Test;

import java.text.DecimalFormat;
import java.util.*;
import static org.junit.Assert.*;

public class PhoneCallTest
{

    @Test
    public void shouldReturnPriceForAllIntegers() // return price for all integer values with in 32-bits
    {
         PhoneCall phone;
         int range = 2147483647; // range of integer values
         int price = 0;

         while( price < range) // generate all possible prices
         {
             phone = new PhoneCall(price); // pass prices every iteration
             assertEquals(price, (int)phone.totalCost()); // test the prices
             price ++; // increment price
         }
    }

    @Test
    public void shouldReturnPriceForAllDecimals() // return price for all integer values with in 32-bits
    {
        PhoneCall phone;

        double price = 0.0;

         for(int amount = 1; amount <= 1000; amount ++ )
         {
           price = (double)Math.round((Math.random() * 1000) * 100.0)  / 100.0; // generate random decimal prices in two decimal places
             phone = new PhoneCall(price); // pass prices every iteration
             assertEquals(price, phone.totalCost() , 0.0); // test the prices
         }

    }

}
