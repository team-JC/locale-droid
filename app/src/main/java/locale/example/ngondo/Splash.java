package locale.example.ngondo;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;


public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        //This window feature gives the full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Populate the view with the content of the xml
        setContentView(R.layout.activity_splash);
        //Add a font
//        initTypeface();

        //Handler for setting the activity to go to and the time taken in ms
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Starting the splash activity
                Intent i = new Intent(Splash.this, Info.class);
                startActivity(i);
                //This exits the SplashScreen activity
                this.finish();
            }
            private void finish() {
                //Generated finish method
            }
        }, 2000);

    }
//    private void initTypeface() {
//        Typeface roboto = Typeface.createFromAsset(getAssets(),"Roboto-Thin.ttf");
//        TextView titleText = (TextView)findViewById(R.id.title);
//        titleText.setTypeface(roboto);
//
//    }
}
