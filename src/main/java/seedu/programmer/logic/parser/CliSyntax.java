package seedu.programmer.logic.parser;

/**
 * Contains Command Line Interface (CLI) syntax definitions common to multiple commands
 */
public class CliSyntax {

    /* Prefix definitions */
    public static final Prefix PREFIX_NAME = new Prefix("-n ");
    public static final Prefix PREFIX_STUDENT_ID = new Prefix("-sid ");
    public static final Prefix PREFIX_CLASS_ID = new Prefix("-cid ");
    public static final Prefix PREFIX_EMAIL = new Prefix("-email ");

    public static final Prefix PREFIX_INDEX = new Prefix("-i ");
    public static final Prefix PREFIX_LAB_NUM = new Prefix("-t ");
    public static final Prefix PREFIX_LAB_NEW_TITLE = new Prefix("-nt ");
    public static final Prefix PREFIX_LAB_RESULT = new Prefix("-s ");
    public static final Prefix PREFIX_LAB_TOTAL = new Prefix("-ts ");
}
