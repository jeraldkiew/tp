package seedu.medinfo.logic.commands;

import static seedu.medinfo.testutil.TypicalPatients.getTypicalMedInfo;

import org.junit.jupiter.api.BeforeEach;

import seedu.medinfo.model.Model;
import seedu.medinfo.model.ModelManager;
import seedu.medinfo.model.UserPrefs;

/**
 * Contains integration tests (interaction with the Model) for {@code AddCommand}.
 */
public class AddCommandIntegrationTest {

    private Model model;

    @BeforeEach
    public void setUp() {
        model = new ModelManager(getTypicalMedInfo(), new UserPrefs());
    }

}
