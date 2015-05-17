package locale.example.ngondo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class register extends ActionBarActivity implements View.OnClickListener {

    Button bRegister;
    EditText etName, etUserName, etPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etName = (EditText)findViewById(R.id.etName);
        etUserName = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        bRegister = (Button) findViewById(R.id.bRegister);


        bRegister.setOnClickListener(this);



    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bRegister:

                break;
        }

    }
}
