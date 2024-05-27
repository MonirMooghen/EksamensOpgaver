public class DateAgeCalculator {
    private int yourAge;
    private int dateAge;

    public DateAgeCalculator(int yourAge, int dateAge){
        this.yourAge = yourAge;
        this.dateAge = dateAge;
    }

    public int acceptableAge(){
        int lowest = 0;
        lowest = yourAge/2+7;
        return lowest;
    }

    @Override
    public String toString() {
        if (dateAge >= acceptableAge()){
            return "Your date is old enough for you";
        } else {
            return "Your date is too young for you. They have to be at least " + acceptableAge() + " years old.";
        }
    }

}
