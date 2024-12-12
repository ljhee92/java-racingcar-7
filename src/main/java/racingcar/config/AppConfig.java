package racingcar.config;

import racingcar.controller.RaceController;
import racingcar.service.RaceService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class AppConfig {
    public RaceController raceController() {
        return new RaceController(inputView(), outputView(), raceService());
    }

    private InputView inputView() {
        return new InputView();
    }

    private OutputView outputView() {
        return new OutputView();
    }

    private RaceService raceService() {
        return new RaceService();
    }
}
