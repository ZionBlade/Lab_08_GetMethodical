import java.util.Scanner;
public class CheckOut {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double itemPrice = 0;
        double totalPrice = 0;
        String respYN = "";
        boolean done2 = false;

        do{
            itemPrice = SafeInput.getRangedDouble(console, "enter the item price", 0.50, 9.99);
            totalPrice += itemPrice;

            done2 = SafeInput.getYNConfirm(console,"do you have another item to enter");

        }while(done2 == true);

        System.out.printf("the total price is: " + "%.2f", totalPrice);
    }
}
