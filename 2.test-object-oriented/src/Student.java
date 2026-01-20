public class Student {

    private int energy;

    private static final int MAX_ENERGY = 100;

    private static final int MIN_ENERGY = 0;

    public Student() {
        this.energy = 50;
    }

    void sleep() {
        energy = energy + 50;
        if (energy > MAX_ENERGY) {
            energy = MAX_ENERGY;
        }
        System.out.println("寝ました。エネルギーが" + energy + "になりました。");
        if (energy == MAX_ENERGY) {
            System.out.println("フルパワー!");
        }
    }

    void study() {
        energy = energy - 30;
        if (energy < MIN_ENERGY) {
            energy = MIN_ENERGY;
        }
        System.out.println("勉強しました。エネルギーが" + energy + "になりました。");
        if (energy == MIN_ENERGY) {
            System.out.println("寝てください。");
        }
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

}
