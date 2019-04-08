package yapps.gallery;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.myViewHolder>
{
    private Context mContext;

    public ArrayList<Image> images;

    public ImageAdapter(Context c)
    {
        mContext = c;
        images = new ArrayList<>();
    }

    @NonNull
    @Override
    public ImageAdapter.myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_row,
                parent, false);
        return new ImageAdapter.myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ImageAdapter.myViewHolder holder, int position)
    {
        Picasso.get().load(images.get(position).getLink()).resize(300, 300).into(holder.iv);
    }

    @Override
    public int getItemCount()
    {
        return images.size();
    }

    static class myViewHolder extends RecyclerView.ViewHolder
    {
        ImageView iv;

        public myViewHolder(View itemView)
        {
            super(itemView);
            iv = itemView.findViewById(R.id.IV_image);
        }
    }
}