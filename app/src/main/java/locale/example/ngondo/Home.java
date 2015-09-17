package locale.example.ngondo;


import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


//import com.facebook.drawee.backends.pipeline.Fresco;
import com.github.clans.fab.FloatingActionButton;
import com.parse.ParseQueryAdapter;


public class Home extends ListActivity {
    private ParseQueryAdapter<Locale> mainAdapter;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //This code initializes the Fresco action that caches images
        //Fresco.initialize(context);
        getListView().setClickable(false);
        //Instantiate FAB
        fab = (FloatingActionButton) findViewById(R.id.fab);
        //Add listeners to FAB
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this,AddLocale.class);
                startActivity(i);
            }
        });

        mainAdapter=new ParseQueryAdapter<Locale>(this, Locale.class);
        mainAdapter.setTextKey("title");
        mainAdapter.setTextKey("category");
        mainAdapter.setTextKey("streetname");
        mainAdapter.setTextKey("plocation");
        mainAdapter.setImageKey("photo");

        setListAdapter(mainAdapter);

//        // Enable Local Datastore.
//        Parse.enableLocalDatastore(this);
//        Parse.initialize(this, "ltc72x05iJA3XQIiCbrVvf02GkVr95LrXCaeU8zu", "tzWSgyKxt2EIH6U5cTgYGgpgxjJ21x0bIYz709ni");
//        //Testing functionality of parse
//        ParseObject testObject = new ParseObject("TestObject");
//        testObject.put("foo", "bar");
//        testObject.saveInBackground();
    }
}