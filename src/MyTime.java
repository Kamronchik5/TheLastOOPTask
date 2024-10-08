public class MyTime {
    private int second;
    private int minute;
    private int hour;

    public int getSecond() {
        if (second <= 59 && second >=0) {
            return second;
        }
        return 0;
    }

    public int getMinute() {
        if (minute <= 59 && minute >=0){
        return  minute;
        }
        return 0;
    }

    public int getHour() {
        if (hour <= 23 && hour >= 0){
            return hour;
        }
        else if (hour == 24) {
            return 0;
        }
        return 0;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    public void MyTime(){
        System.out.println("HH: "  +"MM: " + "SS");
        System.out.println(hour + ":" + minute + ":" + second );
    }
}
