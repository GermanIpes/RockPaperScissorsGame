package modules

import httpClient.gameChallenge.core.GameChallengeService
import services.GameService
import services.impl.GameServiceImplementation

data class ServiceModule(
    val gameService: GameService
) {
    companion object {
        fun create(httpGameService : GameChallengeService): ServiceModule{
            return ServiceModule(
                gameService = GameServiceImplementation(httpGameService)
            )
        }
    }
}