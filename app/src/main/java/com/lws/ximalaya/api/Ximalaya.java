package com.lws.ximalaya.api;

import com.lws.ximalaya.bean.GarhetMoreBean;
import com.lws.ximalaya.bean.GatherBean;
import com.lws.ximalaya.bean.PlayDetailBean;
import com.lws.ximalaya.bean.Ximalayabaen;
import com.lws.ximalaya.utils.TimeUtils;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * song on 2018/4/8 03:04
 */
public interface Ximalaya {

   /* @GET("/discovery-firstpage/v2/explore/ts-{time}?appid=0&categoryId=-2&code=43_230000_2301&device=android&deviceId=ffffffff-851a-ade5-ffff-ffffc33653ef&includeActivity=true&includeSpecial=true&inreview=false&network=wifi&operator=1&pullToRefresh=true&scale=1&version=6.3.84")
    Observable<Ximalayabaen> getXimalaya(@Path("time") String time);
*/
    @GET("/discovery-firstpage/v2/explore/ts-{t}?appid=0&categoryId=-2&code=43_230000_2301&device=android&deviceId=ffffffff-851a-ade5-ffff-ffffc33653ef&includeActivity=true&includeSpecial=true&inreview=false&network=wifi&operator=1&pullToRefresh=true&scale=1&version=6.3.84")
    Observable<Ximalayabaen> getXimalaya(@Path("t") String time);

    @GET("/mobile/v1/album/ts-{t}?ac=WIFI&device=android&isAsc=true&pageSize=20&pre_page=0&source=4&supportWebp=true")

    Observable<GatherBean>  getGarher( @Path("t") String time,@Query("albumId")int albumId,@Query("pageId")int pageId);

    @GET("/mobile/v1/album/track/ts-{t}?device=android&isAsc=true&pageSize=20&pre_page=0")
    Observable<GarhetMoreBean>  getGarhetMore (@Path("t") String time, @Query("albumId")int albumId, @Query("pageId")int pageId);

    @GET("/mobile/track/v2/baseInfo/{t}?device=android")
    Observable<PlayDetailBean>  getPlayData (@Path("t") String time, @Query("trackId")int trackId);



}
