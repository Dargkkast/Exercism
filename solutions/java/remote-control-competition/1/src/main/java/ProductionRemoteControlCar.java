class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    int distance;
    int victories;

    public ProductionRemoteControlCar() {
        this.distance = 0;
    }
    
    public void drive() {
        distance += 10;
    }

    public int getDistanceTravelled() {
        return distance;
    }

    public int getNumberOfVictories() {
        return victories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.victories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar otherCar) {
        int victoryComparison = Integer.compare(this.victories, otherCar.getNumberOfVictories());
        
        if (victoryComparison != 0)
            return victoryComparison;
        
        return Integer.compare(this.distance, otherCar.getDistanceTravelled());
    }
}
