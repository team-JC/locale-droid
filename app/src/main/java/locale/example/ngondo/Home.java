package locale.example.ngondo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


import com.github.clans.fab.FloatingActionButton;
import com.parse.Parse;
import com.parse.ParseObject;


public class Home extends Activity {
    private FloatingActionButton fab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Instantiate FAB
        fab= (FloatingActionButton) findViewById(R.id.fab);
        //Add listeners to FAB
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this,AddLocale.class);
                startActivity(i);
            }
        });

//        // Enable Local Datastore.
//        Parse.enableLocalDatastore(this);
//        Parse.initialize(this, "ltc72x05iJA3XQIiCbrVvf02GkVr95LrXCaeU8zu", "tzWSgyKxt2EIH6U5cTgYGgpgxjJ21x0bIYz709ni");
//        //Testing functionality of parse
//        ParseObject testObject = new ParseObject("TestObject");
//        testObject.put("foo", "bar");
//        testObject.saveInBackground();
    }
}