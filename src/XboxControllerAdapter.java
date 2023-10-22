class XboxControllerAdapter implements GameController {
    private final XboxController controller;

    XboxControllerAdapter(XboxController controller) {
        this.controller = controller;
    }

    @Override
    public void move() {
        System.out.println("Xbox Controller via Adapter: Moving");
        controller.xboxMove();
    }

    @Override
    public void action() {
        System.out.println("Xbox Controller via Adapter: Taking action");
        controller.xboxAction();
    }
}