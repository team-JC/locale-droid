package locale.example.ngondo;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

public class Info extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);


    }

    private void addInfoFragment(){
        //creating instance of Fragment one
        Fragment fg1 = InfoFragmentone.newInstance();
        


    }

    public static class InfoFragmentone extends Fragment{

        public static Fragment newInstance(){
            InfoFragmentone fgone = new InfoFragmentone();
            return fgone;
        }

    }
}
