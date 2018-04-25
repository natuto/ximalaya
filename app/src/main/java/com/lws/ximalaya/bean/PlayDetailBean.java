package com.lws.ximalaya.bean;

import java.util.List;

/**
 * song on 2018/4/18 09:27
 */
public class PlayDetailBean {

    /**
     * ret : 0
     * albumInfo : {"title":"全国新闻联播","vipFreeType":0}
     * trackInfo : {"albumId":11679841,"albumTitle":"全国新闻联播","categoryId":1,"categoryName":"头条","coverLarge":"http://fdfs.xmcdn.com/group35/M02/8B/82/wKgJnFoT4O2Td4RpAACbA2X4rUM930_mobile_large.jpg","coverMiddle":"http://fdfs.xmcdn.com/group35/M02/8B/82/wKgJnFoT4O2Td4RpAACbA2X4rUM930_web_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group35/M02/8B/82/wKgJnFoT4O2Td4RpAACbA2X4rUM930_web_meduim.jpg","createdAt":1523930692000,"downloadAacSize":329505,"downloadAacUrl":"http://download.xmcdn.com/group40/M01/C0/58/wKgJVFrVVgqBZd6vAAUHIVnsA2U952.m4a","downloadSize":425040,"downloadUrl":"http://download.xmcdn.com/group40/M01/BF/76/wKgJT1rVVgmTA0b7AAZ8UBrBBz0258.aac","duration":105,"intro":"最高人民检察院日前印发《中共最高人民检察院党组巡视工作规划（2018-2022年）》，16日对全国检察机关第一轮巡视作出部署。","isAuthorized":false,"isDraft":false,"isFree":false,"isLike":false,"isPaid":false,"isPublic":true,"isRichAudio":false,"isVideo":false,"isVipFree":false,"likes":4,"nickname":"中国之声","playPathAacv164":"http://audio.xmcdn.com/group40/M01/C0/58/wKgJVFrVVgqwHyzFAA0f9FKrweQ850.m4a","playPathAacv224":"http://audio.xmcdn.com/group40/M01/C0/58/wKgJVFrVVgqBZd6vAAUHIVnsA2U952.m4a","playPathHq":"","playUrl32":"http://fdfs.xmcdn.com/group40/M01/C0/58/wKgJVFrVVgqB-Y2FAAZ4gWFZ5t0067.mp3","playUrl64":"http://fdfs.xmcdn.com/group40/M01/BF/77/wKgJT1rVVgqgjW4fAAzw1PyoHcQ197.mp3","playtimes":1460,"priceTypeEnum":0,"priceTypeId":0,"priceTypes":[],"processState":2,"ret":0,"sampleDuration":0,"shortRichIntro":"<p data-flag=\"normal\" style=\"font-size:16px;color:#333333;line-height:30px;font-family:Helvetica,Arial,sans-serif;font-weight:normal;text-align:left;hyphens:auto\" lang=\"en\"><span>最高人民检察院日前印发《中共最高人民检察院党组巡视工作规划（2018-2022年）》，16日对全国检察机关第一轮巡视作出部署。<\/span><\/p>","status":1,"title":"最高检部署全国检察机关第一轮巡视","trackBlocks":[],"trackId":83097889,"type":2,"uid":19414524}
     * msg : 0
     */

    private int ret;
    private AlbumInfoBean albumInfo;
    private TrackInfoBean trackInfo;
    private String msg;

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public AlbumInfoBean getAlbumInfo() {
        return albumInfo;
    }

    public void setAlbumInfo(AlbumInfoBean albumInfo) {
        this.albumInfo = albumInfo;
    }

    public TrackInfoBean getTrackInfo() {
        return trackInfo;
    }

