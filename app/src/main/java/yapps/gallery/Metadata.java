
package yapps.gallery;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Metadata {

    @SerializedName("accent")
    private String mAccent;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("is_promoted")
    private String mIsPromoted;
    @SerializedName("logo_destination_url")
    private Object mLogoDestinationUrl;
    @SerializedName("logo_hash")
    private Object mLogoHash;
    @SerializedName("tag_id")
    private String mTagId;
    @SerializedName("title")
    private String mTitle;

    public String getAccent() {
        return mAccent;
    }

    public void setAccent(String accent) {
        mAccent = accent;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getIsPromoted() {
        return mIsPromoted;
    }

    public void setIsPromoted(String isPromoted) {
        mIsPromoted = isPromoted;
    }

    public Object getLogoDestinationUrl() {
        return mLogoDestinationUrl;
    }

    public void setLogoDestinationUrl(Object logoDestinationUrl) {
        mLogoDestinationUrl = logoDestinationUrl;
    }

    public Object getLogoHash() {
        return mLogoHash;
    }

    public void setLogoHash(Object logoHash) {
        mLogoHash = logoHash;
    }

    public String getTagId() {
        return mTagId;
    }

    public void setTagId(String tagId) {
        mTagId = tagId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

}
