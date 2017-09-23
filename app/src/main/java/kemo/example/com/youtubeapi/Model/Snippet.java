package kemo.example.com.youtubeapi.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kemo on 9/23/2017.
 */

public class Snippet {

    @SerializedName("title")
    String title;

    @SerializedName("description")
    String description;

    @SerializedName("thumbnails")
    Snippet snippet;


    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Snippet getSnippet() {
        return snippet;
    }
}
