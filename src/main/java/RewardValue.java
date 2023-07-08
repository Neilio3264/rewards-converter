public class RewardValue {
    private static final double conversionRate = 0.0035;
    private double cashValue;
    private int milesValue;

    public RewardValue() {
        cashValue = 0;
        milesValue = 0;
    }

    public RewardValue(double cashAmount) {
        cashValue = cashAmount;
        milesValue = (int) calculateConversion(false);
    }

    public  RewardValue(int milesAmount) {
        cashValue = calculateConversion(true);
        milesValue = milesAmount;
    }

    /**
     * Returns a double value for the requested cash or miles value.
     * The method will not set a value to any variable
     * <p/>
     * This method uses the static conversion rate set beforehand. If the
     * method requires any changes, the only change that should occur is the
     * conversion rate set within the class itself. The method is designed to be
     * a helper function that is automatically invoked upon setting the
     * cash amount of mile amount.
     *
     * @param milesToCash boolean value indicating in which direction the
     *                    conversion should take place between the two currencies
     *                    <p>
     *                    milesToCash = (miles -> cash)
     * @return double value that is directly calculated
     */
    private double calculateConversion(boolean milesToCash) {
        return (milesToCash) ? (milesValue * conversionRate) : (cashValue / conversionRate);
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    public void setCashValue(double cashAmount) {
        cashValue = cashAmount;
        milesValue = (int) calculateConversion(false);
    }

    public void setMilesValue(int milesAmount) {
        cashValue = calculateConversion(true);
        milesValue = milesAmount;
    }
}
