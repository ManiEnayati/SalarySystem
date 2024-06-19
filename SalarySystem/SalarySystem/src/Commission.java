public class Commission extends Salary{
    private int percentage;

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    @Override
    public void Calculate() {
        super.Calculate();
    }

    @Override
    public void PerMounth() {
        super.PerMounth();
    }
}
