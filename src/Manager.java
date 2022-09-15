public class Manager extends Employee {

    private int incentives;

    public Manager(int id, String name, int sal, int incentives) {
        super(id, name, sal);
        this.incentives = incentives;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("incentives = " + incentives);
    }

    public int getIncentives() {
        return incentives;
    }

    public void setIncentives(int incentives) {
        this.incentives = incentives;
    }

    @Override
    public String toString() {
        return super.toString()  +" incentives = " + incentives;
    }
}
