package yapps.gallery;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import yapps.gallery.Services.AsyncRequestImages;
import yapps.gallery.Services.ServiceHandler;

public class MainActivity extends AppCompatActivity implements ServiceHandler.ServiceResponse
{
    RecyclerView RV;
    Button BTNgetImages;
    ImageAdapter IA;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();
        BTNgetImages = findViewById(R.id.BTN_ProduceGallery);
    }

    private void initRecyclerView()
    {
        RV = findViewById(R.id.RV_image_gallery);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        RV.setLayoutManager(layoutManager);
        IA = new ImageAdapter(this);
        RV.setAdapter(IA);
    }

    public void GetImages(View v)
    {
        BTNgetImages.setClickable(false);
        BTNgetImages.setVisibility(View.GONE);
        AsyncRequestImages request = new AsyncRequestImages();
        request.delegate = MainActivity.this;
        request.execute();
    }


    @Override
    public void getResult(Data data)
    {

    }

}
