public class Pond {
    public static void main(String[] args) {
        Frog a = new Frog("Peepo");
        Frog b = new Frog("Pepe", 10, 15);
        Frog c = new Frog("Peepaw", 4.6);
        Frog d = new Frog("BigDaddy", 25, 50);

        Fly fa = new Fly(1, 3);
        Fly fb = new Fly(6);
        Fly fc = new Fly(8, 15);

        Frog.species = "1331 Frogs";

        System.out.println(a.toString());
        a.eat(fb);
        System.out.println(fb.toString());
        a.grow(8);
        a.eat(fb);
        System.out.println(fb.toString());
        System.out.println(a.toString());
        System.out.println(d.toString());

        c.grow(4);
        System.out.println(c.toString());
        System.out.println(b.toString());




    }
}