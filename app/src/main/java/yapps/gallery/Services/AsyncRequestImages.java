package yapps.gallery.Services;

import android.os.AsyncTask;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import yapps.gallery.Data;

public class AsyncRequestImages extends AsyncTask<Void, Void, Data>
{
    public ServiceHandler.ServiceResponse delegate = null;

    @Override
    protected Data doInBackground(Void... voids)
    {
        Retrofit retroFit = new Retrofit.Builder().baseUrl(Addresses.BASE_ADDRESS).
                addConverterFactory(GsonConverterFactory.create()).build();
        ImgurService imgurService = retroFit.create(ImgurService.class);
        Call<ServiceHandler.ResponseData> call = imgurService.getAlbum();
        Response<ServiceHandler.ResponseData> response = null;
        ServiceHandler.ResponseData responseData= null;
        try
        {
            response = call.execute();
            if (response.isSuccessful())
            {
                responseData = response.body();
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
