public class Test {
    public static void main(String[] args) {
        MyPokemon p1 = new MyPokemon();
        MyPokemon p2 = new MyPokemon();
        // System.out.println(p1.toString());
        // System.out.println(p2.toString());

        p1.headbutt(p2);
        System.out.println(p1);
        System.out.println(p2);
    }
}