    public void setTrackInfo(TrackInfoBean trackInfo) {
        this.trackInfo = trackInfo;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static class AlbumInfoBean {
        /**
         * title : 全国新闻联播
         * vipFreeType : 0
         */

        private String title;
        private int vipFreeType;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getVipFreeType() {
            return vipFreeType;
        }

        public void setVipFreeType(int vipFreeType) {
            this.vipFreeType = vipFreeType;
        }
    }

    public static class TrackInfoBean {
        /**
         * albumId : 11679841
         * albumTitle : 全国新闻联播
         * categoryId : 1
         * categoryName : 头条
         * coverLarge : http://fdfs.xmcdn.com/group35/M02/8B/82/wKgJnFoT4O2Td4RpAACbA2X4rUM930_mobile_large.jpg
         * coverMiddle : http://fdfs.xmcdn.com/group35/M02/8B/82/wKgJnFoT4O2Td4RpAACbA2X4rUM930_web_large.jpg
         * coverSmall : http://fdfs.xmcdn.com/group35/M02/8B/82/wKgJnFoT4O2Td4RpAACbA2X4rUM930_web_meduim.jpg
         * createdAt : 1523930692000
         * downloadAacSize : 329505
         * downloadAacUrl : http://download.xmcdn.com/group40/M01/C0/58/wKgJVFrVVgqBZd6vAAUHIVnsA2U952.m4a
         * downloadSize : 425040
         * downloadUrl : http://download.xmcdn.com/group40/M01/BF/76/wKgJT1rVVgmTA0b7AAZ8UBrBBz0258.aac
         * duration : 105
         * intro : 最高人民检察院日前印发《中共最高人民检察院党组巡视工作规划（2018-2022年）》，16日对全国检察机关第一轮巡视作出部署。
         * isAuthorized : false
         * isDraft : false
         * isFree : false
         * isLike : false
         * isPaid : false
         * isPublic : true
         * isRichAudio : false
         * isVideo : false
         * isVipFree : false
         * likes : 4
         * nickname : 中国之声
         * playPathAacv164 : http://audio.xmcdn.com/group40/M01/C0/58/wKgJVFrVVgqwHyzFAA0f9FKrweQ850.m4a
         * playPathAacv224 : http://audio.xmcdn.com/group40/M01/C0/58/wKgJVFrVVgqBZd6vAAUHIVnsA2U952.m4a
         * playPathHq :
         * playUrl32 : http://fdfs.xmcdn.com/group40/M01/C0/58/wKgJVFrVVgqB-Y2FAAZ4gWFZ5t0067.mp3
         * playUrl64 : http://fdfs.xmcdn.com/group40/M01/BF/77/wKgJT1rVVgqgjW4fAAzw1PyoHcQ197.mp3
         * playtimes : 1460
         * priceTypeEnum : 0
         * priceTypeId : 0
         * priceTypes : []
         * processState : 2
         * ret : 0
         * sampleDuration : 0
         * shortRichIntro : <p data-flag="normal" style="font-size:16px;color:#333333;line-height:30px;font-family:Helvetica,Arial,sans-serif;font-weight:normal;text-align:left;hyphens:auto" lang="en"><span>最高人民检察院日前印发《中共最高人民检察院党组巡视工作规划（2018-2022年）》，16日对全国检察机关第一轮巡视作出部署。</span></p>
         * status : 1
         * title : 最高检部署全国检察机关第一轮巡视
         * trackBlocks : []
         * trackId : 83097889
         * type : 2
         * uid : 19414524
         */

        private int albumId;
        private String albumTitle;
        private int categoryId;
        private String categoryName;
        private String coverLarge;
        private String coverMiddle;
        private String coverSmall;
        private long createdAt;
        private int downloadAacSize;
        private String downloadAacUrl;
        private int downloadSize;
        private String downloadUrl;
        private int duration;
        private String intro;
        private boolean isAuthorized;
        private boolean isDraft;
        private boolean isFree;
        private boolean isLike;
        private boolean isPaid;
        private boolean isPublic;
        private boolean isRichAudio;
        private boolean isVideo;
        private boolean isVipFree;
        private int likes;
        private String nickname;
        private String playPathAacv164;
        private String playPathAacv224;
        private String playPathHq;
        private String playUrl32;
        private String playUrl64;
        private int playtimes;
        private int priceTypeEnum;
        private int priceTypeId;
        private int processState;
        private int ret;
        private int sampleDuration;
        private String shortRichIntro;
        private int status;
        private String title;
        private int trackId;
        private int type;
        private int uid;
        private List<?> priceTypes;
        private List<?> trackBlocks;

        public int getAlbumId() {
            return albumId;
        }

        public void setAlbumId(int albumId) {
            this.albumId = albumId;
        }

        public String getAlbumTitle() {
            return albumTitle;
        }

        public void setAlbumTitle(String albumTitle) {
            this.albumTitle = albumTitle;
        }

        public int getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(int categoryId) {
            this.categoryId = categoryId;
        }

        public String getCategoryName() {
            return categoryName;
        }

        public void setCategoryName(String categoryName) {
            this.categoryName = categoryName;
        }

        public String getCoverLarge() {
            return coverLarge;
        }

        public void setCoverLarge(String coverLarge) {
            this.coverLarge = coverLarge;
        }

        public String getCoverMiddle() {
            return coverMiddle;
        }

        public void setCoverMiddle(String coverMiddle) {
            this.coverMiddle = coverMiddle;
        }

        public String getCoverSmall() {
            return coverSmall;
        }

        public void setCoverSmall(String coverSmall) {
            this.coverSmall = coverSmall;
        }

        public long getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(long createdAt) {
            this.createdAt = createdAt;
        }

        public int getDownloadAacSize() {
            return downloadAacSize;
        }

        public void setDownloadAacSize(int downloadAacSize) {
            this.downloadAacSize = downloadAacSize;
        }

        public String getDownloadAacUrl() {
            return downloadAacUrl;
        }

        public void setDownloadAacUrl(String downloadAacUrl) {
            this.downloadAacUrl = downloadAacUrl;
        }

        public int getDownloadSize() {
            return downloadSize;
        }

        public void setDownloadSize(int downloadSize) {
            this.downloadSize = downloadSize;
        }

        public String getDownloadUrl() {
            return downloadUrl;
        }

        public void setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public String getIntro() {
            return intro;
        }

        public void setIntro(String intro) {
            this.intro = intro;
        }

        public boolean isIsAuthorized() {
            return isAuthorized;
        }

        public void setIsAuthorized(boolean isAuthorized) {
            this.isAuthorized = isAuthorized;
        }

        public boolean isIsDraft() {
            return isDraft;
        }

        public void setIsDraft(boolean isDraft) {
            this.isDraft = isDraft;
        }

        public boolean isIsFree() {
            return isFree;
        }

        public void setIsFree(boolean isFree) {
            this.isFree = isFree;
        }

        public boolean isIsLike() {
            return isLike;
        }

        public void setIsLike(boolean isLike) {
            this.isLike = isLike;
        }

        public boolean isIsPaid() {
            return isPaid;
        }

        public void setIsPaid(boolean isPaid) {
            this.isPaid = isPaid;
        }

        public boolean isIsPublic() {
            return isPublic;
        }

        public void setIsPublic(boolean isPublic) {
            this.isPublic = isPublic;
        }

        public boolean isIsRichAudio() {
            return isRichAudio;
        }

        public void setIsRichAudio(boolean isRichAudio) {
            this.isRichAudio = isRichAudio;
        }

        public boolean isIsVideo() {
            return isVideo;
        }

        public void setIsVideo(boolean isVideo) {
            this.isVideo = isVideo;
        }

        public boolean isIsVipFree() {
            return isVipFree;
        }

        public void setIsVipFree(boolean isVipFree) {
            this.isVipFree = isVipFree;
        }

        public int getLikes() {
            return likes;
        }

        public void setLikes(int likes) {
            this.likes = likes;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getPlayPathAacv164() {
            return playPathAacv164;
        }

        public void setPlayPathAacv164(String playPathAacv164) {
            this.playPathAacv164 = playPathAacv164;
        }

        public String getPlayPathAacv224() {
            return playPathAacv224;
        }

        public void setPlayPathAacv224(String playPathAacv224) {
            this.playPathAacv224 = playPathAacv224;
        }

        public String getPlayPathHq() {
            return playPathHq;
        }

        public void setPlayPathHq(String playPathHq) {
            this.playPathHq = playPathHq;
        }

        public String getPlayUrl32() {
            return playUrl32;
        }

        public void setPlayUrl32(String playUrl32) {
            this.playUrl32 = playUrl32;
        }

        public String getPlayUrl64() {
            return playUrl64;
        }

        public void setPlayUrl64(String playUrl64) {
            this.playUrl64 = playUrl64;
        }

        public int getPlaytimes() {
            return playtimes;
        }

        public void setPlaytimes(int playtimes) {
            this.playtimes = playtimes;
        }

        public int getPriceTypeEnum() {
            return priceTypeEnum;
        }

        public void setPriceTypeEnum(int priceTypeEnum) {
            this.priceTypeEnum = priceTypeEnum;
        }

        public int getPriceTypeId() {
            return priceTypeId;
        }

        public void setPriceTypeId(int priceTypeId) {
            this.priceTypeId = priceTypeId;
        }

        public int getProcessState() {
            return processState;
        }

        public void setProcessState(int processState) {
            this.processState = processState;
        }

        public int getRet() {
            return ret;
        }

        public void setRet(int ret) {
            this.ret = ret;
        }

        public int getSampleDuration() {
            return sampleDuration;
        }

        public void setSampleDuration(int sampleDuration) {
            this.sampleDuration = sampleDuration;
        }

        public String getShortRichIntro() {
            return shortRichIntro;
        }

        public void setShortRichIntro(String shortRichIntro) {
            this.shortRichIntro = shortRichIntro;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getTrackId() {
            return trackId;
        }

        public void setTrackId(int trackId) {
            this.trackId = trackId;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getUid() {
            return uid;
        }

        public void setUid(int uid) {
            this.uid = uid;
        }

        public List<?> getPriceTypes() {
            return priceTypes;
        }

        public void setPriceTypes(List<?> priceTypes) {
            this.priceTypes = priceTypes;
        }

        public List<?> getTrackBlocks() {
            return trackBlocks;
        }

        public void setTrackBlocks(List<?> trackBlocks) {
            this.trackBlocks = trackBlocks;
        }
    }
}
