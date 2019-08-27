public class Clock {

    public void alarm() {
            int day = 6;
            boolean vacation  = true;

            System.out.println("Result: " + alarmClock(day, vacation));
        }

        public String alarmClock(int day, boolean vacation) {

            if (!vacation) {
                if (day == 0 || day == 6)
                    return "10:00";
                else {
                    return "7:00";
                }
            }
            if (vacation) {
                if (day == 0 || day ==6){
                    return "off";
                }
                else{
                    return "10:00";
                }
            }
            return "";
        }
    }

