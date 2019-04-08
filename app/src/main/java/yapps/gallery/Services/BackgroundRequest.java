package yapps.gallery.Services;

import android.os.AsyncTask;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import yapps.gallery.Data;

public class BackgroundRequest extends AsyncTask<Void, Void, Data>
{
    public ResponseListener delegate = null;

    @Override
    protected Data doInBackground(Void... voids)
    {
        Retrofit retroFit = new Retrofit.Builder().baseUrl(Addresses.BASE_ADDRESS)
                .addConverterFactory(GsonConverterFactory.create()).build();
        ImgurService service = retroFit.create(ImgurService.class);
        Call<ResponseDataHandler> method = service.getAlbum();
        Response<ResponseDataHandler> resp = null;
        ResponseDataHandler responseData= null;

        try
        {
            resp = method.execute();
            if (resp.isSuccessful())
            {
                responseData = resp.body();
            }

        } catch (IOException e)
        {
            e.printStackTrace();
        }
        return responseData.getData();
    }

    @Override
    protected void onPostExecute(Data data)
    {
        if (delegate != null)
            delegate.getResult(data);
    }
}
