public class DataBundle implements BillAction
{


    int megabytes;
    double dataBundlePrice;

    public DataBundle(int megabytes)
    {
        this.megabytes = megabytes;
    }
    public double getDataBundlePrice()
    {
        return dataBundlePrice = megabytes < 500 ? 0.75 : megabytes > 500 ? 0.55 : megabytes > 1000 ? 0.35 : 0.0;
    }
    @Override
    public double totalCost()
    {
        // if the total cost is R0.00 , it means the price specified for mega bytes is invalid
        // meaning the range is not with in 500< / > 500 / > 1000
        return getDataBundlePrice(); // total cost of the Data bundle
    }

}
