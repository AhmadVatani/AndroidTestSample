package run.iodebug.androidtestsample;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Ahmad on 9/7/16.
 */
public class UtilityUnitTest {

    @Test
    public void checking_edittext_lenth_workCorrect() throws Exception {
        assertTrue(Utility.isEdittextFull("Test String"));
    }

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(Utility.mathAdding(2, 2), 4);
    }
}
