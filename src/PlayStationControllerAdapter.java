class PlayStationControllerAdapter implements GameController {
    private final PlayStationController controller;

    PlayStationControllerAdapter(PlayStationController controller) {
        this.controller = controller;
    }

    @Override
    public void move() {
        System.out.println("PlayStation Controller via Adapter: Moving");
        controller.playstationMove();
    }

    @Override
    public void action() {
        System.out.println("PlayStation Controller via Adapter: Taking action");
        controller.playstationAction();
    }
}