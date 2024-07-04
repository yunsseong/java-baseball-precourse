package baseball;
import camp.nextstep.edu.missionutils.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Model {
    private List<String> opponentNumber;
    int NUMBER_SIZE = 3;

    public void generateNumber(){
        int randomInteger;
        opponentNumber = new ArrayList<>();
        while(true){
            randomInteger = Randoms.pickNumberInRange(1, 9);
            if(!opponentNumber.contains(Integer.toString(randomInteger)))
                opponentNumber.add(Integer.toString(randomInteger));
            if(opponentNumber.size() == NUMBER_SIZE)
                break;
        }
    }

    public List<Integer> generateHint(String numbers){
        Integer strike = 0;
        Integer ball = 0;

        for(int i = 0; i < numbers.length(); i++){
            String number = Character.toString(numbers.charAt(i));
            if(number.equals(opponentNumber.get(i))){
                strike++;
            } else if (opponentNumber.contains(number)) {
                ball++;
            }
        }
        return new ArrayList<>(Arrays.asList(ball, strike)) ;
    }
}
