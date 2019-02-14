public class Attack {
    private String name;
    private int energy, value;

    public Attack(String name, int energy, int value) {
        this.setName(name);
        this.setEnergy(energy);
        this.setValue(value);
    }
    public Attack(String name, int value) {
        this(name, 1, value);
    }

    public String getName() {
        return this.name;
    }
    public int getEnergy() {
        return this.energy;
    }
    public int getValue() {
        return this.value;
    }
    private void setName(String name) {
        if(name == null || name.equals("")) throw new IllegalArgumentException();
        this.name = name;
    }
    private void setEnergy(int energy) {
        if(energy < 1 || energy > 5) throw new IllegalArgumentException();
        this.energy = energy;
    }
    private void setValue(int val) {
        if(val == 0 || Math.abs(val) > energy*10 || val%10 != 0) throw new IllegalArgumentException();
        this.value = val;
    }
    @Override
    public String toString() {
        String out = "\t" + name + ": Energy " + energy + ", Value ";
        if(value >= 0) out += "+";
        return out + value;
    }
    public void attack(Pokemon attacker, Pokemon attackee) {}
}