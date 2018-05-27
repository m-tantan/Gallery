
package yapps.gallery;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Image {

    @SerializedName("account_id")
    private String mAccountId;
    @SerializedName("account_url")
    private String mAccountUrl;
    @SerializedName("adConfig")
    private AdConfig mAdConfig;
    @SerializedName("ad_type")
    private Long mAdType;
    @SerializedName("ad_url")
    private String mAdUrl;
    @SerializedName("album_cover")
    private String mAlbumCover;
    @SerializedName("album_cover_height")
    private Long mAlbumCoverHeight;
    @SerializedName("album_cover_width")
    private Long mAlbumCoverWidth;
    @SerializedName("album_images")
    private AlbumImages mAlbumImages;
    @SerializedName("album_layout")
    private String mAlbumLayout;
    @SerializedName("album_privacy")
    private String mAlbumPrivacy;
    @SerializedName("animated")
    private Boolean mAnimated;
    @SerializedName("bandwidth")
    private Object mBandwidth;
    @SerializedName("comment_count")
    private Long mCommentCount;
    @SerializedName("datetime")
    private String mDatetime;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("downs")
    private Long mDowns;
    @SerializedName("ext")
    private String mExt;
    @SerializedName("favorite_count")
    private Long mFavoriteCount;
    @SerializedName("favorited")
    private Boolean mFavorited;
    @SerializedName("gallery_datetime")
    private String mGalleryDatetime;
    @SerializedName("galleryTags")
    private List<GalleryTag> mGalleryTags;
    @SerializedName("has_sound")
    private Boolean mHasSound;
    @SerializedName("hash")
    private String mHash;
    @SerializedName("height")
    private Long mHeight;
    @SerializedName("hot_datetime")
    private String mHotDatetime;
    @SerializedName("id")
    private Long mId;
    @SerializedName("in_gallery")
    private Boolean mInGallery;
    @SerializedName("is_album")
    private Boolean mIsAlbum;
    @SerializedName("is_hot")
    private Boolean mIsHot;
    @SerializedName("looping")
    private Boolean mLooping;
    @SerializedName("meme_bottom")
    private Object mMemeBottom;
    @SerializedName("meme_name")
    private Object mMemeName;
    @SerializedName("meme_top")
    private Object mMemeTop;
    @SerializedName("mimetype")
    private Object mMimetype;
    @SerializedName("nsfw")
    private Boolean mNsfw;
    @SerializedName("num_images")
    private Long mNumImages;
    @SerializedName("pending")
    private String mPending;
    @SerializedName("platform")
    private String mPlatform;
    @SerializedName("points")
    private Long mPoints;
    @SerializedName("prefer_video")
    private Boolean mPreferVideo;
    @SerializedName("readonly")
    private Boolean mReadonly;
    @SerializedName("reddit")
    private String mReddit;
    @SerializedName("score")
    private Long mScore;
    @SerializedName("section")
    private String mSection;
    @SerializedName("size")
    private Long mSize;
    @SerializedName("spam")
    private String mSpam;
    @SerializedName("starting_score")
    private Long mStartingScore;
    @SerializedName("subtype")
    private String mSubtype;
    @SerializedName("tags")
    private List<String> mTags;
    @SerializedName("timestamp")
    private String mTimestamp;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("topic")
    private String mTopic;
    @SerializedName("topic_id")
    private Long mTopicId;
    @SerializedName("ups")
    private Long mUps;
    @SerializedName("video_host")
    private Object mVideoHost;
    @SerializedName("video_source")
    private Object mVideoSource;
    @SerializedName("views")
    private String mViews;
    @SerializedName("virality")
    private Double mVirality;
    @SerializedName("vote")
    private Object mVote;
    @SerializedName("weight")
    private Long mWeight;
    @SerializedName("width")
    private Long mWidth;

    public String getAccountId() {
        return mAccountId;
    }

    public void setAccountId(String accountId) {
        mAccountId = accountId;
    }

    public String getAccountUrl() {
        return mAccountUrl;
    }

    public void setAccountUrl(String accountUrl) {
        mAccountUrl = accountUrl;
    }

    public AdConfig getAdConfig() {
        return mAdConfig;
    }

    public void setAdConfig(AdConfig adConfig) {
        mAdConfig = adConfig;
    }

    public Long getAdType() {
        return mAdType;
    }

    public void setAdType(Long adType) {
        mAdType = adType;
    }

    public String getAdUrl() {
        return mAdUrl;
    }

    public void setAdUrl(String adUrl) {
        mAdUrl = adUrl;
    }

    public String getAlbumCover() {
        return mAlbumCover;
    }

    public void setAlbumCover(String albumCover) {
        mAlbumCover = albumCover;
    }

    public Long getAlbumCoverHeight() {
        return mAlbumCoverHeight;
    }

    public void setAlbumCoverHeight(Long albumCoverHeight) {
        mAlbumCoverHeight = albumCoverHeight;
    }

    public Long getAlbumCoverWidth() {
        return mAlbumCoverWidth;
    }

    public void setAlbumCoverWidth(Long albumCoverWidth) {
        mAlbumCoverWidth = albumCoverWidth;
    }

    public AlbumImages getAlbumImages() {
        return mAlbumImages;
    }

    public void setAlbumImages(AlbumImages albumImages) {
        mAlbumImages = albumImages;
    }

    public String getAlbumLayout() {
        return mAlbumLayout;
    }

    public void setAlbumLayout(String albumLayout) {
        mAlbumLayout = albumLayout;
    }

    public String getAlbumPrivacy() {
        return mAlbumPrivacy;
    }

    public void setAlbumPrivacy(String albumPrivacy) {
        mAlbumPrivacy = albumPrivacy;
    }

    public Boolean getAnimated() {
        return mAnimated;
    }

    public void setAnimated(Boolean animated) {
        mAnimated = animated;
    }

    public Object getBandwidth() {
        return mBandwidth;
    }

    public void setBandwidth(Object bandwidth) {
        mBandwidth = bandwidth;
    }

    public Long getCommentCount() {
        return mCommentCount;
    }

    public void setCommentCount(Long commentCount) {
        mCommentCount = commentCount;
    }

    public String getDatetime() {
        return mDatetime;
    }

    public void setDatetime(String datetime) {
        mDatetime = datetime;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public Long getDowns() {
        return mDowns;
    }

    public void setDowns(Long downs) {
        mDowns = downs;
    }

    public String getExt() {
        return mExt;
    }

    public void setExt(String ext) {
        mExt = ext;
    }

    public Long getFavoriteCount() {
        return mFavoriteCount;
    }

    public void setFavoriteCount(Long favoriteCount) {
        mFavoriteCount = favoriteCount;
    }

    public Boolean getFavorited() {
        return mFavorited;
    }

    public void setFavorited(Boolean favorited) {
        mFavorited = favorited;
    }

    public String getGalleryDatetime() {
        return mGalleryDatetime;
    }

    public void setGalleryDatetime(String galleryDatetime) {
        mGalleryDatetime = galleryDatetime;
    }

    public List<GalleryTag> getGalleryTags() {
        return mGalleryTags;
    }

    public void setGalleryTags(List<GalleryTag> galleryTags) {
        mGalleryTags = galleryTags;
    }

    public Boolean getHasSound() {
        return mHasSound;
    }

    public void setHasSound(Boolean hasSound) {
        mHasSound = hasSound;
    }

    public String getHash() {
        return mHash;
    }

    public void setHash(String hash) {
        mHash = hash;
    }

    public Long getHeight() {
        return mHeight;
    }

    public void setHeight(Long height) {
        mHeight = height;
    }

    public String getHotDatetime() {
        return mHotDatetime;
    }

    public void setHotDatetime(String hotDatetime) {
        mHotDatetime = hotDatetime;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public Boolean getInGallery() {
        return mInGallery;
    }

    public void setInGallery(Boolean inGallery) {
        mInGallery = inGallery;
    }

    public Boolean getIsAlbum() {
        return mIsAlbum;
    }

    public void setIsAlbum(Boolean isAlbum) {
        mIsAlbum = isAlbum;
    }

    public Boolean getIsHot() {
        return mIsHot;
    }

    public void setIsHot(Boolean isHot) {
        mIsHot = isHot;
    }

    public Boolean getLooping() {
        return mLooping;
    }

    public void setLooping(Boolean looping) {
        mLooping = looping;
    }

    public Object getMemeBottom() {
        return mMemeBottom;
    }

    public void setMemeBottom(Object memeBottom) {
        mMemeBottom = memeBottom;
    }

    public Object getMemeName() {
        return mMemeName;
    }

    public void setMemeName(Object memeName) {
        mMemeName = memeName;
    }

    public Object getMemeTop() {
        return mMemeTop;
    }

    public void setMemeTop(Object memeTop) {
        mMemeTop = memeTop;
    }

    public Object getMimetype() {
        return mMimetype;
    }

    public void setMimetype(Object mimetype) {
        mMimetype = mimetype;
    }

    public Boolean getNsfw() {
        return mNsfw;
    }

    public void setNsfw(Boolean nsfw) {
        mNsfw = nsfw;
    }

    public Long getNumImages() {
        return mNumImages;
    }

    public void setNumImages(Long numImages) {
        mNumImages = numImages;
    }

    public String getPending() {
        return mPending;
    }

    public void setPending(String pending) {
        mPending = pending;
    }

    public String getPlatform() {
        return mPlatform;
    }

    public void setPlatform(String platform) {
        mPlatform = platform;
    }

    public Long getPoints() {
        return mPoints;
    }

    public void setPoints(Long points) {
        mPoints = points;
    }

    public Boolean getPreferVideo() {
        return mPreferVideo;
    }

    public void setPreferVideo(Boolean preferVideo) {
        mPreferVideo = preferVideo;
    }

    public Boolean getReadonly() {
        return mReadonly;
    }

    public void setReadonly(Boolean readonly) {
        mReadonly = readonly;
    }

    public String getReddit() {
        return mReddit;
    }

    public void setReddit(String reddit) {
        mReddit = reddit;
    }

    public Long getScore() {
        return mScore;
    }

    public void setScore(Long score) {
        mScore = score;
    }

    public String getSection() {
        return mSection;
    }

    public void setSection(String section) {
        mSection = section;
    }

    public Long getSize() {
        return mSize;
    }

    public void setSize(Long size) {
        mSize = size;
    }

    public String getSpam() {
        return mSpam;
    }

    public void setSpam(String spam) {
        mSpam = spam;
    }

    public Long getStartingScore() {
        return mStartingScore;
    }

    public void setStartingScore(Long startingScore) {
        mStartingScore = startingScore;
    }

    public String getSubtype() {
        return mSubtype;
    }

    public void setSubtype(String subtype) {
        mSubtype = subtype;
    }

    public List<String> getTags() {
        return mTags;
    }

    public void setTags(List<String> tags) {
        mTags = tags;
    }

    public String getTimestamp() {
        return mTimestamp;
    }

    public void setTimestamp(String timestamp) {
        mTimestamp = timestamp;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getTopic() {
        return mTopic;
    }

    public void setTopic(String topic) {
        mTopic = topic;
    }

    public Long getTopicId() {
        return mTopicId;
    }

    public void setTopicId(Long topicId) {
        mTopicId = topicId;
    }

    public Long getUps() {
        return mUps;
    }

    public void setUps(Long ups) {
        mUps = ups;
    }

    public Object getVideoHost() {
        return mVideoHost;
    }

    public void setVideoHost(Object videoHost) {
        mVideoHost = videoHost;
    }

    public Object getVideoSource() {
        return mVideoSource;
    }

    public void setVideoSource(Object videoSource) {
        mVideoSource = videoSource;
    }

    public String getViews() {
        return mViews;
    }

    public void setViews(String views) {
        mViews = views;
    }

    public Double getVirality() {
        return mVirality;
    }

    public void setVirality(Double virality) {
        mVirality = virality;
    }

    public Object getVote() {
        return mVote;
    }

    public void setVote(Object vote) {
        mVote = vote;
    }

    public Long getWeight() {
        return mWeight;
    }

    public void setWeight(Long weight) {
        mWeight = weight;
    }

    public Long getWidth() {
        return mWidth;
    }

    public void setWidth(Long width) {
        mWidth = width;
    }

}
