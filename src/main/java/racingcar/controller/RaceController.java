package racingcar.controller;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.domain.Car;
import racingcar.domain.CarInfo;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RaceController {
    private final InputView inputView;
    private final OutputView outputView;

    public RaceController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        List<String> inputCarNames = inputView.requestCarNames();
        List<Car> cars = new ArrayList<>();
        for (String inputCarName : inputCarNames) {
            cars.add(Car.of(inputCarName));
        }
        System.out.println(cars);

        int times = inputView.requestTimes();
        System.out.println(times);

        List<CarInfo> carInfos = new ArrayList<>();
        for (int i = 0; i < times; i++) {
            cars.forEach(car -> {
                int power = Randoms.pickNumberInRange(0, 9);
                car.move(power);
                carInfos.add(CarInfo.of(car));
            });
        }
        outputView.displayResultByTime(carInfos);

        cars.sort((a, b) -> b.getPosition() - a.getPosition());
        List<CarInfo> winners = new ArrayList<>();
        Car winner = cars.getFirst();
        winners.add(CarInfo.of(winner));
        for (Car car : cars) {
            if (winner.getPosition() < car.getPosition()) {
                winners.removeFirst();
                winners.add(CarInfo.of(car));
            }

            if (!winner.equals(car) && winner.getPosition() == car.getPosition()) {
                winners.add(CarInfo.of(car));
            }
        }
        outputView.displayWinners(winners);
    }
}
