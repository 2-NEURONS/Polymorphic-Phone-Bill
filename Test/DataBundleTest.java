import org.junit.Test;

import static org.junit.Assert.*;

public class DataBundleTest
{

    @Test
    public void shouldReturnValidPrice()
    {
        DataBundle data = new DataBundle(800);

        assertEquals((int)0.55 , (int)data.getDataBundlePrice());
    }

}