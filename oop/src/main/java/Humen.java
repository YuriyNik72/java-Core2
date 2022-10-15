public class Humen implements Actions {
    private String name;
    private int runDistance;
    private int jumpHigh;

    public Humen(String name, int distance, int jumpHeight) {
        this.name = name;
        this.runDistance = distance;
        this.jumpHigh = jumpHigh;
    }

    @Override
    public void run() {
        System.out.println("Humen " + this.name + " is running " + this.getRunDistance());
    }

    @Override
    public void jump() {
        System.out.println("Humen " + this.name + " is jumping high " + this.getJumpHigh());
    }

    @Override
    public int getRunDistance() {
        return this.runDistance;
    }

    @Override
    public int getJumpHigh() {
        return this.jumpHigh;
    }

}