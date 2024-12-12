package racingcar.domain;

public record CarInfo(String name, int position) {
    public static CarInfo of(Car car) {
        return new CarInfo(car.getName(), car.getPosition());
    }
}
