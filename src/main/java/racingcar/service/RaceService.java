package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.domain.Car;
import racingcar.domain.CarInfo;

import java.util.ArrayList;
import java.util.List;

public class RaceService {
    private static final int MIN_RANDOM_NUMBER = 0;
    private static final int MAX_RANDOM_NUMBER = 9;

    public List<CarInfo> getAfterRaceCarInfos(List<Car> cars,int times) {
        List<CarInfo> carInfos = new ArrayList<>();
        for (int i = 0; i < times; i++) {
            cars.forEach(car -> {
                int power = Randoms.pickNumberInRange(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
                car.move(power);
                carInfos.add(CarInfo.of(car));
            });
        }
        return carInfos;
    }

    public List<CarInfo> getWinnerCarInfos(List<Car> cars) {
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
        return winners;
    }
}
