public class PhoneBill
{

  public BillAction billAction; // have access to the instance of the BillAction so you can return its total cost from total
  public double totalCost; // total cost of the current bill
  public void accept(BillAction billAction)
  {
    totalCost += billAction.totalCost() ; // increment and pass total cost of the current bill to total cost
  }
  double total() // return total cost of th current bill
  {
    return totalCost;
  }


}
