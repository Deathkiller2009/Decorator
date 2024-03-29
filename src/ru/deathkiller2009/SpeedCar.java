package ru.deathkiller2009;

public class SpeedCar extends CarDecorator{
    private Spoiler spoiler = Spoiler.SPOILER_ON_CAR_ROOF;
    public SpeedCar(Car car) {
        super(car);
    }

    public Spoiler getSpoiler() {
        return spoiler;
    }

    public void setSpoiler(Spoiler spoiler) {
        this.spoiler = spoiler;
    }

    @Override
    public String drive() {
        return spoilerSpeed(super.drive());
    }

    private String spoilerSpeed(String drive){
        String stringBuilder = drive + ", with " + spoiler;
        return stringBuilder;
    }
}
