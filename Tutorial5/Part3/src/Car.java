public class Car{
    private Wheel[] wheels;
    private Light[] lights;
    private Engine engine;

    public Car(){
        this.wheels = new Wheel[4];
        for(int i = 0; i<4 ; i++)
            this.wheels[i] = new Wheel(18, "Steel");
        this.lights = new Light[2];
        for(int i = 0; i<2; i++)
            this.lights[i] = new Light();
        this.engine = new Engine();
    }

    public void start(){
        engine.start();
    }

    public void turnOnLights(){
        for(Light light : lights)
            light.turnOn();
    }

    public void turnOffLights(){
        for(Light light : lights)
            light.turnOff();
    }

    public void accelerate(){
        engine.accelerate();
    }

    public void brake(){
        engine.brake();
    }

    public Wheel[] getWheels(){
        return wheels;
    }

    class Wheel{
        private int sizeInInches;
        private String material;

        public Wheel(int sizeInInches, String material){
            this.sizeInInches = sizeInInches;
            this.material = material;
        }

        public void rotate(){
            System.out.println("Wheel rotating...");
        }
    }

    class Light{
        public void turnOn(){
            System.out.println("Light turned on.");
        }

        public void turnOff(){
            System.out.println("Light turned off.");
        }
    }

    class Engine {
        public void start(){
            System.out.println("Engine started.");
        }

        public void accelerate(){
            System.out.println("Car is accelerating...");
        }

        public void brake(){
            System.out.println("Car is braking...");
        }
    }

    public static void main (String[] args){
        Car car = new Car();
        car.start();
        car.turnOnLights();
        car.accelerate();
        car.brake();
        car.turnOffLights();

        for(Wheel wheel : car.getWheels()){
            wheel.rotate();
        }
    }
}