package task_oop2;

public enum HenType {
    UKRAINE("Украина"),
    RUSSIA("Россия"),
    MOLDAVIA("Молдавия"),
    BELARUS("Белоруссия");


    String countryName;

    HenType(String countryName) {
        this.countryName = countryName;
    }

    public static HenType getCountry(String country) {

        for (HenType countries : values()) {
            if (countries.countryName.equals(country)) {
                return countries;
            }
        }
        return null;
    }
}
