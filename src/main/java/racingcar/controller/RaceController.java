package racingcar.controller;

import racingcar.domain.Car;
import racingcar.domain.CarInfo;
import racingcar.service.RaceService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class RaceController {
    private final InputView inputView;
    private final OutputView outputView;
    private final RaceService raceService;

    public RaceController(InputView inputView, OutputView outputView, RaceService raceService) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.raceService = raceService;
    }

    public void run() {
        List<Car> cars = getCars();
        int times = inputView.requestTimes();
        race(cars, times);
        judgeWinners(cars);
    }

    private List<Car> getCars() {
        List<String> inputCarNames = inputView.requestCarNames();
        List<Car> cars = new ArrayList<>();
        for (String inputCarName : inputCarNames) {
            cars.add(Car.of(inputCarName));
        }
        return cars;
    }

    private void race(List<Car> cars, int times) {
        List<CarInfo> carInfos = raceService.getAfterRaceCarInfos(cars, times);
        outputView.displayResultByTime(carInfos);
    }

    private void judgeWinners(List<Car> cars) {
        List<CarInfo> winners = raceService.getWinnerCarInfos(cars);
        outputView.displayWinners(winners);
    }
}
