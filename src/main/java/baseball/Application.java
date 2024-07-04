package baseball;

public class Application {
    public static void main(String[] args) {
        //TODO: 숫자 야구 게임 구현

        Model model = new Model();
        View view = new View();

        Controller controller = Controller.getController(model, view);
        controller.setting();
        controller.play();
    }
}
