package com.lws.ximalaya.bean;

import java.util.List;

/**
 * song on 2018/4/12 22:08
 */
public class GatherBean {


    private int ret;
    private DataBean data;
    private String msg;

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static class DataBean {
        @Override
        public String toString() {
            return "DataBean{" +
                    "album=" + album +
                    ", user=" + user +
                    ", tracks=" + tracks +
                    ", showFeedButton=" + showFeedButton +
                    ", giftAlbum='" + giftAlbum + '\'' +
                    ", isOfflineHidden=" + isOfflineHidden +
                    ", viewTab='" + viewTab + '\'' +
                    ", hasGroupInfo=" + hasGroupInfo +
                    ", loginUser=" + loginUser +
                    ", isShowCommunity=" + isShowCommunity +
                    '}';
        }


        private AlbumBean album;
        private UserBean user;
        private TracksBean tracks;
        private boolean showFeedButton;
        private String giftAlbum;
        private boolean isOfflineHidden;
        private String viewTab;
        private boolean hasGroupInfo;
        private LoginUserBean loginUser;
        private boolean isShowCommunity;

        public AlbumBean getAlbum() {
            return album;
        }

        public void setAlbum(AlbumBean album) {
            this.album = album;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public TracksBean getTracks() {
            return tracks;
        }

        public void setTracks(TracksBean tracks) {
            this.tracks = tracks;
        }

        public boolean isShowFeedButton() {
            return showFeedButton;
        }

        public void setShowFeedButton(boolean showFeedButton) {
            this.showFeedButton = showFeedButton;
        }

        public String getGiftAlbum() {
            return giftAlbum;
        }

        public void setGiftAlbum(String giftAlbum) {
            this.giftAlbum = giftAlbum;
        }

        public boolean isIsOfflineHidden() {
            return isOfflineHidden;
        }

        public void setIsOfflineHidden(boolean isOfflineHidden) {
            this.isOfflineHidden = isOfflineHidden;
        }

        public String getViewTab() {
            return viewTab;
        }

        public void setViewTab(String viewTab) {
            this.viewTab = viewTab;
        }

        public boolean isHasGroupInfo() {
            return hasGroupInfo;
        }

        public void setHasGroupInfo(boolean hasGroupInfo) {
            this.hasGroupInfo = hasGroupInfo;
        }

        public LoginUserBean getLoginUser() {
            return loginUser;
        }

        public void setLoginUser(LoginUserBean loginUser) {
            this.loginUser = loginUser;
        }

        public boolean isIsShowCommunity() {
            return isShowCommunity;
        }

        public void setIsShowCommunity(boolean isShowCommunity) {
            this.isShowCommunity = isShowCommunity;
        }

        public static class AlbumBean {
            /**
             * albumId : 11679871
             * categoryId : 1
             * categoryName : 头条
             * title : 国防时空
             * coverOrigin : http://fdfs.xmcdn.com/group35/M03/41/FE/wKgJnVoT4bjjzhYhAAFS-Qrj-vo146.jpg
             * coverSmall : http://fdfs.xmcdn.com/group35/M03/41/FE/wKgJnVoT4bjjzhYhAAFS-Qrj-vo146_mobile_small.jpg
             * coverMiddle : http://fdfs.xmcdn.com/group35/M03/41/FE/wKgJnVoT4bjjzhYhAAFS-Qrj-vo146_mobile_meduim.jpg
             * coverLarge : http://fdfs.xmcdn.com/group35/M03/41/FE/wKgJnVoT4bjjzhYhAAFS-Qrj-vo146_mobile_large.jpg
             * coverWebLarge : http://fdfs.xmcdn.com/group35/M03/41/FE/wKgJnVoT4bjjzhYhAAFS-Qrj-vo146_web_large.jpg
             * coverLargePop : http://fdfs.xmcdn.com/group35/M03/41/FE/wKgJnVoT4bjjzhYhAAFS-Qrj-vo146_large_pop.jpg
             * createdAt : 1511252420000
             * updatedAt : 1523513336000
             * uid : 19414524
             * nickname : 中国之声
             * isVerified : true
             * avatarPath : http://fdfs.xmcdn.com/group13/M07/59/FB/wKgDXVXFvXGDMYFiAARC-rTi9oE734_mobile_small.png
             * intro : 中央电视台第七套军事节目《国防时空》栏目面向全国军民和社会各界，以专题、谈话、体验和知识竞赛为主的节目形式，传播国防知识，普及国防教育，宣传国防政策，弘扬国防精神。
             * hasRecs : true
             * isNoCopyright : false
             * saleScope : 0
             * shareSupportType : 0
             * shortIntro : 中央电视台第七套军事节目《国防时空》栏目面向全国军民和社会各界，以专题、谈话...
             * introRich : <p style="font-size:16px;color:#333333;line-height:30px;font-family:Helvetica,Arial,sans-serif;font-weight:normal;text-align:left;hyphens:auto" data-flag="normal" lang="en"><span>中央电视台第七套军事节目《国防时空》栏目面向全国军民和社会各界，以专题、谈话、体验和知识竞赛为主的节目形式，传播国防知识，普及国防教育，宣传国防政策，弘扬国防精神。</span></p>
             * shortIntroRich : <p style="font-size:16px;color:#333333;line-height:30px;font-family:Helvetica,Arial,sans-serif;font-weight:normal;text-align:left;hyphens:auto" data-flag="normal" lang="en"><span>中央电视台第七套军事节目《国防时空》栏目面向全国军民和社会各界，以专题、谈话、体验和知识竞赛为主的节目形式，传播国防知识，普及国防教育，宣传国防政策，弘扬国防精神。</span></p>
             * tags : 滚动头条
             * tracks : 1062
             * shares : 0
             * outline :
             * subscribeCount : 2240
             * hasNew : false
             * isFavorite : false
             * playTimes : 1108093
             * lastUptrackAt : 1523513119000
             * lastUptrackId : 82064853
             * lastUptrackTitle : 联合国报告：利比亚有数千人被武装组织非法关押
             * lastUptrackCoverPath : group35/M03/42/00/wKgJnVoT4cPzLAFOAAFS-Qrj-vo745.jpg
             * status : 1
             * serializeStatus : 0
             * serialState : 0
             * isPublic : true
             * playTrackId : 82064853
             * autoStart : false
             * isRecordDesc : true
             * isPaid : false
             * refundSupportType : 0
             * canShareAndStealListen : false
             * canInviteListen : false
             * other_title : 其他说明
             * detailCoverPath : http://fdfs.xmcdn.com/group35/M03/41/FE/wKgJnVoT4bjjzhYhAAFS-Qrj-vo146_large_pop.jpg
             * isVip : false
             * isDraft : false
             * vipFreeType : 0
             * isDefault : false
             * is_default : false
             * offlineType : 0
             * offlineReason : 0
             * unReadAlbumCommentCount : 0
             * customSubTitle : 时事新闻加军事热点
             */

            private int albumId;
            private int categoryId;
            private String categoryName;
            private String title;
            private String coverOrigin;
            private String coverSmall;
            private String coverMiddle;
            private String coverLarge;
            private String coverWebLarge;
            private String coverLargePop;
            private long createdAt;
            private long updatedAt;
            private int uid;
            private String nickname;
            private boolean isVerified;
            private String avatarPath;
            private String intro;
            private boolean hasRecs;
            private boolean isNoCopyright;
            private int saleScope;
            private int shareSupportType;
            private String shortIntro;
            private String introRich;
            private String shortIntroRich;
            private String tags;
            private int tracks;
            private int shares;
            private String outline;
            private int subscribeCount;
            private boolean hasNew;
            private boolean isFavorite;
            private int playTimes;
            private long lastUptrackAt;
            private int lastUptrackId;
            private String lastUptrackTitle;
            private String lastUptrackCoverPath;
            private int status;
            private int serializeStatus;
            private int serialState;
            private boolean isPublic;
            private int playTrackId;
            private boolean autoStart;
            private boolean isRecordDesc;
            private boolean isPaid;
            private int refundSupportType;
            private boolean canShareAndStealListen;
            private boolean canInviteListen;
            private String other_title;
            private String detailCoverPath;
            private boolean isVip;
            private boolean isDraft;
            private int vipFreeType;
            private boolean isDefault;
            private boolean is_default;
            private int offlineType;
            private int offlineReason;
            private int unReadAlbumCommentCount;
            private String customSubTitle;

            public int getAlbumId() {
                return albumId;
            }

            public void setAlbumId(int albumId) {
                this.albumId = albumId;
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

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getCoverOrigin() {
                return coverOrigin;
            }

            public void setCoverOrigin(String coverOrigin) {
                this.coverOrigin = coverOrigin;
            }

            public String getCoverSmall() {
                return coverSmall;
            }

            public void setCoverSmall(String coverSmall) {
                this.coverSmall = coverSmall;
            }

            public String getCoverMiddle() {
                return coverMiddle;
            }

            public void setCoverMiddle(String coverMiddle) {
                this.coverMiddle = coverMiddle;
            }

            public String getCoverLarge() {
                return coverLarge;
            }

            public void setCoverLarge(String coverLarge) {
                this.coverLarge = coverLarge;
            }

            public String getCoverWebLarge() {
                return coverWebLarge;
            }

            public void setCoverWebLarge(String coverWebLarge) {
                this.coverWebLarge = coverWebLarge;
            }

            public String getCoverLargePop() {
                return coverLargePop;
            }

            public void setCoverLargePop(String coverLargePop) {
                this.coverLargePop = coverLargePop;
            }

            public long getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(long createdAt) {
                this.createdAt = createdAt;
            }

            public long getUpdatedAt() {
                return updatedAt;
            }

            public void setUpdatedAt(long updatedAt) {
                this.updatedAt = updatedAt;
            }

            public int getUid() {
                return uid;
            }

            public void setUid(int uid) {
                this.uid = uid;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public boolean isIsVerified() {
                return isVerified;
            }

            public void setIsVerified(boolean isVerified) {
                this.isVerified = isVerified;
            }

            public String getAvatarPath() {
                return avatarPath;
            }

            public void setAvatarPath(String avatarPath) {
                this.avatarPath = avatarPath;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public boolean isHasRecs() {
                return hasRecs;
            }

            public void setHasRecs(boolean hasRecs) {
                this.hasRecs = hasRecs;
            }

            public boolean isIsNoCopyright() {
                return isNoCopyright;
            }

            public void setIsNoCopyright(boolean isNoCopyright) {
                this.isNoCopyright = isNoCopyright;
            }

            public int getSaleScope() {
                return saleScope;
            }

            public void setSaleScope(int saleScope) {
                this.saleScope = saleScope;
            }

            public int getShareSupportType() {
                return shareSupportType;
            }

            public void setShareSupportType(int shareSupportType) {
                this.shareSupportType = shareSupportType;
            }

            public String getShortIntro() {
                return shortIntro;
            }

            public void setShortIntro(String shortIntro) {
                this.shortIntro = shortIntro;
            }

            public String getIntroRich() {
                return introRich;
            }

            public void setIntroRich(String introRich) {
                this.introRich = introRich;
            }

            public String getShortIntroRich() {
                return shortIntroRich;
            }

            public void setShortIntroRich(String shortIntroRich) {
                this.shortIntroRich = shortIntroRich;
            }

            public String getTags() {
                return tags;
            }

            public void setTags(String tags) {
                this.tags = tags;
            }

            public int getTracks() {
                return tracks;
            }

            public void setTracks(int tracks) {
                this.tracks = tracks;
            }

            public int getShares() {
                return shares;
            }

            public void setShares(int shares) {
                this.shares = shares;
            }

            public String getOutline() {
                return outline;
            }

            public void setOutline(String outline) {
                this.outline = outline;
            }

            public int getSubscribeCount() {
                return subscribeCount;
            }

            public void setSubscribeCount(int subscribeCount) {
                this.subscribeCount = subscribeCount;
            }

            public boolean isHasNew() {
                return hasNew;
            }

            public void setHasNew(boolean hasNew) {
                this.hasNew = hasNew;
            }

            public boolean isIsFavorite() {
                return isFavorite;
            }

            public void setIsFavorite(boolean isFavorite) {
                this.isFavorite = isFavorite;
            }

            public int getPlayTimes() {
                return playTimes;
            }

            public void setPlayTimes(int playTimes) {
                this.playTimes = playTimes;
            }

            public long getLastUptrackAt() {
                return lastUptrackAt;
            }

            public void setLastUptrackAt(long lastUptrackAt) {
                this.lastUptrackAt = lastUptrackAt;
            }

            public int getLastUptrackId() {
                return lastUptrackId;
            }

            public void setLastUptrackId(int lastUptrackId) {
                this.lastUptrackId = lastUptrackId;
            }

            public String getLastUptrackTitle() {
                return lastUptrackTitle;
            }

            public void setLastUptrackTitle(String lastUptrackTitle) {
                this.lastUptrackTitle = lastUptrackTitle;
            }

            public String getLastUptrackCoverPath() {
                return lastUptrackCoverPath;
            }

            public void setLastUptrackCoverPath(String lastUptrackCoverPath) {
                this.lastUptrackCoverPath = lastUptrackCoverPath;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public int getSerializeStatus() {
                return serializeStatus;
            }

            public void setSerializeStatus(int serializeStatus) {
                this.serializeStatus = serializeStatus;
            }

            public int getSerialState() {
                return serialState;
            }

            public void setSerialState(int serialState) {
                this.serialState = serialState;
            }

            public boolean isIsPublic() {
                return isPublic;
            }

            public void setIsPublic(boolean isPublic) {
                this.isPublic = isPublic;
            }

            public int getPlayTrackId() {
                return playTrackId;
            }

            public void setPlayTrackId(int playTrackId) {
                this.playTrackId = playTrackId;
            }

            public boolean isAutoStart() {
                return autoStart;
            }

            public void setAutoStart(boolean autoStart) {
                this.autoStart = autoStart;
            }

            public boolean isIsRecordDesc() {
                return isRecordDesc;
            }

            public void setIsRecordDesc(boolean isRecordDesc) {
                this.isRecordDesc = isRecordDesc;
            }

            public boolean isIsPaid() {
                return isPaid;
            }

            public void setIsPaid(boolean isPaid) {
                this.isPaid = isPaid;
            }

            public int getRefundSupportType() {
                return refundSupportType;
            }

            public void setRefundSupportType(int refundSupportType) {
                this.refundSupportType = refundSupportType;
            }

            public boolean isCanShareAndStealListen() {
                return canShareAndStealListen;
            }

            public void setCanShareAndStealListen(boolean canShareAndStealListen) {
                this.canShareAndStealListen = canShareAndStealListen;
            }

            public boolean isCanInviteListen() {
                return canInviteListen;
            }

            public void setCanInviteListen(boolean canInviteListen) {
                this.canInviteListen = canInviteListen;
            }

            public String getOther_title() {
                return other_title;
            }

            public void setOther_title(String other_title) {
                this.other_title = other_title;
            }

            public String getDetailCoverPath() {
                return detailCoverPath;
            }

            public void setDetailCoverPath(String detailCoverPath) {
                this.detailCoverPath = detailCoverPath;
            }

            public boolean isIsVip() {
                return isVip;
            }

            public void setIsVip(boolean isVip) {
                this.isVip = isVip;
            }

            public boolean isIsDraft() {
                return isDraft;
            }

            public void setIsDraft(boolean isDraft) {
                this.isDraft = isDraft;
            }

            public int getVipFreeType() {
                return vipFreeType;
            }

            public void setVipFreeType(int vipFreeType) {
                this.vipFreeType = vipFreeType;
            }

            public boolean isIsDefault() {
                return isDefault;
            }

            public void setIsDefault(boolean isDefault) {
                this.isDefault = isDefault;
            }

            public boolean isIs_default() {
                return is_default;
            }

            public void setIs_default(boolean is_default) {
                this.is_default = is_default;
            }

            public int getOfflineType() {
                return offlineType;
            }

            public void setOfflineType(int offlineType) {
                this.offlineType = offlineType;
            }

            public int getOfflineReason() {
                return offlineReason;
            }

            public void setOfflineReason(int offlineReason) {
                this.offlineReason = offlineReason;
            }

            public int getUnReadAlbumCommentCount() {
                return unReadAlbumCommentCount;
            }

            public void setUnReadAlbumCommentCount(int unReadAlbumCommentCount) {
                this.unReadAlbumCommentCount = unReadAlbumCommentCount;
            }

            public String getCustomSubTitle() {
                return customSubTitle;
            }

            public void setCustomSubTitle(String customSubTitle) {
                this.customSubTitle = customSubTitle;
            }
        }

        public static class UserBean {
            /**
             * uid : 19414524
             * nickname : 中国之声
             * isVerified : true
             * smallLogo : http://fdfs.xmcdn.com/group13/M07/59/FB/wKgDXVXFvXGDMYFiAARC-rTi9oE734_mobile_small.png
             * isFollowed : false
             * followers : 262245
             * followings : 11
             * tracks : 11170
             * albums : 16
             * ptitle : 中国之声官方电台
             * personDescribe : 中国之声独家新闻.
             * personalSignature : 中国之声独家新闻,中国之声在线收听,包含有新闻和报纸摘要,新闻纵横,新闻晚高峰,全国新闻联播,小喇叭,千里共良宵等中国之声在线收听节目,权威,迅速,独家的新闻报道...
             * anchorGrade : 12
             * verifyType : 1
             * liveStatus : 0
             * liveRoomId : 61687
             */

            private int uid;
            private String nickname;
            private boolean isVerified;
            private String smallLogo;
            private boolean isFollowed;
            private int followers;
            private int followings;
            private int tracks;
            private int albums;
            private String ptitle;
            private String personDescribe;
            private String personalSignature;
            private int anchorGrade;
            private int verifyType;
            private int liveStatus;
            private int liveRoomId;

            public int getUid() {
                return uid;
            }

            public void setUid(int uid) {
                this.uid = uid;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public boolean isIsVerified() {
                return isVerified;
            }

            public void setIsVerified(boolean isVerified) {
                this.isVerified = isVerified;
            }

            public String getSmallLogo() {
                return smallLogo;
            }

            public void setSmallLogo(String smallLogo) {
                this.smallLogo = smallLogo;
            }

            public boolean isIsFollowed() {
                return isFollowed;
            }

            public void setIsFollowed(boolean isFollowed) {
                this.isFollowed = isFollowed;
            }

            public int getFollowers() {
                return followers;
            }

            public void setFollowers(int followers) {
                this.followers = followers;
            }

            public int getFollowings() {
                return followings;
            }

            public void setFollowings(int followings) {
                this.followings = followings;
            }

            public int getTracks() {
                return tracks;
            }

            public void setTracks(int tracks) {
                this.tracks = tracks;
            }

            public int getAlbums() {
                return albums;
            }

            public void setAlbums(int albums) {
                this.albums = albums;
            }

            public String getPtitle() {
                return ptitle;
            }

            public void setPtitle(String ptitle) {
                this.ptitle = ptitle;
            }

            public String getPersonDescribe() {
                return personDescribe;
            }

            public void setPersonDescribe(String personDescribe) {
                this.personDescribe = personDescribe;
            }

            public String getPersonalSignature() {
                return personalSignature;
            }

            public void setPersonalSignature(String personalSignature) {
                this.personalSignature = personalSignature;
            }

            public int getAnchorGrade() {
                return anchorGrade;
            }

            public void setAnchorGrade(int anchorGrade) {
                this.anchorGrade = anchorGrade;
            }

            public int getVerifyType() {
                return verifyType;
            }

            public void setVerifyType(int verifyType) {
                this.verifyType = verifyType;
            }

            public int getLiveStatus() {
                return liveStatus;
            }

            public void setLiveStatus(int liveStatus) {
                this.liveStatus = liveStatus;
            }

            public int getLiveRoomId() {
                return liveRoomId;
            }

            public void setLiveRoomId(int liveRoomId) {
                this.liveRoomId = liveRoomId;
            }
        }

        public static class TracksBean {
            private int pageId;
            private int pageSize;
            private int maxPageId;
            private int totalCount;
            private List<GarhetMoreBean.DataBean.ListBean> list;

            public int getPageId() {
                return pageId;
            }

            public void setPageId(int pageId) {
                this.pageId = pageId;
            }

            public int getPageSize() {
                return pageSize;
            }

            public void setPageSize(int pageSize) {
                this.pageSize = pageSize;
            }

            public int getMaxPageId() {
                return maxPageId;
            }

            public void setMaxPageId(int maxPageId) {
                this.maxPageId = maxPageId;
            }

            public int getTotalCount() {
                return totalCount;
            }

            public void setTotalCount(int totalCount) {
                this.totalCount = totalCount;
            }

            public List<GarhetMoreBean.DataBean.ListBean> getList() {
                return list;
            }

            public void setList(List<GarhetMoreBean.DataBean.ListBean> list) {
                this.list = list;
            }


        }


        public static class LoginUserBean {
        }
    }
}
