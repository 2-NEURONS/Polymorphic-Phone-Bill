public class PhoneBill
{

  private double totalCost; // total cost of the current bill
  
  public void accept(BillAction billAction)
  {
    totalCost += billAction.totalCost() ; // increment and pass total cost of the current bill to total cost
  }
  double total() // return total cost of th current bill
  {
    return totalCost;
  }

}

