public enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;


    public boolean isWeekend() {

        switch (this) {
            case SUNDAY, SATURDAY:
                return true;

            default:
                return false;
        }
    }

    public String getRusName(){
        String rusNameDay;
        switch (this){
            case MONDAY: return rusNameDay = "ПОНЕДЕЛЬНИК";
            case TUESDAY: return rusNameDay = "ВТОРНИК";
            case WEDNESDAY: return rusNameDay = "СРЕДА";
            case THURSDAY: return rusNameDay = "ЧЕТВЕРГ";
            case FRIDAY: return rusNameDay = "ПЯТНИЦА";
            case SUNDAY: return rusNameDay = "СУББОТА";
            case SATURDAY: return rusNameDay = "ВОСКРЕСЕНЬЕ";
            default:
                throw new IllegalStateException("Unexpected value: " + this);
        }
    }
}