package yapps.gallery;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.picasso.Picasso;

import java.util.concurrent.ExecutionException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import yapps.gallery.Services.Addresses;
import yapps.gallery.Services.ImageAdapter;
import yapps.gallery.Services.ImgurService;

public class MainActivity extends AppCompatActivity implements Callback<JsonElement>
{
    public static final int NUM_IMAGES_IN_ALBUM = 6;
    RecyclerView RV;
    Button BTNgetImages;
    ImageAdapter IA;
//    Thread t;
//    Picasso picasso;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RV = findViewById(R.id.RV_image_gallery);
        BTNgetImages = findViewById(R.id.BTN_ProduceGallery);
        IA = new ImageAdapter(this);
        RV.setAdapter(IA);


    }

    public void GetImages(View v)
    {
        //        if (t == null)
//        {
//            t = new Thread(new Runnable()
//            {
//                @Override
//                public void run()
//                {
//
//                }
//            });
//        }
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Addresses.BASE_ADDRESS)
                .build();
        ImgurService service = retrofit.create(ImgurService.class);
        service.getAlbumImages(Addresses.MY_ALBUM_ID, this);
    }


    /**
     * Invoked for a received HTTP response.
     * <p>
     * Note: An HTTP response may still indicate an application-level failure such as a 404 or 500.
     * Call {@link Response#isSuccessful()} to determine if the response indicates success.
     *
     * @param call
     * @param response
     */
    @Override
    public void onResponse(Call<JsonElement> call, Response<JsonElement> response)
    {
        JsonObject jo = (JsonObject) response.body();
        boolean success = jo.get("success").getAsBoolean();
        if (success)
        {

            JsonArray jsonArray = jo.get("data").getAsJsonObject().get("images").getAsJsonArray();

            String urls[] = new String[NUM_IMAGES_IN_ALBUM];
            int position = 0;
            for (JsonElement element : jsonArray)
            {
                urls[position] = element.getAsJsonObject().get("link").getAsString();
                Log.e("URL", "" + urls[position]);
                position++;
            }
            new MainActivity.GliderTask(this).execute(urls);
        }
    }

    /**
     * Invoked when a network exception occurred talking to the server or when an unexpected
     * exception occurred creating the request or processing the response.
     *
     * @param call
     * @param t
     */
    @Override
    public void onFailure(Call<JsonElement> call, Throwable t)
    {
        Toast.makeText(this, "No connection", Toast.LENGTH_LONG).show();
    }


    class GliderTask extends AsyncTask<String, Void, Integer>
    {
        Context context;

        public GliderTask(Context context)
        {
            this.context = context;
        }

        @Override
        protected Integer doInBackground(String... urls)
        {
            int position = 0;
            for (String url : urls)
            {
                    ImageView tmpIV = new ImageView(this.context);
                    Picasso.get().load(url).into(tmpIV);
                    Bitmap bitmap = ((BitmapDrawable)tmpIV.getDrawable()).getBitmap();
                    IA.addImage(position, bitmap);
                    position++;
            }
            return -1;
        }

        @Override
        protected void onPostExecute(Integer integer)
        {
            IA.notifyDataSetChanged();
            Toast.makeText(MainActivity.this, "Done", Toast.LENGTH_LONG).show();
        }
    }
}
