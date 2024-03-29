package ru.deathkiller2009;

public abstract class CarDecorator implements Car{
    private Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }


    @Override
    public String drive() {
        return car.drive();
    }
}
