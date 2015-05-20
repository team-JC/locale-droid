package locale.example.ngondo;


import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.GetDataCallback;
import com.parse.ParseException;
import com.parse.ParseFile;
import com.parse.ParseImageView;
import com.parse.SaveCallback;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddLocaleFragment extends Fragment {

    Button takephotoButton, cancelButton, saveButton;
    EditText name, description, streetname, category, plocation;
    ParseImageView localePreview;

    public AddLocaleFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_add_locale, container, false);

        //Declarations
        name = ((EditText)v.findViewById(R.id.editText));
        category=((EditText)v.findViewById(R.id.editText4));
        streetname=((EditText)v.findViewById(R.id.editText3));
        plocation=((EditText)v.findViewById(R.id.editText5));

        takephotoButton=((Button)v.findViewById(R.id.btntakephoto));
        takephotoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputMethodManager imm = (InputMethodManager) getActivity()
                        .getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(name.getWindowToken(),0);
                startCamera();
            }
        });

        saveButton=((Button)v.findViewById(R.id.btnsave));
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Locale locale=((AddLocale) getActivity()).getCurrentLocale();

                // When the user clicks "Save," upload the locale to Parse
                // Add data to the locale object:
                locale.setTitle(name.getText().toString());

                locale.setCategory(category.getText().toString());

                locale.setStreetname(streetname.getText().toString());

                locale.setPlocation(plocation.getText().toString());

                locale.saveInBackground(new SaveCallback() {
                    @Override
                    public void done(ParseException e) {
                        if (e == null) {
                            getActivity().setResult(Activity.RESULT_OK);
                            Toast.makeText(getActivity(),"Successfully saved Locale",Toast.LENGTH_SHORT)
                                    .show();
                            getActivity().finish();
                        } else {
                            Toast.makeText(
                                    getActivity().getApplicationContext(),
                                    "Error saving: " + e.getMessage(),
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });

        cancelButton=((Button)v.findViewById(R.id.btncancel));
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().setResult(Activity.RESULT_CANCELED);
                getActivity().finish();
            }
        });

        //Until the user has taken the photo, hide the preview
        localePreview=(ParseImageView)v.findViewById(R.id.localepreview);
        localePreview.setVisibility(View.INVISIBLE);
        return  v;
    }

    private void startCamera() {
        Fragment cameraFragment = new CameraFragment();
        FragmentTransaction transaction = getActivity().getFragmentManager()
                .beginTransaction();
        transaction.replace(R.id.fragmentcontainer, cameraFragment);
        transaction.addToBackStack("AddLocaleFragment");
        transaction.commit();
    }
    /*
	 * On resume, check and see if a photo has been set from the
	 * CameraFragment. If it has, load the image in this fragment and make the
	 * preview image visible.
	 */
    @Override
    public void onResume() {
        super.onResume();
        ParseFile photoFile = ((AddLocale) getActivity())
                .getCurrentLocale().getPhotoFile();
        if (photoFile != null) {
            localePreview.setParseFile(photoFile);
            localePreview.loadInBackground(new GetDataCallback() {
                @Override
                public void done(byte[] data, ParseException e) {
                    localePreview.setVisibility(View.VISIBLE);
                }
            });
        }
    }


}
