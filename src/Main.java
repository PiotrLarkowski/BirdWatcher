import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] watchedBirdsTable = new int[7];
        BirdWatcher birdWatcher = new BirdWatcher(watchedBirdsTable);
        System.out.print("Birds spotted last week: ");
        System.out.print(Arrays.toString(birdWatcher.getLastWeek()) + "\n");
        System.out.print("Birds spotted today: ");
        System.out.print(birdWatcher.getToday() + "\n");
        System.out.print("Birds spotted today after added +1: ");
        birdWatcher.incrementTodaysCount();
        System.out.print(birdWatcher.getToday() + "\n");
        System.out.print("Was there day without birds? ");
        System.out.print(birdWatcher.hasDayWithoutBirds() + "\n");
        System.out.print("How many bird visited garden from start of week to given day? ");
        System.out.print(birdWatcher.getCountForFirstDays(3)+"\n");
        System.out.print("Was there a busy day in last week that more then 5 birds come to garden? ");
        System.out.print(birdWatcher.getBusyDays()+"\n");
    }
}