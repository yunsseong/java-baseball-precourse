package baseball;

public class Controller {
    private static Controller controller;
    private Model model;
    private View view;

    private Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public static Controller getController(Model model, View view){
        if(controller == null)
            controller = new Controller(model, view);
        return controller;
    }

    public void play(){
        model.generateNumber();

    }
}
