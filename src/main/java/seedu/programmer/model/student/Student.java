package seedu.programmer.model.student;

import static seedu.programmer.commons.util.CollectionUtil.requireAllNonNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


/**
 * Represents a student in the ProgrammerError.
 * Guarantees: details are present and not null, field values are validated, immutable.
 */
public class Student {

    // Identity fields
    private final Name name;
    private final StudentId studentId;
    private final ClassId classId;
    private final Email email;
    private ObservableList<Lab> labResultList;


    /**
     * Every field must be present and not null.
     */
    public Student(Name name, StudentId studentId, ClassId classId, Email email) {
        requireAllNonNull(name, studentId, classId, email);
        this.name = name;
        this.studentId = studentId;
        this.classId = classId;
        this.email = email;
        this.labResultList = FXCollections.observableArrayList();
    }

    public Name getName() {
        return name;
    }

    public String getFullName() {
        return name.fullName;
    }


    public StudentId getStudentId() {
        return studentId;
    }

    public ClassId getClassId() {
        return classId;
    }

    public Email getEmail() {
        return email;
    }

    public ObservableList<Lab> getLabResultList() {
        return labResultList;
    }

    /**
     * Adds a lab result to all the student records
     * */
    public void addLabResult(Lab result) {
        this.labResultList.add(result);
    }

    /**
     * Deletes a lab result from all the student records
     * */
    public void delLabResult(Lab result) {
        this.labResultList.remove(result);
    }

    /**
     * Updates a lab result for a student
     * */
    public void editLabResult(Lab result, Double value) {
        int index = this.labResultList.indexOf(result);
        Lab current = this.labResultList.get(index);
        current.updateActualScore(value);
    }

    public void setLabResultRecord(List<Lab> labResultRecord) {
        if (labResultRecord == null) {
            labResultRecord = new ArrayList<>();
        }
        this.labResultList.addAll(labResultRecord);
    }
    /**
     * Returns true if both students have the same name.
     * This defines a weaker notion of equality between two students.
     */
    public boolean isSameStudent(Student otherStudent) {
        if (otherStudent == this) {
            return true;
        }

        return otherStudent != null
                && otherStudent.getStudentId().equals(getStudentId());
    }

    /**
     * Returns true if both students have the same identity and data fields.
     * This defines a stronger notion of equality between two students.
     */
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof Student)) {
            return false;
        }

        Student otherStudent = (Student) other;
        return otherStudent.getName().equals(getName())
                && otherStudent.getStudentId().equals(getStudentId())
                && otherStudent.getClassId().equals(getClassId())
                && otherStudent.getEmail().equals(getEmail())
                && otherStudent.getLabResultList().equals(getLabResultList());
    }

    @Override
    public int hashCode() {
        // use this method for custom fields hashing instead of implementing your own
        return Objects.hash(name, studentId, classId, email);
    }

    @Override
    public String toString() {
        return getName()
                + "; Student ID: "
                + getStudentId()
                + "; Class ID: "
                + getClassId()
                + "; Email: "
                + getEmail();
    }

    /**
     * Create a new Student Object with the same fields.
     * @return a copy of the Student
     * */
    public Student clone() {
        Student clone = new Student(name, studentId, classId, email);
        clone.setLabResultRecord(labResultList);
        return clone;
    }
}
