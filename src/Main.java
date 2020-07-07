public class Main
{


    public static  void main(String[] args)
    {
        PhoneBill phoneBill = new PhoneBill();
        PhoneCall phoneCall = new PhoneCall(20.6);
        SMSBundle sms = new SMSBundle(20, 4);
        DataBundle bundle= new DataBundle(1000);
        phoneBill.accept(bundle);

        System.out.println("R"+phoneBill.total());



    }


}
