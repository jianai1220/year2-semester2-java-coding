public class Payment{
    protected float amount;

    public Payment(float amount){
        this.amount = amount;
    }

    public float getAmount(){
        return amount;
    }

    public void setAmount(float amount){
        this.amount = amount;
    }

    public boolean authorized(){
        return true;
    }
}

class Cash extends Payment{
    private float cashTendered;

    public Cash(float amount, float cashTendered){
        super(amount);
        this.cashTendered = cashTendered;
    }

    public float getCashTendered(){
        return cashTendered;
    }

    public void setCashTendered(float cashTendered){
        this.cashTendered = cashTendered;
    }

    @Override
    public boolean authorized(){
        return cashTendered >= amount;
    }
}

class Check extends Payment{
    private String name;
    private String bankID;

    public Check(float amount, String name, String bankID){
        super(amount);
        this.name = name;
        this.bankID = bankID;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getBankID(){
        return bankID;
    }

    public void setBankID(String bankID){
        this.bankID = bankID;
    }

    @Override
    public boolean authorized(){
        return name != null && !name.isEmpty() && bankID != null && !bankID.isEmpty();
    }
}

class Credit extends Payment{
    private String number;
    private String type;

    public Credit(float amount, String number, String type){
        super(amount);
        this.number = number;
        this.type = type;
    }

    public String getNumber(){
        return number;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }
}