
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        if (birdsPerDay.length == 0) {
            return 0;
        }
        
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int watched : birdsPerDay) {
            if (watched == 0) {
                return true;
            }
        }
        
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int total = 0;
        for (int i = 0; (i < numberOfDays) && (i < birdsPerDay.length); ++i) {
            total += birdsPerDay[i];
        }
        
        return total;
    }

    public int getBusyDays() {
        int busy = 0;
        for (int watched : birdsPerDay) {
            if (watched > 4) {
                busy++;
            }
        }

        return busy;
    }
}
