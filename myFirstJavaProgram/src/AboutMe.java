public class AboutMe {
    private String name;
    private int age;
    private String matricNumber;
    private String address;

public AboutMe(){
}

public String getName(){
    return name;
}

public void setName(String name){
    this.name = name;
}

public int getAge(){
    return age;
}

public void setAge(int age){
    this.age = age;
}

public String getMatricNumber(){
    return matricNumber;
}

public void setMatricNumber(String matricNumber){
    this.matricNumber = matricNumber;
}

public String getAddress(){
    return address;
}

public void setAddress(String address){
    this.address = address;
}

public static void main(String[] args){
    AboutMe me = new AboutMe();
    me.setName("Lee Jian Ai");
    me.setAge(21);
    me.setMatricNumber("A23CS0234");
    me.setAddress("82-8-11 De Tropicana, Jalan 2/116B, Kuchai Entrepreneurs Park");

    System.out.println("Name: "+me.getName());
    System.out.println("Age: "+me.getAge());
    System.out.println("Matric Number: "+me.getMatricNumber());
    System.out.println("Address: "+me.getAddress());
}
}