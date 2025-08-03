public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        return Math.round((
            switch (speed) {
                case 5,6,7,8 -> 221 * 0.9 * speed; 
                case 9 -> 221 * 0.8 * speed;
                case 10 -> 221 * 0.77 * speed;
                default -> 221 * speed;
            }
        ) * 10) / 10d;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
}
