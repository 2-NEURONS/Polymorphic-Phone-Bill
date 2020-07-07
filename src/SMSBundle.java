public class SMSBundle implements BillAction
{

   int qty;
   double smsPrice; // quantity and price of the sms

    public SMSBundle(int qty, double smsPrice) // instantiate sms bundle
    {
        this.qty = qty; // initialise quantity
        this.smsPrice = smsPrice; // initialize price of the sms

    }
    @Override
    public double totalCost()
    {
        return ((double)((qty * smsPrice))); // total cost of the SmS bundle
    }

}
