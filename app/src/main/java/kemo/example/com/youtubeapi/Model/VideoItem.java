package kemo.example.com.youtubeapi.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kemo on 8/14/2017.
 */

public class VideoItem {

    @SerializedName("snippet")
    Snippet snippet;

    public Snippet getSnippet() {
        return snippet;
    }
}
