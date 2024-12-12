package racingcar.view;

import racingcar.domain.CarInfo;
import racingcar.util.OutputWriter;

import java.util.List;

public class OutputView implements OutputWriter {
    private static final String RESULT_FORMAT = "%s : %s";
    private static final String POSITION_CHAR = "-";

    public void displayResultByTime(List<CarInfo> carInfos) {
        displayNewLine();
        displayMessageByLine("실행 결과");
        for (CarInfo carInfo : carInfos) {
            displayFormat(RESULT_FORMAT, carInfo.name(), POSITION_CHAR.repeat(carInfo.position()));
        }
    }

    public void displayWinners(List<CarInfo> winners) {
        displayMessage("최종 우승자 : ");
        List<String> winnersName = winners.stream().map(CarInfo::name).toList();
        displayMessage(String.join(", ", winnersName));
    }
}
