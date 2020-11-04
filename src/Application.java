import com.vendingmachineassignment.changedue.ChangeDue;
import com.vendingmachineassignment.input.ScannerInput;
import com.vendingmachineassignment.insertmoney.MoneyManagement;
import com.vendingmachineassignment.price.GetPrice;

public class Application {

    public static void main(String[] args) {
        int Food = ScannerInput.getMenu();
        int Price = GetPrice.retrievePrice(Food);
        int change = MoneyManagement.moneyInserted(Price);
        ChangeDue.changeOut(change);
    }
}
