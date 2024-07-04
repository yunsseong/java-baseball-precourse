package baseball;
import camp.nextstep.edu.missionutils.*;

import java.util.List;

public class Model {
    private List<Integer> opponentNumber;

    public void generateNumber(){
        opponentNumber = Randoms.pickUniqueNumbersInRange(1, 9, 3);
    }
}
