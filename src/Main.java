//code by Zoia Klocheva

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Ostrich ostrich = new Ostrich();
        Owl owl = new Owl();
        //-----------------------------------------------------
        ostrich.voice();
        owl.voice();
        bird.voice();
        //-----------------------------------------------------
        ostrich.movement();
        owl.movement();
        bird.movement();

    }
}
