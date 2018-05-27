package yapps.gallery;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.myViewHolder>
{
    private Context mContext;

    // Keep all Images in array
    public ArrayList<ImageRow> images = new ArrayList<ImageRow>();

    public ImageAdapter(Context c)
    {
        mContext = c;
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
        holder.iv.setImageBitmap(images.get(position).getImage());
        holder.iv.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    @Override
    public int getItemCount()
    {
        return images.size();
    }

    public void addImage(int pos, Bitmap img)
    {
        images.add(new ImageRow(pos, img));
    }
    static class myViewHolder extends RecyclerView.ViewHolder
    {
        LinearLayout LL;
        TextView tv;
        ImageView iv;

        public myViewHolder(View itemView)
        {
            super(itemView);
            LL = itemView.findViewById(R.id.LL_row);
            tv = itemView.findViewById(R.id.TV_img_name);
            iv = itemView.findViewById(R.id.IV_image);
        }
    }
}