public class DataBundle implements BillAction
{


    private int megabytes;
    private double dataBundlePrice;

    public DataBundle(int megabytes)
    {
        this.megabytes = megabytes;
    }
    public double getDataBundlePrice()
    {
          /*
             mega bytes are priced for the range MB{ 0-499 , 501 - 1000 , 1001 - (+2^31 - 1)}
             N is any +ve integer
             for 500MB , the method should return R0.00
         */

        if(megabytes < 500)
        {
            dataBundlePrice = 0.75;
        }
        else if(megabytes > 1000)
        {
            dataBundlePrice = 0.35;
        }
        else if(megabytes > 500)
        {
            dataBundlePrice = 0.55;
        }
        return  dataBundlePrice;

       }
    @Override
    public double totalCost()
    {
        // if the total cost is R0.00 , it means the price specified for mega bytes is invalid
        // meaning the range is not with in 500< / > 500 / > 1000
        return getDataBundlePrice(); // total cost of the Data bundle
    }

}
