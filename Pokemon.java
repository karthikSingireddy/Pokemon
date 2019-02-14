public class Pokemon {
    private String name;
    private int speed, defense, hp, damage, energy;
    private Attack[] attacks;

    public Pokemon(String name, int speed, int defense, int hp, Attack[] attacks) {
        this.setName(name);
        this.setSpeed(speed);
        this.setDefense(defense);
        this.setAttacks(attacks);
        this.setHP(hp);
        this.check();
    }
    public Pokemon(String name, Attack[] attacks) {
        this(name, 50, 50, 50, attacks);
    }

    public String getName() {
        return this.name;
    }
    public int getSpeed() {
        return this.speed;
    }
    public int getDefense() {
        return this.defense;
    }
    public int getHP() {
        return this.hp;
    }
    public int getDamage() {
        return this.damage;
    }
    public int getEnergy() {
        return this.energy;
    }
    public Attack[] getAttacks() {
        return this.attacks;
    }
    private void setName(String s) {
        if(s == null || s.equals("")) throw new IllegalArgumentException();
        this.name = s;
    }
    public void setSpeed(int s) {
        if(s <= 0) throw new IllegalArgumentException();
        this.speed = s;
    }
    public void setDefense(int s) {
        if(s <= 0) throw new IllegalArgumentException();
        this.defense = s;
    }
    private void setHP(int h) {
        if(h <= 0) throw new IllegalArgumentException();
        this.hp = h;
    }
    public void setDamage(int d) {
        if(d < 0) throw new IllegalArgumentException();
        this.defense = d;
    }
    public void setEnergy(int e) {
        if(e <0 || Math.abs(energy - e) !=1) throw new IllegalArgumentException();
        this.energy = e;
    }
    private void setAttacks(Attack[] att) {
        if(att == null || att.length == 0) throw new IllegalArgumentException();
        this.attacks = att;
    }
    @Override
    public String toString() {
        String out = name + ", Speed " + speed + ", Defense " + defense + ", HP " + hp + ", Damage " + damage + ", Energy " + energy + "\n";
        for(int i = 0; i < attacks.length; i++) 
            out += attacks[i] + "\n";
        return out;
    }
    public boolean isWeak(Pokemon other) {
        return false;
    }
    public boolean isResistant(Pokemon other) {
        return false;
    }
    // check for condition again later.
    private void check() {
        if(speed + defense + hp > 150) throw new IllegalArgumentException();
    }
}