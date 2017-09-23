package kemo.example.com.youtubeapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import kemo.example.com.youtubeapi.Model.ApiYoutube;
import kemo.example.com.youtubeapi.Model.VideoItem;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    String API_KEY = "AIzaSyBoxWi6nKoSkXPMRvngX4pQLyrYE_D851U" ;
    String BASE_URL = "https://www.googleapis.com/youtube/v3/" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiYoutube apiYoutube = retrofit.create(ApiYoutube.class);

        String searchKey = "" ;
        Call<VideoItem> call = apiYoutube.searchVideos( "snippet", searchKey , API_KEY);
        call.enqueue(new Callback<VideoItem>() {
            @Override
            public void onResponse(Call<VideoItem> call, Response<VideoItem> response) {

            }
            @Override
            public void onFailure(Call<VideoItem> call, Throwable t) {
                Log.e("retrofit", t.toString());
            }
        });
    }
}
