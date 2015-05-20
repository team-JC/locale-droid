package locale.example.ngondo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;

import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.Result;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.core.identity.TwitterLoginButton;


public class Login extends Activity {

    private TwitterLoginButton loginButton;
    Button check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginButton = (TwitterLoginButton) findViewById(R.id.twitter_login_button);
        loginButton.setCallback(new Callback<TwitterSession>() {
            @Override
            public void success(Result<TwitterSession> result) {
                // Do something with result, which provides a TwitterSession for making API calls
                Log.e(null, "login success");
                toHome();
            }

            @Override
            public void failure(TwitterException exception) {
                // Do something on failure
                //Toast.makeText(this,"Login failed check credentials or network connection",Toast.LENGTH_SHORT).show();
            }
        });

        check=(Button)findViewById(R.id.checkout);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Login.this,Home.class);
                startActivity(i);
            }
        });
    }

    private void toHome(){
        Intent i = new Intent(this, Home.class);
        startActivity(i);
    }


}
