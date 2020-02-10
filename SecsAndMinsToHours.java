
public class SecsAndMinsToHours{
    
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    
    public static void main(String[] args) {
        getDurationString(14574);
        getDurationString(65,45);
    }

    public static void getDurationString(int minutes, int seconds){
        if(minutes >= 0 && (seconds >= 0 && seconds <= 59) ){
            int minToHours = minutes / 60;
            int minToMinutes = minutes % 60;
            System.out.println(minutes + " minutes and " + seconds + " seconds = " + minToHours + "h " + minToMinutes + "m " + seconds +"s");
        }else
            System.out.println(INVALID_VALUE_MESSAGE);
    }

    public static void getDurationString(int seconds){
        if(seconds >= 0){
            int secsToMins = seconds / 60;
            int secsToSecs = seconds % 60;
            System.out.println(seconds + " seconds = "+ secsToMins + "m " + secsToSecs + "s");
            getDurationString(secsToMins,secsToSecs);
        }else
            System.out.println(INVALID_VALUE_MESSAGE);
    }

}
