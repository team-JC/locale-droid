package locale.example.ngondo;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionButton;


public class Hotels extends Activity {
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);
        //Instantiate FAB
        fab= (FloatingActionButton) findViewById(R.id.fab);
        //Add listeners to FAB
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Hotels.this,"FAB is working",Toast.LENGTH_SHORT).show();
            }
        });


    }
}
