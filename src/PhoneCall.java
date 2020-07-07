public class PhoneCall implements  BillAction
{
    double phoneCallPrice;


    public PhoneCall(double phoneCallPrice)
    {
        this.phoneCallPrice = phoneCallPrice;
    }

    @Override
    public double totalCost()
    {
        return phoneCallPrice;
    }
    @Override
    public String toString()
    {
        return "PhoneCall{" +
                "phoneCallPrice=" + phoneCallPrice +
                '}';
    }


}
