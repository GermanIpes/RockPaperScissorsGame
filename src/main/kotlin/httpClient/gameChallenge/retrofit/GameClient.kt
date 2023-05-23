package httpClient.gameChallenge.retrofit

import model.Player
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface GameClient {
    @POST("/v1/Players")
    fun postNewPlayer(
        @Body request: Player
    ): Call<Unit>
}