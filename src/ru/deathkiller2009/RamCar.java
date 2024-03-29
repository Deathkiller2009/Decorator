package ru.deathkiller2009;

public class RamCar extends CarDecorator{

    public RamCar(Car car) {
        super(car);
    }

    @Override
    public String drive() {
        return ram(super.drive());
    }
    private String ram(String drive){
        return drive + ", with ram";
    }
}
