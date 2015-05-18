package locale.example.ngondo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Infotwo extends Activity {
    Button btntake;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infotwo);
        //Initialize the button
        btntake = (Button) findViewById(R.id.take);
        //Add a listener to it
        btntake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Infotwo.this, Login.class);
                startActivity(i);
            }
        });
    }
}
