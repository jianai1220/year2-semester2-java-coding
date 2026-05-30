public class StaticExample {
    private static int instanceCount=0;

    public StaticExample(){
        instanceCount++;
    }

    public static int getInstanceCount(){
        return instanceCount;
    }

    public static void main(String[] args){
        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();

        System.out.println("Number of instances created: " + StaticExample.getInstanceCount());
    }
}
