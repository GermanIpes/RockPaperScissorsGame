package modules

import httpClient.gameChallenge.retrofit.GameChallengeClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

data class HttpModule(
    val gameClient: GameChallengeClient
) {
    companion object {
        fun create(): HttpModule =
            HttpModule(
                gameClient = GameChallengeClient(
                    client = Retrofit.Builder().baseUrl("http://localhost:80").addConverterFactory(GsonConverterFactory.create()).build(),
                )
            )
    }
}