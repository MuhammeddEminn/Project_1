package Task_4;

public class Time {
    int hours, minutes, seconds;

    public Time(int hours){
        this(hours,0,0);
    }

        public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    String getDayPart() {
        if (hours >= 5 && hours <= 12) {
            return "Morning";
        } else if (hours > 12 && hours <= 17) {
            return "Afternoon";
        } else if (hours > 17 && hours <= 21) {
            return "Evening";
        } else
            return "Night";
    }
    void showTime1(boolean isTwelveHourFormat) {
        String returnTime = hours + ":" + minutes + ":" + seconds;

        if (isTwelveHourFormat) {
            if (hours == 12) {
                returnTime = hours + ":" + minutes + ":" + seconds + " PM";
            } else if (hours == 0) {
                returnTime = (hours + 12) + ":" + minutes + ":" + seconds + " AM";
            } else if (hours > 12) {
                returnTime = (hours - 12) + ":" + minutes + ":" + seconds + " PM";
            } else {
                returnTime = hours + ":" + minutes + ":" + seconds + " AM";
            }
        }
        System.out.println(returnTime);
    }
    void showTime2(boolean isTwelveHourFormat){
        int disPlayHours=hours;
        String conditions = "";

        if (isTwelveHourFormat){
            if (hours==0){
                disPlayHours=12;
            }else if (hours > 12) {
                disPlayHours = hours - 12;
            }
            if (hours >= 12) {
                conditions = " PM";
            } else {
                conditions = " AM";
            }
        }
    }
}
