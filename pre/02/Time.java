public class Time {
      public static void main(String[] args){
        int hour = 23;
        int minute = 19;
        int second = 25;
        int chour = 23;
        int cminute = 41;
        int csecond = 50;
        int minutesInHour = 60;
        int secondsInMinute = 60;
        int hoursInDay = 24;
        int secondsSinceMidnight = ( hour * minutesInHour ) * secondsInMinute + minute * secondsInMinute + second;
        int csecondsSinceMidnight = ( chour * minutesInHour ) * secondsInMinute + cminute * secondsInMinute + csecond;
        int secondsInDay = secondsInMinute * minutesInHour * hoursInDay;
        int secondsRemaining = secondsInDay - secondsSinceMidnight;
        int percentDayPassed = secondsSinceMidnight * 100 / secondsInDay;
        int timeElapsed = csecondsSinceMidnight - secondsSinceMidnight;
        System.out.println("Number of seconds since midnight: " + secondsSinceMidnight);
        System.out.println("Number of seconds remaining in the day: " + secondsRemaining);
        System.out.println("Percent of day passed: " + percentDayPassed);
        System.out.println("Time Elapsed: " + timeElapsed);
      }
}
