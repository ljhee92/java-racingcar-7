package racingcar.domain;

import racingcar.util.ErrorMessage;

import java.util.Objects;

public class Car {
    private static final int START_POSITION = 0;
    private static final int MAX_NAME_LENGTH = 5;
    private static final int MOVE_CONDITION = 4;

    private final String name;
    private int position;

    private Car(String name) {
        this.name = name;
        this.position = START_POSITION;
    }

    public static Car of(String name) {
        validate(name);
        return new Car(name);
    }

    private static void validate(String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT_EXCEPTION.getMessage());
        }
    }

    public void move(int power) {
        if (power >= MOVE_CONDITION) {
            this.position++;
        }
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", position=" + position +
                '}';
    }
}
