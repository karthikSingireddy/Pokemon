public class Water extends Pokemon {
    public Water(String name, int speed, int defense, int hp, Attack[] attacks) {
        super(name, speed, defense, hp, attacks);
    }
    public Water(String name, Attack[] attacks) {
        super(name, attacks);
    }
    @Override
    public boolean isWeak(Pokemon p) {
        return p instanceof Grass;
    }
    @Override
    public boolean isResistant(Pokemon p) {
        return p instanceof Fire;
    }
}