package locale.example.ngondo;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;

/**
 * Created by ngondo on 19/05/15.
 */
@ParseClassName("Locale")
public class Locale extends ParseObject{

    //Constructor
    public Locale() {
    }
    //Getters and setters
    public String getTitle() {
        return getString("title");
    }
    public void setTitle(String title) {
        put("title",title);
    }

    public String getStreetname() {
        return getString("streetname");
    }
    public void setStreetname(String streetname) {
        put("streetname",streetname);
    }

    public String getPlocation() {
        return getString("plocation");
    }
    public void setPlocation(String plocation) {
        put("plocation",plocation);
    }

    public String getCategory() {
        return getString("category");
    }
    public void setCategory(String category) {
        put("category",category);
    }

    public ParseFile getPhotoFile() {
        return getParseFile("photo");
    }

    public void setPhotoFile(ParseFile file) {
        put("photo", file);
    }
}
