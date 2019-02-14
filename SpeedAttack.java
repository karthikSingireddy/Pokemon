public class SpeedAttack extends Attack {
    public SpeedAttack(String name, int energy, int speed) {
        super(name, energy, speed);
    }
    public SpeedAttack(String name, int value) {
        super(name, value);
    }
    public String toString() {
        String out = "\t" + super.getName() + ": Energy " + super.getEnergy() + ", Speed ";
        if(super.getValue() >= 0) out += "+";
        return out + super.getValue();
    }
    @Override
    public void attack(Pokemon attacker, Pokemon victim) {
        int change = super.getValue();
        if(victim.isResistant(attacker)) change /=2; 
        else if(victim.isWeak(attacker)) change *=2;
        victim.setSpeed(victim.getSpeed() - change);
        if(victim.getSpeed() < 0) victim.setSpeed(0);
    }
}