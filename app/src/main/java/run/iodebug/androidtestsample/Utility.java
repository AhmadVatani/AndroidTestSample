package run.iodebug.androidtestsample;

/**
 * Created by Ahmad on 9/7/16.
 */
public class Utility {

    public static boolean isEdittextFull(String edittextString) {
        if(edittextString.length() > 0)
            return true;
        else
            return false;
    }

    public static int mathAdding(int a, int b) {
        return a + b;
    }
}
