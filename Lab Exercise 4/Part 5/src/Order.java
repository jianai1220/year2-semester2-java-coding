import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Order {
    private Date date;
    private String status;
    private Customer customer;
    private List<OrderDetail> orderDetails = new ArrayList<>();

    public Order(Date date, String status, Customer customer){
        this.date = date;
        this.status = status;
        this.customer = customer;
    }

    public void addOrderDetail(OrderDetail orderDetail){
        orderDetails.add(orderDetail);
    }

    public double calcSubTotal(){
        double subTotal = 0;
        for (OrderDetail detail : orderDetails)
            subTotal += detail.calcSubTotal();
        return subTotal;
    }

    public double calcTax(){
        double tax = 0;
        for(OrderDetail detail : orderDetails)
            tax += detail.calcTax();
        return tax;
    }

    public double calcTotal(){
        return calcSubTotal() + calcTax();
    }

    public double calcTotalWeight(){
        double totalWeight = 0;
        for(OrderDetail detail : orderDetails){
            totalWeight += detail.calcWeight();
        }
        return totalWeight;
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public Customer getCustomer(){
        return customer;
    }

    public void setCustomer(Customer customer){
        this.customer = customer;
    }
}
