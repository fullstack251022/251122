public class Airplane {

    final int windsNumber = 2;
    public String type;
    public int size;
    public int capacity;
    public int currentSpeed;

    public int maxSpeed;


    public void printCurrentSpeed() {
        System.out.println("My current speed is " + this.currentSpeed);
    }

    public void accelerate(int speed) {
//        System.out.println("accelerating by "+speed);

        this.currentSpeed += speed;
        if(this.currentSpeed >= this.maxSpeed){
            this.currentSpeed = this.maxSpeed;
        }


//        System.out.println("my new speed is " + this.currentSpeed);
    }

    public void deAccelerate(int speed){
        this.currentSpeed -= speed;
        if(this.currentSpeed < 400){
            System.out.println("DANGER DANGER!!! SPEED UP!!!");
        }
    }


    public void printSize() {
        System.out.println("My size " + this.size);
    }

    public void printCapacity() {
        System.out.println("My capacity " + this.capacity);
    }

    public void printType() {
        System.out.println("My type " + this.type);
    }


    public Airplane(String type, int size, int capacity, int currentSpeed ,int maxSpeed) {
        this.type = type;
        this.size = size;
        this.capacity = capacity;
        this.currentSpeed = currentSpeed;
        this.maxSpeed = maxSpeed;
    }

    public Airplane(String type, int size, int capacity) {
        this.type = type;
        this.size = size;
        this.capacity = capacity;
        this.currentSpeed = currentSpeed;
    }

    public Airplane() {}



}
