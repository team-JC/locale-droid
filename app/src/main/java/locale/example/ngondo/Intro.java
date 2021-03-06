package locale.example.ngondo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;


public class Intro extends AppIntro {

    @Override
    public void init(Bundle bundle) {
        addSlide(SampleSlide.newInstance(R.layout.fragment_intro1));
        addSlide(SampleSlide.newInstance(R.layout.fragment_intro2));
    }
    public void LoadMain(){
        Intent i = new Intent(Intro.this, Home.class);
        startActivity(i);
        this.finish();
    }

    @Override
    public void onSkipPressed() {
        LoadMain();
    }

    @Override
    public void onDonePressed() {
        LoadMain();
    }

}
