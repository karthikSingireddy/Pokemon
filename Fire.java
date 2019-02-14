public class Fire extends Pokemon {
    public Fire(String name, int speed, int defense, int hp, Attack[] attacks) {
        super(name, speed, defense, hp, attacks);
    }
    public Fire(String name, Attack[] attacks) {
        super(name, attacks);
    }
    @Override
    public boolean isWeak(Pokemon p) {
        return p instanceof Water;
    }
    @Override
    public boolean isResistant(Pokemon p) {
        return p instanceof Grass;
    }
}