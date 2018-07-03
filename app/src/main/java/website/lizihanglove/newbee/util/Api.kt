package website.lizihanglove.newbee.util

import com.google.gson.JsonObject
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import website.lizihanglove.newbee.model.LatestResponse


/**
 * @ author lizihanglove
 * 邮箱：one_mighty@163.com
 * 时间：on 2017/11/3 17:15
 */
interface Api {

    @GET("day/history")
    fun latest(): Observable<LatestResponse>

    @GET("day/{year}/{month}/{day}")
    fun history(
            @Path("year") year: String,
            @Path("month") month: String,
            @Path("day") day: String
    ): Observable<JsonObject>
}