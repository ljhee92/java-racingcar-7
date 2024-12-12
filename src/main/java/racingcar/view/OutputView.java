package racingcar.view;

import racingcar.domain.CarInfo;
import racingcar.util.OutputWriter;

import java.util.List;

public class OutputView implements OutputWriter {
    private static final String RESULT_FORMAT = "%s : %s";
    private static final String POSITION_CHAR = "-";
    private static final String SEPARATOR = ", ";

    public void displayResultTopMessage() {
        displayNewLine();
        displayMessageByLine("실행 결과");
    }

    public void displayResultByTime(List<CarInfo> carInfos) {
        for (CarInfo carInfo : carInfos) {
            displayFormat(RESULT_FORMAT, carInfo.name(), POSITION_CHAR.repeat(carInfo.position()));
        }
        displayNewLine();
    }

    public void displayWinners(List<CarInfo> winners) {
        List<String> winnersName = winners.stream().map(CarInfo::name).toList();
        displayFormat("최종 우승자 : %s", String.join(SEPARATOR, winnersName));
    }
}
