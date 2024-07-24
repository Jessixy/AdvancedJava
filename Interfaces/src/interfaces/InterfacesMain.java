package interfaces;



public class InterfacesMain {

    public static void main(String[] args) {

        System.out.println("Interface Demo");

        Player player = new Player();

        player.play(new Video());
        player.play(new Audio());


    }
}
