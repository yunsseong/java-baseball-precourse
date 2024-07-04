package baseball;
import camp.nextstep.edu.missionutils.*;

import java.util.List;

public class Model {
    private List<Integer> opponentNumber;
    int NUMBER_SIZE = 3;

    public void generateNumber(){
        Integer randomInteger = 0;
        while(true){
            randomInteger = Randoms.pickNumberInRange(1, 9);
            if(!opponentNumber.contains(randomInteger))
                opponentNumber.add(randomInteger);
            if(opponentNumber.size() == NUMBER_SIZE)
                break;
        }
    }
}
