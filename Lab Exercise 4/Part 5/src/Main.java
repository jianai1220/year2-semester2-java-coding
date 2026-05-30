import java.util.Date;

public class Main {
    public static void main(String[] args){
        Customer customer = new Customer("Suzana", "10 Jalan Bahtera");

        Item item1 = new Item(2.5, "Laptop", 7000.0, 10.5);
        Item item2 = new Item(1.0, "Mouse", 25.00, 3.05);

        OrderDetail orderDetail1 = new OrderDetail(1, "Taxable", item1);
        OrderDetail orderDetail2 = new OrderDetail(2, "Taxable", item2);

        Order order = new Order(new Date(), "Processing", customer);
        order.addOrderDetail(orderDetail1);
        order.addOrderDetail(orderDetail2);

        System.out.println("Subtotal: RM" + order.calcSubTotal());
        System.out.println("Tax: RM" + order.calcTax());
        System.out.println("Total: RM" + order.calcTotal());

        Payment cashPayment = new Cash(1050.00f, 1100.00f);
        Payment checkPayment = new Check(1050.00f, "Suzana", "123456789");
        Payment creditPayment = new Credit(1050.00f, "1234567890123456", "Visa");

        System.out.println("Cash Payment authorized: " + cashPayment.authorized());
        System.out.println("Check Payment authorized: " + checkPayment.authorized());
        System.out.println("Credit Payment authorized: " + creditPayment.authorized());
    }
}
