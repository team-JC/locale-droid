package locale.example.ngondo;

import android.app.Application;



import com.parse.Parse;
import com.parse.ParseObject;
import com.parse.ParseUser;

//This is where we register our Locale.java class that holds the getters and setters
public class Share extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Locale.class);

        //Parse application credentials
        Parse.initialize(this, "ltc72x05iJA3XQIiCbrVvf02GkVr95LrXCaeU8zu", "tzWSgyKxt2EIH6U5cTgYGgpgxjJ21x0bIYz709ni");

        ParseUser.enableAutomaticUser();

    }
}
