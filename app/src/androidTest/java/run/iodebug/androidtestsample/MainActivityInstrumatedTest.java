package run.iodebug.androidtestsample;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.robotium.solo.Solo;
import org.junit.Test;

/**
 * Created by Ahmad on 9/7/16.
 */
public class MainActivityInstrumatedTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private Solo solo;

    public MainActivityInstrumatedTest() {
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        solo = new Solo(this.getInstrumentation(), getActivity());
    }

    @Test
    public void testEdittext() throws Exception {
        solo.hideSoftKeyboard();

        TextView txtStatus = (TextView) solo.getView(R.id.txtStatus);
        EditText editText = (EditText) solo.getView(R.id.editText);
        Button btnOk = (Button) solo.getView(R.id.btnOk);

        solo.clickOnView(btnOk);
        assertTrue(solo.searchText(getActivity().getString(R.string.edittext_status_empty)));
        solo.typeText(editText, "Some Text");
        solo.clickOnView(btnOk);
        assertTrue(solo.searchText(getActivity().getString(R.string.edittext_status_full)));
        assertTrue(txtStatus.getText().toString().equals(getActivity().getString(R.string.edittext_status_full)));

    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }

}
