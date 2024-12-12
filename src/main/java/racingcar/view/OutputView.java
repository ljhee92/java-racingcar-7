package racingcar.view;

import racingcar.domain.CarInfo;
import racingcar.util.OutputWriter;

import java.util.List;

public class OutputView implements OutputWriter {
    private static final String RESULT_FORMAT = "%s : %s";
    private static final String POSITION_CHAR = "-";

    public void displayResultByTime(List<CarInfo> carInfos) {
        displayNewLine();
        displayMessage("실행 결과");
        for (CarInfo carInfo : carInfos) {
            displayFormat(RESULT_FORMAT, carInfo.name(), POSITION_CHAR.repeat(carInfo.position()));
        }
    }

}
