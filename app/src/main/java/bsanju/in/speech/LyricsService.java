package bsanju.in.speech;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface LyricsService {
    @GET("getLyrics")
    Call<LyricsResponse> getLyrics(@Query("song") String songName);
}
