import org.junit.Test;

import static org.junit.Assert.*;

public class DataBundleTest
{

    @Test
    public void shouldReturn0_75ForAllMegaBytesLessThan500() {

        // for all bundles in this range 0 - 499MB , 501 - 1000MB , 1001 -
        DataBundle data = null;
        for (int bytes = 0; bytes <= 499; bytes++)  // mega bytes less than 500MB
        {
            data = new DataBundle(bytes);

            assertEquals(0.75, data.getDataBundlePrice(), 0.0);

        }

    }

    @Test
    public void shouldReturn0_55ForAllMegaBytesGreaterThan500()
    {

        // for all bundles in this range 0 - 499MB , 501 - 1000MB , 1001 -
        DataBundle data = null;
        for(int bytes = 501 ; bytes <= 1000; bytes ++ ) // mega bytes greater than 500MB but less than anything greater than 1000MB
        {
            data = new DataBundle(bytes);

            assertEquals(0.55 , data.getDataBundlePrice() , 0.0);

        }


    }
    @Test
    public void shouldReturn0_35ForAllMegaBytesGreaterThan1000()
    {

        // for all bundles in this range 0 - 499MB , 501 - 1000MB , 1001 -
        DataBundle data = null;
        for(int bytes = 1001 ; bytes <= 5000; bytes ++ ) // mega bytes greater than 1000MB
        {
            data = new DataBundle(bytes);

            assertEquals(0.35 , data.getDataBundlePrice() , 0.0);

        }


      }


    }
