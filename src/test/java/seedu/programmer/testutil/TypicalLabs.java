package seedu.programmer.testutil;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import seedu.programmer.model.student.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TypicalLabs {
    public static final Lab LAB1 = new LabBuilder().withTitle("lab1").withResult(10.0).withTotal(20.0).build();
    public static final Lab LAB2 = new LabBuilder().withTitle("2").withResult(0.0).withTotal(10.0).build();
    public static final Lab LAB3 = new LabBuilder().withTitle("3").withResult(20.0).withTotal(20.0).build();
    public static final Lab LAB4 = new LabBuilder().withTitle("4").withResult(30.0).withTotal(40.0).build();
    public static final Lab LAB5 = new LabBuilder().withTitle("5").withResult(5.0).withTotal(20.0).build();
    public static final Lab LAB6 = new LabBuilder().withTitle("6").withResult(0.0).withTotal(40.0).build();

    private TypicalLabs() {} // prevents instantiation

    /**

     * Returns an {@code labresultlist} with all the typical labs.
     */
    public static ObservableList<Lab> getTypicalLabList() {
        ObservableList<Lab> labResultList = FXCollections.observableArrayList();
        for (Lab lab : getTypicalLabs()) {
            labResultList.add(lab);
        }
        return labResultList;
    }

    public static List<Lab> getTypicalLabs() {
        return new ArrayList<>(Arrays.asList(LAB1,LAB2,LAB3,LAB4,LAB5));
    }
}
