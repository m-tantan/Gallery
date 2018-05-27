
package yapps.gallery;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class AdConfig {

    @SerializedName("safeFlags")
    private List<String> mSafeFlags;
    @SerializedName("showsAds")
    private Boolean mShowsAds;
    @SerializedName("unsafeFlags")
    private List<Object> mUnsafeFlags;

    public List<String> getSafeFlags() {
        return mSafeFlags;
    }

    public void setSafeFlags(List<String> safeFlags) {
        mSafeFlags = safeFlags;
    }

    public Boolean getShowsAds() {
        return mShowsAds;
    }

    public void setShowsAds(Boolean showsAds) {
        mShowsAds = showsAds;
    }

    public List<Object> getUnsafeFlags() {
        return mUnsafeFlags;
    }

    public void setUnsafeFlags(List<Object> unsafeFlags) {
        mUnsafeFlags = unsafeFlags;
    }

}
