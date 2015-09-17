package locale.example.ngondo;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

//import com.facebook.drawee.backends.pipeline.Fresco;
import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;

import org.w3c.dom.Text;

import io.fabric.sdk.android.Fabric;


public class Splash extends Activity {

    // Note: Your consumer key and secret should be obfuscated in your source code before shipping.
    private static final String TWITTER_KEY = "6Tn8uBPkgAbMHYZnVvlNjx9ml";
    private static final String TWITTER_SECRET = "zoWyytF6LA0Otny2d1I8w81FneoWMlQJxWYYLajtdzrWny1DGN";

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TwitterAuthConfig authConfig = new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET);
        Fabric.with(this, new Twitter(authConfig));
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        //This window feature gives the full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Populate the view with the content of the xml
        setContentView(R.layout.activity_splash);
        //Add a font using typeface
        Typeface roboto = Typeface.createFromAsset(getAssets(), "rbt_thin.ttf");
        tv =((TextView)findViewById(R.id.lo));
        tv.setTypeface(roboto);
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
}
