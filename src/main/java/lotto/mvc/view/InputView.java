package lotto.mvc.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public void showPurchaseAmountMsg() {
        System.out.println("구입금액을 입력해 주세요.");
    }

    public String getUserInput() {
        return Console.readLine();
    }
}
