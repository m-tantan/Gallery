package yapps.gallery.Services;

import com.google.gson.JsonElement;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;


public interface ImgurService
{

    @Headers("Authorization: Client-ID " + Addresses.CLIENT_ID)
    @GET("album/oYL6v")
    Call<ServiceHandler.ResponseData> getAlbum();
}
