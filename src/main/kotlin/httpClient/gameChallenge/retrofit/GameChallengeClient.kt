package httpClient.gameChallenge.retrofit

import httpClient.gameChallenge.core.GameChallengeService
import model.Player
import retrofit2.Retrofit

class GameChallengeClient(
    client : Retrofit,
) : GameChallengeService {
    private val service = client.create(GameClient::class.java)

    override fun insertNewPlayer(player: Player) {
        val response = service.postNewPlayer(
            request = player
        ).execute()
        if (response.isSuccessful)
            println("The new Player has been processed!")
        else
            println("An error occurred while processing a new player")
    }
}