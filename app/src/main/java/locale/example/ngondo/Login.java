package locale.example.ngondo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.Result;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.core.identity.TwitterLoginButton;


public class Login extends ActionBarActivity implements View.OnClickListener {

    Button bLogin;
    EditText etUsername, etPassword;
    TextView tvRegisterLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        bLogin = (Button) findViewById(R.id.bLogin);
        etPassword = (EditText) findViewById(R.id.etPassword);
        etUsername = (EditText) findViewById(R.id.etUsername);
        tvRegisterLink =(TextView) findViewById(R.id.tvRegisterLink);


        bLogin.setOnClickListener(this);
        tvRegisterLink.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bLogin:


                break;
            case R.id.tvRegisterLink:
                // start the register activity when the textview is clicked
                startActivity(new Intent(this, register.class));
                break;
        }

    }
}
