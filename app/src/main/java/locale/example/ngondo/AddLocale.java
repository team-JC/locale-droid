package locale.example.ngondo;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;


public class AddLocale extends Activity {
    private Locale locale=new Locale();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_locale);

        // Begin with main data entry view,
        // NewMealFragment
        FragmentManager manager = getFragmentManager();
        Fragment fragment = manager.findFragmentById(R.id.fragmentcontainer);

        if (fragment == null) {
            fragment = new AddLocaleFragment();
            manager.beginTransaction().add(R.id.fragmentcontainer, fragment)
                    .commit();
        }
    }
    public Locale getCurrentLocale() {
        return locale;
    }
}
