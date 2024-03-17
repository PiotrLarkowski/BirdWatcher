import java.util.Arrays;

public class BirdWatcher {
    private final int[] birdsPerDay;
    private int[] lastWeek = {0,2,5,3,7,8,4};

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return lastWeek;
    }

    public int getToday() {
        int length = lastWeek.length;
        return lastWeek[length-1];
    }

    public void incrementTodaysCount() {
        lastWeek[6]++;
    }

    public boolean hasDayWithoutBirds() {
        int[] lastWeek = getLastWeek();
        for(int value: lastWeek){
            if(value == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int[] lastWeek = getLastWeek();
        int sum=0;
        if(numberOfDays >lastWeek.length){
            numberOfDays = lastWeek.length;
        }
        for(int i=0;i<numberOfDays;i++){
            sum=sum+lastWeek[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int[] lastWeek = getLastWeek();
        int countOfBusyDays = 0;
        for(int value: lastWeek){
            if(value>=5){
                countOfBusyDays++;
            }
        }
        return countOfBusyDays;
    }
}
