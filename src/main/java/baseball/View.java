package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class View {
    private String userInput;

    public void print(String message){
        System.out.print(message);
    }

    public void println(String message){
        System.out.println(message);
    }

    public String input(String message){
        print(message);
        return Console.readLine();
    }
}
