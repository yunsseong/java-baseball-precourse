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

    public void setting(){
        model.generateNumber();
    }

    public void validate(String value) throws IllegalArgumentException{
        if(value.length() != 3)
            throw new IllegalArgumentException();
    }

    public void play(){
        String userInput = view.input("숫자를 입력해주세요 : ");
        try{
            validate(userInput);
        } catch (Exception e){
            System.exit(0);
        }
    }
}
