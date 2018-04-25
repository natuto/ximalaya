package com.lws.ximalaya.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.List;

/**
 * song on 2018/4/16 22:23
 */
public class GarhetMoreBean   {

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


        private int pageId;
        private int pageSize;
        private int maxPageId;
        private int totalCount;
        private List<ListBean> list;

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

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean implements Parcelable {
            /**
             * trackId : 76171460
             * uid : 25380834
             * playUrl64 : http://audio.xmcdn.com/group41/M07/AB/21/wKgJ8lqmZTGDdZG2AGB4kQrRKwo345.mp3
             * playUrl32 : http://audio.xmcdn.com/group42/M04/A9/4D/wKgJ9FqmZyqgZ2f4ADA8aGXjqQg117.mp3
             * playPathHq :
             * playPathAacv164 : http://audio.xmcdn.com/group42/M03/A9/B1/wKgJ81qmZTDBv-ZAAGGj-0TG60I314.m4a
             * playPathAacv224 : http://audio.xmcdn.com/group40/M05/70/94/wKgJVFqmZSvA7TaLACVW6ERkBac723.m4a
             * title : 珍惜在你眼前“放屁”的人吧！
             * duration : 790
             * albumId : 2727238
             * isPaid : false
             * isVideo : false
             * isDraft : false
             * isRichAudio : false
             * orderNo : 623
             * processState : 2
             * createdAt : 1520854303000
             * coverSmall : http://fdfs.xmcdn.com/group12/M0B/67/E3/wKgDXFXlBZbDYjwvAAX_JSrzX_M685_web_meduim.jpg
             * coverMiddle : http://fdfs.xmcdn.com/group12/M0B/67/E3/wKgDXFXlBZbDYjwvAAX_JSrzX_M685_web_large.jpg
             * coverLarge : http://fdfs.xmcdn.com/group12/M0B/67/E3/wKgDXFXlBZbDYjwvAAX_JSrzX_M685_mobile_large.jpg
             * nickname : 大毛二毛工作室
             * smallLogo : http://fdfs.xmcdn.com/group7/M0B/4C/FC/wKgDX1WwUAjw0Vc2AALG0BvLk3s678_mobile_small.jpg
             * userSource : 1
             * opType : 1
             * isPublic : true
             * likes : 61
             * playtimes : 34114
             * comments : 23
             * shares : 0
             * status : 1
             */

            private int trackId;
            private int uid;
            private String playUrl64;
            private String playUrl32;
            private String playPathHq;
            private String playPathAacv164;
            private String playPathAacv224;
            private String title;
            private int duration;
            private int albumId;
            private boolean isPaid;
            private boolean isVideo;
            private boolean isDraft;
            private boolean isRichAudio;
            private int orderNo;
            private int processState;
            private long createdAt;
            private String coverSmall;
            private String coverMiddle;
            private String coverLarge;
            private String nickname;
            private String smallLogo;
            private int userSource;
            private int opType;
            private boolean isPublic;
            private int likes;
            private int playtimes;
            private int comments;
            private int shares;
            private int status;

            protected ListBean(Parcel in) {
                trackId = in.readInt();
                uid = in.readInt();
                playUrl64 = in.readString();
                playUrl32 = in.readString();
                playPathHq = in.readString();
                playPathAacv164 = in.readString();
                playPathAacv224 = in.readString();
                title = in.readString();
                duration = in.readInt();
                albumId = in.readInt();
                isPaid = in.readByte() != 0;
                isVideo = in.readByte() != 0;
                isDraft = in.readByte() != 0;
                isRichAudio = in.readByte() != 0;
                orderNo = in.readInt();
                processState = in.readInt();
                createdAt = in.readLong();
                coverSmall = in.readString();
                coverMiddle = in.readString();
                coverLarge = in.readString();
                nickname = in.readString();
                smallLogo = in.readString();
                userSource = in.readInt();
                opType = in.readInt();
                isPublic = in.readByte() != 0;
                likes = in.readInt();
                playtimes = in.readInt();
                comments = in.readInt();
                shares = in.readInt();
                status = in.readInt();
            }


            public static final Creator<ListBean> CREATOR = new Creator<ListBean>() {
                @Override
                public ListBean createFromParcel(Parcel in) {
                    return new ListBean(in);
                }

                @Override
                public ListBean[] newArray(int size) {
                    return new ListBean[size];
                }
            };

            public int getTrackId() {
                return trackId;
            }

            public void setTrackId(int trackId) {
                this.trackId = trackId;
            }

            public int getUid() {
                return uid;
            }

            public void setUid(int uid) {
                this.uid = uid;
            }

            public String getPlayUrl64() {
                return playUrl64;
            }

            public void setPlayUrl64(String playUrl64) {
                this.playUrl64 = playUrl64;
            }

            public String getPlayUrl32() {
                return playUrl32;
            }

            public void setPlayUrl32(String playUrl32) {
                this.playUrl32 = playUrl32;
            }

            public String getPlayPathHq() {
                return playPathHq;
            }

            public void setPlayPathHq(String playPathHq) {
                this.playPathHq = playPathHq;
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

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getDuration() {
                return duration;
            }

            public void setDuration(int duration) {
                this.duration = duration;
            }

            public int getAlbumId() {
                return albumId;
            }

            public void setAlbumId(int albumId) {
                this.albumId = albumId;
            }

            public boolean isIsPaid() {
                return isPaid;
            }

            public void setIsPaid(boolean isPaid) {
                this.isPaid = isPaid;
            }

            public boolean isIsVideo() {
                return isVideo;
            }

            public void setIsVideo(boolean isVideo) {
                this.isVideo = isVideo;
            }

            public boolean isIsDraft() {
                return isDraft;
            }

            public void setIsDraft(boolean isDraft) {
                this.isDraft = isDraft;
            }

            public boolean isIsRichAudio() {
                return isRichAudio;
            }

            public void setIsRichAudio(boolean isRichAudio) {
                this.isRichAudio = isRichAudio;
            }

            public int getOrderNo() {
                return orderNo;
            }

            public void setOrderNo(int orderNo) {
                this.orderNo = orderNo;
            }

            public int getProcessState() {
                return processState;
            }

            public void setProcessState(int processState) {
                this.processState = processState;
            }

            public long getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(long createdAt) {
                this.createdAt = createdAt;
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

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getSmallLogo() {
                return smallLogo;
            }

            public void setSmallLogo(String smallLogo) {
                this.smallLogo = smallLogo;
            }

            public int getUserSource() {
                return userSource;
            }

            public void setUserSource(int userSource) {
                this.userSource = userSource;
            }

            public int getOpType() {
                return opType;
            }

            public void setOpType(int opType) {
                this.opType = opType;
            }

            public boolean isIsPublic() {
                return isPublic;
            }

            public void setIsPublic(boolean isPublic) {
                this.isPublic = isPublic;
            }

            public int getLikes() {
                return likes;
            }

            public void setLikes(int likes) {
                this.likes = likes;
            }

            public int getPlaytimes() {
                return playtimes;
            }

            public void setPlaytimes(int playtimes) {
                this.playtimes = playtimes;
            }

            public int getComments() {
                return comments;
            }

            public void setComments(int comments) {
                this.comments = comments;
            }

            public int getShares() {
                return shares;
            }

            public void setShares(int shares) {
                this.shares = shares;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(trackId);
                parcel.writeInt(uid);
                parcel.writeString(playUrl64);
                parcel.writeString(playUrl32);
                parcel.writeString(playPathHq);
                parcel.writeString(playPathAacv164);
                parcel.writeString(playPathAacv224);
                parcel.writeString(title);
                parcel.writeInt(duration);
                parcel.writeInt(albumId);
                parcel.writeByte((byte) (isPaid ? 1 : 0));
                parcel.writeByte((byte) (isVideo ? 1 : 0));
                parcel.writeByte((byte) (isDraft ? 1 : 0));
                parcel.writeByte((byte) (isRichAudio ? 1 : 0));
                parcel.writeInt(orderNo);
                parcel.writeInt(processState);
                parcel.writeLong(createdAt);
                parcel.writeString(coverSmall);
                parcel.writeString(coverMiddle);
                parcel.writeString(coverLarge);
                parcel.writeString(nickname);
                parcel.writeString(smallLogo);
                parcel.writeInt(userSource);
                parcel.writeInt(opType);
                parcel.writeByte((byte) (isPublic ? 1 : 0));
                parcel.writeInt(likes);
                parcel.writeInt(playtimes);
                parcel.writeInt(comments);
                parcel.writeInt(shares);
                parcel.writeInt(status);
            }
        }
    }
}
