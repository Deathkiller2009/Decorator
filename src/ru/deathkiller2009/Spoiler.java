package ru.deathkiller2009;

public enum Spoiler {
    SPOILER_ON_TRUNK{
        @Override
        public String toString() {
            return "spoiler on trunk";
        }
    },
    SPOILER_ON_CAR_ROOF{
        @Override
        public String toString() {
            return "spoiler on car roof";
        }
    }
}
