package racingcar.view;

import racingcar.util.ErrorMessage;
import racingcar.util.InputReader;
import racingcar.util.OutputWriter;
import racingcar.util.Parser;

import java.util.List;
import java.util.regex.Pattern;

public class InputView implements InputReader, OutputWriter {
    private static final Pattern CAR_NAMES = Pattern.compile("^([a-z]+)+(,([a-z]*))*$");
    private static final Pattern TIMES = Pattern.compile("^[0-9]+$");

    public List<String> requestCarNames() {
        displayMessageByLine("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = inputMessage();
        validateCarNames(input);
        return Parser.parseToList(input);
    }

    private void validateCarNames(String input) {
        if (!CAR_NAMES.matcher(input).matches()) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT_EXCEPTION.getMessage());
        }
    }

    public int requestTimes() {
        displayMessageByLine("시도할 횟수는 몇회인가요?");
        String input = inputMessage();
        validateTimes(input);
        return Parser.parseToInt(input);
    }

    private void validateTimes(String input) {
        if (!TIMES.matcher(input).matches()) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT_EXCEPTION.getMessage());
        }
    }
}
