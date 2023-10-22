class GameClient {
    static void gamePlay(GameController controller) {
        controller.move();
        controller.action();
    }

    public static void main(String[] args) {
        PlayStationControllerAdapter playstationAdapter = new PlayStationControllerAdapter(new PlayStationController());
        XboxControllerAdapter xboxAdapter = new XboxControllerAdapter(new XboxController());

        System.out.println("Using PlayStation Controller via Adapter:");
        gamePlay(playstationAdapter);

        System.out.println("\nUsing Xbox Controller via Adapter:");
        gamePlay(xboxAdapter);
    }
}