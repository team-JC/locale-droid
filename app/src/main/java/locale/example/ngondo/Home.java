package locale.example.ngondo;

import android.app.Activity;
import android.os.Bundle;


import com.parse.Parse;
import com.parse.ParseObject;


public class Home extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

//        // Enable Local Datastore.
//        Parse.enableLocalDatastore(this);
//        Parse.initialize(this, "ltc72x05iJA3XQIiCbrVvf02GkVr95LrXCaeU8zu", "tzWSgyKxt2EIH6U5cTgYGgpgxjJ21x0bIYz709ni");
//        //Testing functionality of parse
//        ParseObject testObject = new ParseObject("TestObject");
//        testObject.put("foo", "bar");
//        testObject.saveInBackground();
    }
}