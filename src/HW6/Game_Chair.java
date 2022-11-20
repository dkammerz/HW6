package HW6;

public class Game_Chair {

    static Player Computer = new Player(true);
    static Player Player_2 = new Player(false);
    static Shuffle s = new Shuffle();

    public Player getComputer() {
        return Computer;
    }

    public Player getPlayer_2() {
        return Player_2;
    }

    public static void main(String[] args) {

        Game_Chair chair = new Game_Chair();

        chair.getComputer().setX(chair.getComputer().Start());
        chair.getPlayer_2().setX(chair.getPlayer_2().Start());
        System.out.println(chair.getPlayer_2().getB().FindWinner(Player_2, Computer));


    }
}
