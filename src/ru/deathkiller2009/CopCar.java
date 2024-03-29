package ru.deathkiller2009;

public class CopCar extends CarDecorator{
    public CopCar(Car car) {
        super(car);
    }

    @Override
    public String drive() {
        return addLights(super.drive());
    }
    private String addLights(String drive){
        return drive + ", with flashing lights";
    }
}
