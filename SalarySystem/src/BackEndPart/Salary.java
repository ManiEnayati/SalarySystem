package BackEndPart;

import java.time.LocalDate;
import Gui.*;
public class Salary {
    private int id;
    private LocalDate startDate;
    private LocalDate endDate;
    private int mangerCompensation;
    private Activity endReason;
    private int idCounter;
    private int baseSalary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getMangerCompensation() {
        return mangerCompensation;
    }

    public void setMangerCompensation(int mangerCompensation) {
        this.mangerCompensation = mangerCompensation;
    }

    public Activity getEndReason() {
        return endReason;
    }

    public void setEndReason(Activity endReason) {
        this.endReason = endReason;
    }

    public int getIdCounter() {
        return idCounter;
    }

    public void setIdCounter(int idCounter) {
        this.idCounter = idCounter;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void Calculate() {

    }

    public void PerMounth(){

    }
}
