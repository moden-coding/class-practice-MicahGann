public class phoneBattery {
    
    private double capacity = 100.00;
    private double dead = 0;
    private double currentCharge;
    public phoneBattery(double startCharge){
        this.currentCharge = startCharge;
    }
    public void chargeBattery(double chargeNumber) {
        this.currentCharge = this.currentCharge + chargeNumber;
        if ((this.currentCharge + chargeNumber) > this.capacity) {
            this.currentCharge = this.capacity;
        }
    }

    public void depleteBattery(double depleteNumber) {
        this.currentCharge = this.currentCharge - depleteNumber;
        if ((this.currentCharge - depleteNumber) < this.dead) {
            this.currentCharge = this.dead;
        }
    }

    public boolean isCharged() {
        if (currentCharge == 100) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "The battery is at, " + this.currentCharge + " percent";
    }

}
