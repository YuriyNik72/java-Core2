public class Robot implements Actions {
    private String name;
    private int runDistance;
    private int jumpHeight;

    public Robot(String name, int distance, int jumpHeight) {
        this.name = name;
        this.runDistance = distance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {
        System.out.println("Robot " + this.name + " is running " + this.getRunDistance());
    }

    @Override
    public void jump() {
        System.out.println("Robot " + this.name + " is jumping high " + this.getJumpHigh());
    }

    @Override
    public int getRunDistance() {
        return this.runDistance;
    }

    @Override
    public int getJumpHigh() {
        return this.jumpHeight;
    }
}