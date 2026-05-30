package extendFunction.Location;

public abstract class location {
    private String address;

    public location(String address) {
        this.address = address;
    }



    public String getAddress() {
        return address;
    }


    public abstract void printLocation();

    }