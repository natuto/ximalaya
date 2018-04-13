package com.lws.ximalaya.bean;

import java.util.List;
import java.util.logging.Logger;

/**
 * song on 2018/4/8 03:09
 */
public class Ximalayabaen {



    private String code;
    private String msg;
    private int ret;
    private List<ListBeanX> list;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public List<ListBeanX> getList() {
        return list;
    }

    public void setList(List<ListBeanX> list) {
        this.list = list;
    }

    public static class ListBeanX {


        private boolean bottomHasMore;
        private boolean hasMore;
        private int loopCount;
        private String moduleType;
        private boolean showInterestCard;
        private TargetBean target;
        private String title;
        private int categoryId;
        private String direction;
        private List<ListBean> list;
        private List<KeywordsBean> keywords;

        public boolean isBottomHasMore() {
            return bottomHasMore;
        }

        public void setBottomHasMore(boolean bottomHasMore) {
            this.bottomHasMore = bottomHasMore;
        }

        public boolean isHasMore() {
            return hasMore;
        }

        public void setHasMore(boolean hasMore) {
            this.hasMore = hasMore;
        }

        public int getLoopCount() {
            return loopCount;
        }

        public void setLoopCount(int loopCount) {
            this.loopCount = loopCount;
        }

        public String getModuleType() {
            return moduleType;
        }

        public void setModuleType(String moduleType) {
            this.moduleType = moduleType;
        }

        public boolean isShowInterestCard() {
            return showInterestCard;
        }

        public void setShowInterestCard(boolean showInterestCard) {
            this.showInterestCard = showInterestCard;
        }

        public TargetBean getTarget() {
            return target;
        }

