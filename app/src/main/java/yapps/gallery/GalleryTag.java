
package yapps.gallery;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class GalleryTag
{

    @SerializedName("account_id")
    private String mAccountId;
    @SerializedName("animated")
    private String mAnimated;
    @SerializedName("background_hash")
    private String mBackgroundHash;
    @SerializedName("blocked")
    private String mBlocked;
    @SerializedName("display")
    private String mDisplay;
    @SerializedName("downs")
    private String mDowns;
    @SerializedName("hash")
    private String mHash;
    @SerializedName("id")
    private String mId;
    @SerializedName("image")
    private Image mImage;
    @SerializedName("images")
    private String mImages;
    @SerializedName("is_promoted")
    private String mIsPromoted;
    @SerializedName("metadata")
    private Metadata mMetadata;
    @SerializedName("nsfw")
    private String mNsfw;
    @SerializedName("score")
    private String mScore;
    @SerializedName("spam")
    private String mSpam;
    @SerializedName("subscribers")
    private String mSubscribers;
    @SerializedName("tag")
    private String mTag;
    @SerializedName("tag_id")
    private String mTagId;
    @SerializedName("thumbnail")
    private Thumbnail mThumbnail;
    @SerializedName("thumbnail_animated")
    private Object mThumbnailAnimated;
    @SerializedName("thumbnail_hash")
    private Object mThumbnailHash;
    @SerializedName("timestamp")
    private String mTimestamp;
    @SerializedName("ups")
    private String mUps;

    public String getAccountId()
    {
        return mAccountId;
    }

    public void setAccountId(String accountId)
    {
        mAccountId = accountId;
    }

    public String getAnimated()
    {
        return mAnimated;
    }

    public void setAnimated(String animated)
    {
        mAnimated = animated;
    }

    public String getBackgroundHash()
    {
        return mBackgroundHash;
    }

    public void setBackgroundHash(String backgroundHash)
    {
        mBackgroundHash = backgroundHash;
    }

    public String getBlocked()
    {
        return mBlocked;
    }

    public void setBlocked(String blocked)
    {
        mBlocked = blocked;
    }

    public String getDisplay()
    {
        return mDisplay;
    }

    public void setDisplay(String display)
    {
        mDisplay = display;
    }

    public String getDowns()
    {
        return mDowns;
    }

    public void setDowns(String downs)
    {
        mDowns = downs;
    }

    public String getHash()
    {
        return mHash;
    }

    public void setHash(String hash)
    {
        mHash = hash;
    }

    public String getId()
    {
        return mId;
    }

    public void setId(String id)
    {
        mId = id;
    }

    public Image getImage()
    {
        return mImage;
    }

    public void setImage(Image image)
    {
        mImage = image;
    }

    public String getImages()
    {
        return mImages;
    }

    public void setImages(String images)
    {
        mImages = images;
    }

    public String getIsPromoted()
    {
        return mIsPromoted;
    }

    public void setIsPromoted(String isPromoted)
    {
        mIsPromoted = isPromoted;
    }

    public Metadata getMetadata()
    {
        return mMetadata;
    }

    public void setMetadata(Metadata metadata)
    {
        mMetadata = metadata;
    }

    public String getNsfw()
    {
        return mNsfw;
    }

    public void setNsfw(String nsfw)
    {
        mNsfw = nsfw;
    }

    public String getScore()
    {
        return mScore;
    }

    public void setScore(String score)
    {
        mScore = score;
    }

    public String getSpam()
    {
        return mSpam;
    }

    public void setSpam(String spam)
    {
        mSpam = spam;
    }

    public String getSubscribers()
    {
        return mSubscribers;
    }

    public void setSubscribers(String subscribers)
    {
        mSubscribers = subscribers;
    }

    public String getTag()
    {
        return mTag;
    }

    public void setTag(String tag)
    {
        mTag = tag;
    }

    public String getTagId()
    {
        return mTagId;
    }

    public void setTagId(String tagId)
    {
        mTagId = tagId;
    }

    public Thumbnail getThumbnail()
    {
        return mThumbnail;
    }

    public void setThumbnail(Thumbnail thumbnail)
    {
        mThumbnail = thumbnail;
    }

    public Object getThumbnailAnimated()
    {
        return mThumbnailAnimated;
    }

    public void setThumbnailAnimated(Object thumbnailAnimated)
    {
        mThumbnailAnimated = thumbnailAnimated;
    }

    public Object getThumbnailHash()
    {
        return mThumbnailHash;
    }

    public void setThumbnailHash(Object thumbnailHash)
    {
        mThumbnailHash = thumbnailHash;
    }

    public String getTimestamp()
    {
        return mTimestamp;
    }

    public void setTimestamp(String timestamp)
    {
        mTimestamp = timestamp;
    }

    public String getUps()
    {
        return mUps;
    }

    public void setUps(String ups)
    {
        mUps = ups;
    }

}
