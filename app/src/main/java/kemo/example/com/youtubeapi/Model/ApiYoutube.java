package kemo.example.com.youtubeapi.Model;

import kemo.example.com.youtubeapi.Model.VideoItem;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface ApiYoutube {
    @GET("search")
    Call<VideoItem> searchVideos(@Query("part") String part, @Query("q") String search, @Query("key") String s);

}
