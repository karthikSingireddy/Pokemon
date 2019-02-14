public class MyPokemon extends Fire{
    public MyPokemon() {
        super("Charmander", new Attack[] {
            new DamageAttack("Slash", 2, 10),
            new SpeedAttack("Headbutt", 4, 20),
            new DefenseAttack("Block", 5, 30)
        });
    }
    public void slash(Pokemon victim) {
        super.getAttacks()[0].attack(this, victim);
    }
    public void headbutt(Pokemon victim) {
        super.getAttacks()[1].attack(this, victim);
    }
    public void block(Pokemon victim) {
        super.getAttacks()[2].attack(this, victim);
    }
}