        public void setTarget(TargetBean target) {
            this.target = target;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(int categoryId) {
            this.categoryId = categoryId;
        }

        public String getDirection() {
            return direction;
        }

        public void setDirection(String direction) {
            this.direction = direction;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public List<KeywordsBean> getKeywords() {
            return keywords;
        }

        public void setKeywords(List<KeywordsBean> keywords) {
            this.keywords = keywords;
        }

        public static class TargetBean {
            /**
             * groupId : 1
             */

            private int groupId;

            public int getGroupId() {
                return groupId;
            }

            public void setGroupId(int groupId) {
                this.groupId = groupId;
            }
        }

        public static class ListBean {
            private int albumId;
            private int categoryId;
            private String infoType;
            private int isFinished;
            private boolean isDaft;
            private boolean isPaid;
            private boolean  isVipFree;
            private long lastUptrackAt;
            private String materialType;
            private String pic;
            private int playsCount;
            private String recSrc;
            private String recTrack;
            private int refundSupportType;


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

            public String getInfoType() {
                return infoType;
            }

            public void setInfoType(String infoType) {
                this.infoType = infoType;
            }

            public int getIsFinished() {
                return isFinished;
            }

            public void setIsFinished(int isFinished) {
                this.isFinished = isFinished;
            }

            public boolean isDaft() {
                return isDaft;
            }

            public void setDaft(boolean daft) {
                isDaft = daft;
            }

            public boolean isPaid() {
                return isPaid;
            }

            public void setPaid(boolean paid) {
                isPaid = paid;
            }

            public boolean isVipFree() {
                return isVipFree;
            }

            public void setVipFree(boolean vipFree) {
                isVipFree = vipFree;
            }

            public long getLastUptrackAt() {
                return lastUptrackAt;
            }

            public void setLastUptrackAt(long lastUptrackAt) {
                this.lastUptrackAt = lastUptrackAt;
            }

            public String getMaterialType() {
                return materialType;
            }

            public void setMaterialType(String materialType) {
                this.materialType = materialType;
            }

            public String getPic() {
                return pic;
            }

            public void setPic(String pic) {
                this.pic = pic;
            }

            public int getPlayCount() {
                return playsCount;
            }

            public void setPlayCount(int playsCount) {
                this.playsCount = playsCount;
            }

            public String getRecSrc() {
                return recSrc;
            }

            public void setRecSrc(String recSrc) {
                this.recSrc = recSrc;
            }

            public String getRecTrack() {
                return recTrack;
            }

            public void setRecTrack(String recTrack) {
                this.recTrack = recTrack;
            }

            public int getRefundSupportType() {
                return refundSupportType;
            }

            public void setRefundSupportType(int refundSupportType) {
                this.refundSupportType = refundSupportType;
            }

            public int getTracksCount() {
                return tracksCount;
            }

            public void setTracksCount(int tracksCount) {
                this.tracksCount = tracksCount;
            }

            public int getVipFreeType() {
                return vipFreeType;
            }

            public void setVipFreeType(int vipFreeType) {
                this.vipFreeType = vipFreeType;
            }

            private int tracksCount;
            private int vipFreeType;





            private String contentType;
            private int  contentUpdataAt;
            private String coverPath;
            private String displayClass;
            private boolean enableShare;
            private int id;
            private boolean isExternalUrl;
            private boolean isHot;
            private int orderNum;
            private String sharePic;
            private  String subtitle;
            private String title;

            public String getContentType() {
                return contentType;
            }

            public void setContentType(String contentType) {
                this.contentType = contentType;
            }

            public int getContentUpdataAt() {
                return contentUpdataAt;
            }

            public void setContentUpdataAt(int contentUpdataAt) {
                this.contentUpdataAt = contentUpdataAt;
            }

            public String getCoverPath() {
                return coverPath;
            }

            public void setCoverPath(String coverPath) {
                this.coverPath = coverPath;
            }

            public String getDisplayClass() {
                return displayClass;
            }

            public void setDisplayClass(String displayClass) {
                this.displayClass = displayClass;
            }

            public boolean isEnableShare() {
                return enableShare;
            }

            public void setEnableShare(boolean enableShare) {
                this.enableShare = enableShare;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public boolean isExternalUrl() {
                return isExternalUrl;
            }

            public void setExternalUrl(boolean externalUrl) {
                isExternalUrl = externalUrl;
            }

            public boolean isHot() {
                return isHot;
            }

            public void setHot(boolean hot) {
                isHot = hot;
            }

            public int getOrderNum() {
                return orderNum;
            }

            public void setOrderNum(int orderNum) {
                this.orderNum = orderNum;
            }

            public String getSharePic() {
                return sharePic;
            }

            public void setSharePic(String sharePic) {
                this.sharePic = sharePic;
            }

            public String getSubtitle() {
                return subtitle;
            }

            public void setSubtitle(String subtitle) {
                this.subtitle = subtitle;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            private String url;
            private long responseId;
            private int ret;
            private List<DataBean> data;

            public long getResponseId() {
                return responseId;
            }

            public void setResponseId(long responseId) {
                this.responseId = responseId;
            }

            public int getRet() {
                return ret;
            }

            public void setRet(int ret) {
                this.ret = ret;
            }

            public List<DataBean> getData() {
                return data;
            }

            public void setData(List<DataBean> data) {
                this.data = data;
            }

            public static class DataBean {
                /**
                 * adId : 56880
                 * adType : 0
                 * buttonShowed : false
                 * clickAction : -1
                 * clickTokens : ["6wQVRMCwKRKmyrly7FTlgJzPPRnvFDjOTPEmmEK6gnPbu5/p8tPTzZDH5H+l3t+0","x5GJAsBF2E++r3jZmrDZG+5NbQn7vCHS5EBzjf+/QNTbu5/p8tPTzZDH5H+l3t+0","SiVcHbAR0k5JlOrFuDzrKjsr+xbbgCDBzP6luPfyQeDbu5/p8tPTzZDH5H+l3t+0"]
                 * clickType : 1
                 * cover : http://fdfs.xmcdn.com/group41/M0A/11/95/wKgJ8lrJjcGAmb1QAAJQOZocJQQ338.jpg
                 * description :
                 * displayType : 1
                 * isAd : false
                 * isInternal : 1
                 * isLandScape : false
                 * isShareFlag : false
                 * link : http://ad.ximalaya.com/adrecord?sdn=H4sIAAAAAAAAAKtWykhNTEktUrLKK83J0VFKzs_PzkyF8QoSixJzU0tSi4qVrKqVElM8S1JzPVOUrJRMzSwsDJRqawGLrsOnPwAAAA&ad=56880
                 * name :
                 * openlinkType : 0
                 * realLink : iting://open?msg_type=13&album_id=14604271
                 * showTokens : ["y3nE/7LbioSclQQqzbmSg4IhySyRi7FyMNWXaVIR7Q7bu5/p8tPTzZDH5H+l3t+0","iPyzTzfxEangvikFcMrAdg9GeNzAYRnkEQsK2wvlYGLbu5/p8tPTzZDH5H+l3t+0","AySszDVVXSx2pHD+kx2nb+EEWz0Yzy1GIBSkgeoaHn7bu5/p8tPTzZDH5H+l3t+0","lGCZBKuTat7tQzQN6JpIbxRVndC4eA4+8poF3Y4dPirbu5/p8tPTzZDH5H+l3t+0","w9XSfAvheg8qpWpFXypOUSMl52ER6ImzPJUPwavsK47bu5/p8tPTzZDH5H+l3t+0"]
                 * targetId : -1
                 * thirdClickStatUrls : []
                 */

                private int adId;
                private int adType;
                private boolean buttonShowed;
                private int clickAction;
                private int clickType;
                private String cover;
                private String description;
                private int displayType;
                private boolean isAd;
                private int isInternal;
                private boolean isLandScape;
                private boolean isShareFlag;
                private String link;
                private String name;
                private int openlinkType;
                private String realLink;
                private int targetId;
                private List<String> clickTokens;
                private List<String> showTokens;
                private List<?> thirdClickStatUrls;

                public int getAdId() {
                    return adId;
                }

                public void setAdId(int adId) {
                    this.adId = adId;
                }

                public int getAdType() {
                    return adType;
                }

                public void setAdType(int adType) {
                    this.adType = adType;
                }

                public boolean isButtonShowed() {
                    return buttonShowed;
                }

                public void setButtonShowed(boolean buttonShowed) {
                    this.buttonShowed = buttonShowed;
                }

                public int getClickAction() {
                    return clickAction;
                }

                public void setClickAction(int clickAction) {
                    this.clickAction = clickAction;
                }

                public int getClickType() {
                    return clickType;
                }

                public void setClickType(int clickType) {
                    this.clickType = clickType;
                }

                public String getCover() {
                    return cover;
                }

                public void setCover(String cover) {
                    this.cover = cover;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public int getDisplayType() {
                    return displayType;
                }

                public void setDisplayType(int displayType) {
                    this.displayType = displayType;
                }

                public boolean isIsAd() {
                    return isAd;
                }

                public void setIsAd(boolean isAd) {
                    this.isAd = isAd;
                }

                public int getIsInternal() {
                    return isInternal;
                }

                public void setIsInternal(int isInternal) {
                    this.isInternal = isInternal;
                }

                public boolean isIsLandScape() {
                    return isLandScape;
                }

                public void setIsLandScape(boolean isLandScape) {
                    this.isLandScape = isLandScape;
                }

                public boolean isIsShareFlag() {
                    return isShareFlag;
                }

                public void setIsShareFlag(boolean isShareFlag) {
                    this.isShareFlag = isShareFlag;
                }

                public String getLink() {
                    return link;
                }

                public void setLink(String link) {
                    this.link = link;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public int getOpenlinkType() {
                    return openlinkType;
                }

                public void setOpenlinkType(int openlinkType) {
                    this.openlinkType = openlinkType;
                }

                public String getRealLink() {
                    return realLink;
                }

                public void setRealLink(String realLink) {
                    this.realLink = realLink;
                }

                public int getTargetId() {
                    return targetId;
                }

                public void setTargetId(int targetId) {
                    this.targetId = targetId;
                }

                public List<String> getClickTokens() {
                    return clickTokens;
                }

                public void setClickTokens(List<String> clickTokens) {
                    this.clickTokens = clickTokens;
                }

                public List<String> getShowTokens() {
                    return showTokens;
                }

                public void setShowTokens(List<String> showTokens) {
                    this.showTokens = showTokens;
                }

                public List<?> getThirdClickStatUrls() {
                    return thirdClickStatUrls;
                }

                public void setThirdClickStatUrls(List<?> thirdClickStatUrls) {
                    this.thirdClickStatUrls = thirdClickStatUrls;
                }
            }
        }

        public static class KeywordsBean {
            /**
             * categoryId : 1
             * categoryTitle : 头条
             * keywordId : 414
             * keywordName : 文化百态
             * keywordType : 1
             * materialType : keyword
             * realCategoryId : 1
             */

            private int categoryId;
            private String categoryTitle;
            private int keywordId;
            private String keywordName;
            private int keywordType;
            private String materialType;
            private int realCategoryId;

            public int getCategoryId() {
                return categoryId;
            }

            public void setCategoryId(int categoryId) {
                this.categoryId = categoryId;
            }

            public String getCategoryTitle() {
                return categoryTitle;
            }

            public void setCategoryTitle(String categoryTitle) {
                this.categoryTitle = categoryTitle;
            }

            public int getKeywordId() {
                return keywordId;
            }

            public void setKeywordId(int keywordId) {
                this.keywordId = keywordId;
            }

            public String getKeywordName() {
                return keywordName;
            }

            public void setKeywordName(String keywordName) {
                this.keywordName = keywordName;
            }

            public int getKeywordType() {
                return keywordType;
            }

            public void setKeywordType(int keywordType) {
                this.keywordType = keywordType;
            }

            public String getMaterialType() {
                return materialType;
            }

            public void setMaterialType(String materialType) {
                this.materialType = materialType;
            }

            public int getRealCategoryId() {
                return realCategoryId;
            }

            public void setRealCategoryId(int realCategoryId) {
                this.realCategoryId = realCategoryId;
            }
        }
    }
}
