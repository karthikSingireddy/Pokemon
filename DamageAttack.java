public class DamageAttack extends Attack {
    public DamageAttack(String name, int energy, int value) {
        super(name, energy, value);
    }
    public DamageAttack(String name, int value) {
        super(name, value);
    }
    public String toString() {
        String out = "\t" + super.getName() + ": Energy " + super.getEnergy() + ", Damage ";
        if(super.getValue() >= 0) out += "+";
        return out + super.getValue();
    }
    public void attack(Pokemon attacker, Pokemon victim) {
        int change = super.getValue();
        if(victim.isResistant(attacker)) change/=2;
        else if(victim.isWeak(attacker)) change*=2;
        victim.setDamage(victim.getDamage() - change);
        if(victim.getDamage() < 0) victim.setDamage(0);
    }
}