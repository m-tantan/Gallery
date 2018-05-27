
package yapps.gallery;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Thumbnail {

    @SerializedName("animated")
    private Object mAnimated;

    public Object getAnimated() {
        return mAnimated;
    }

    public void setAnimated(Object animated) {
        mAnimated = animated;
    }

}
