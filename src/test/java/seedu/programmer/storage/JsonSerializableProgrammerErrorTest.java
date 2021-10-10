//package seedu.programmer.storage;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static seedu.programmer.testutil.Assert.assertThrows;
//
//import java.nio.file.Path;
//import java.nio.file.Paths;
//
//import org.junit.jupiter.api.Test;
//
//import seedu.programmer.commons.exceptions.IllegalValueException;
//import seedu.programmer.commons.util.JsonUtil;
//import seedu.programmer.model.ProgrammerError;
//import seedu.programmer.testutil.TypicalPersons;
//
//class JsonSerializableAddressBookTest {
//
//    private static final Path TEST_DATA_FOLDER = Paths.get("src", "test", "data", "JsonSerializableAddressBookTest");
//    private static final Path TYPICAL_PERSONS_FILE = TEST_DATA_FOLDER.resolve("typicalPersonsProgrammerError.json");
//    private static final Path INVALID_PERSON_FILE = TEST_DATA_FOLDER.resolve("invalidPersonProgrammerError.json");
//    private static final Path DUPLICATE_PERSON_FILE = TEST_DATA_FOLDER.resolve("duplicatePersonProgrammerError.json");
//
//    @Test
//    public void toModelType_typicalPersonsFile_success() throws Exception {
//        JsonSerializableProgrammerError dataFromFile = JsonUtil.readJsonFile(TYPICAL_PERSONS_FILE,
//                JsonSerializableProgrammerError.class).get();
//        ProgrammerError addressBookFromFile = dataFromFile.toModelType();
//        ProgrammerError typicalPersonsAddressBook = TypicalPersons.getTypicalAddressBook();
//        assertEquals(addressBookFromFile, typicalPersonsAddressBook);
//    }
//
//    @Test
//    public void toModelType_invalidPersonFile_throwsIllegalValueException() throws Exception {
//        JsonSerializableProgrammerError dataFromFile = JsonUtil.readJsonFile(INVALID_PERSON_FILE,
//                JsonSerializableProgrammerError.class).get();
//        assertThrows(IllegalValueException.class, dataFromFile::toModelType);
//    }
//
//    @Test
//    public void toModelType_duplicatePersons_throwsIllegalValueException() throws Exception {
//        JsonSerializableProgrammerError dataFromFile = JsonUtil.readJsonFile(DUPLICATE_PERSON_FILE,
//                JsonSerializableProgrammerError.class).get();
//        assertThrows(IllegalValueException.class, JsonSerializableProgrammerError.MESSAGE_DUPLICATE_PERSON,
//                dataFromFile::toModelType);
//    }
//
//}
