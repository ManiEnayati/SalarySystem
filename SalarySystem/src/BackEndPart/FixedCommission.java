package BackEndPart;
import Gui.*;
public class FixedCommission extends Commission{
    private int fixSalary;

    public int getFixSalary() {
        return fixSalary;
    }

    public void setFixSalary(int fixSalary) {
        this.fixSalary = fixSalary;
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
