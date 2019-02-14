public class DefenseAttack extends Attack {
    public DefenseAttack(String name, int energy, int value) {
        super(name, energy, value);
    }
    public DefenseAttack(String name, int value) {
        super(name, value);
    }
    public String toString() {
        String out = "\t" + super.getName() + ": Energy " + super.getEnergy() + ", Defense ";
        if(super.getValue() >= 0) out += "+";
        return out + super.getValue();
    }
    public void attack(Pokemon attacker, Pokemon victim) {
        int change = super.getValue();
        if(victim.isResistant(attacker)) change/=2;
        else if(victim.isWeak(attacker)) change*=2;
        victim.setDefense(victim.getDefense() - change);
        if(victim.getDefense() < 0) victim.setDefense(0);
    }
}