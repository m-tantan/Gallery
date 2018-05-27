package yapps.gallery;

import android.graphics.Bitmap;
import android.widget.TextView;

public class ImageRow
{

    int index;

    Bitmap image;


    public ImageRow()
    {
    }

    public ImageRow(int index, Bitmap image)
    {
        this.index = index;
        this.image = image;
    }

    public Bitmap getImage()
    {
        return image;
    }


    public void setImage(Bitmap image)
    {
        this.image = image;
    }

}

