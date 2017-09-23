package kemo.example.com.youtubeapi.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kemo on 9/23/2017.
 */

public class Thumbnails {

    @SerializedName("default")
    Default defaultThumb;

    public Default getDefaultThumb() {
        return defaultThumb;
    }
}
