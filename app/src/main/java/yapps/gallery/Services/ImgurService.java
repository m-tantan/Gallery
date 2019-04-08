package yapps.gallery.Services;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;


public interface ImgurService
{

    @Headers("Authorization: Client-ID " + Addresses.CLIENT_ID)
    @GET("album/yYf7tLi")
    Call<ResponseDataHandler> getAlbum();
}
