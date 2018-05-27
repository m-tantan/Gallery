
package yapps.gallery;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Data {

    @SerializedName("account_id")
    private Object mAccountId;
    @SerializedName("account_url")
    private Object mAccountUrl;
    @SerializedName("cover")
    private String mCover;
    @SerializedName("cover_height")
    private Long mCoverHeight;
    @SerializedName("cover_width")
    private Long mCoverWidth;
    @SerializedName("datetime")
    private Long mDatetime;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("favorite")
    private Boolean mFavorite;
    @SerializedName("id")
    private String mId;
    @SerializedName("images")
    private List<Image> mImages;
    @SerializedName("images_count")
    private Long mImagesCount;
    @SerializedName("in_gallery")
    private Boolean mInGallery;
    @SerializedName("include_album_ads")
    private Boolean mIncludeAlbumAds;
    @SerializedName("is_ad")
    private Boolean mIsAd;
    @SerializedName("layout")
    private String mLayout;
    @SerializedName("link")
    private String mLink;
    @SerializedName("nsfw")
    private Object mNsfw;
    @SerializedName("privacy")
    private String mPrivacy;
    @SerializedName("section")
    private Object mSection;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("views")
    private Long mViews;

    public Object getAccountId() {
        return mAccountId;
    }

    public void setAccountId(Object accountId) {
        mAccountId = accountId;
    }

    public Object getAccountUrl() {
        return mAccountUrl;
    }

    public void setAccountUrl(Object accountUrl) {
        mAccountUrl = accountUrl;
    }

    public String getCover() {
        return mCover;
    }

    public void setCover(String cover) {
        mCover = cover;
    }

    public Long getCoverHeight() {
        return mCoverHeight;
    }

    public void setCoverHeight(Long coverHeight) {
        mCoverHeight = coverHeight;
    }

    public Long getCoverWidth() {
        return mCoverWidth;
    }

    public void setCoverWidth(Long coverWidth) {
        mCoverWidth = coverWidth;
    }

    public Long getDatetime() {
        return mDatetime;
    }

    public void setDatetime(Long datetime) {
        mDatetime = datetime;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public Boolean getFavorite() {
        return mFavorite;
    }

    public void setFavorite(Boolean favorite) {
        mFavorite = favorite;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public List<Image> getImages() {
        return mImages;
    }

    public void setImages(List<Image> images) {
        mImages = images;
    }

    public Long getImagesCount() {
        return mImagesCount;
    }

    public void setImagesCount(Long imagesCount) {
        mImagesCount = imagesCount;
    }

    public Boolean getInGallery() {
        return mInGallery;
    }

    public void setInGallery(Boolean inGallery) {
        mInGallery = inGallery;
    }

    public Boolean getIncludeAlbumAds() {
        return mIncludeAlbumAds;
    }

    public void setIncludeAlbumAds(Boolean includeAlbumAds) {
        mIncludeAlbumAds = includeAlbumAds;
    }

    public Boolean getIsAd() {
        return mIsAd;
    }

    public void setIsAd(Boolean isAd) {
        mIsAd = isAd;
    }

    public String getLayout() {
        return mLayout;
    }

    public void setLayout(String layout) {
        mLayout = layout;
    }

    public String getLink() {
        return mLink;
    }

    public void setLink(String link) {
        mLink = link;
    }

    public Object getNsfw() {
        return mNsfw;
    }

    public void setNsfw(Object nsfw) {
        mNsfw = nsfw;
    }

    public String getPrivacy() {
        return mPrivacy;
    }

    public void setPrivacy(String privacy) {
        mPrivacy = privacy;
    }

    public Object getSection() {
        return mSection;
    }

    public void setSection(Object section) {
        mSection = section;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Long getViews() {
        return mViews;
    }

    public void setViews(Long views) {
        mViews = views;
    }

}
