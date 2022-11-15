public class Cup {
    private String liquidType;
    private double percentFull;

    public Cup(String liquidType, double percentFull) {
        this.liquidType = liquidType;
        this.percentFull = percentFull;
    }
    public String getLiquidType() {
        return liquidType;
    }
    public void setLiquidType(String liquidType) {
        if (liquidType == null) {
            return;
        }
        this.liquidType = liquidType;
    }
    public double getPercentFull() {
        return percentFull;
    }
    public boolean isEmpty() {
        return percentFull == 0;
    }
}
