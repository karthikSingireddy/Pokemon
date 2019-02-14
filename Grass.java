public class Grass extends Pokemon {
    public Grass(String name, int speed, int defense, int hp, Attack[] attacks) {
        super(name, speed, defense, hp, attacks);
    }
    public Grass(String name, Attack[] attacks) {
        super(name, attacks);
    }
    @Override
    public boolean isWeak(Pokemon p) {
        return p instanceof fire;
    }
    @Override
    public boolean isResistant(Pokemon p) {
        return p instanceof Water;
    }
}