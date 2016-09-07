package run.iodebug.androidtestsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView txtStatus;
    EditText editText;
    Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtStatus = (TextView) findViewById(R.id.txtStatus);
        editText = (EditText) findViewById(R.id.editText);
        btnOk = (Button) findViewById(R.id.btnOk);

        btnOk.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view == btnOk) {
            if(Utility.isEdittextFull(editText.getText().toString()))
                txtStatus.setText(getString(R.string.edittext_status_full));
            else
                txtStatus.setText(getString(R.string.edittext_status_empty));
        }
    }
}
