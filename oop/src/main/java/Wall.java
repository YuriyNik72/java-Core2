public class Wall extends Barrier {
    private int high;

    public Wall(String name, int high) {
        super(name);

        this.high = high;
    }

    public int getHigt() {
        return high;
    }

    @Override
    protected boolean moving(Actions actions) {
        System.out.println("The " + super.getName() + " high: " + this.high);

        actions.jump();

        if (getHigt() <= actions.getJumpHigh()) {
            System.out.println("jump success");

            return true;
        } else {
            System.out.println("jump unsuccessfully");

            return false;
        }
    }
}
