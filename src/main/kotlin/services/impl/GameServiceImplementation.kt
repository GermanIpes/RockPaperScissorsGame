package services.impl

import httpClient.gameChallenge.core.GameChallengeService
import model.GameValues
import model.Player
import services.GameService

class GameServiceImplementation(
    private val gameChallengeService: GameChallengeService
): GameService {

    override fun generateNewGameValue(): GameValues = GameValues.ROCK

    override fun createNewPlayer(): Player = Player(playerNumber = 1, gameValue = generateNewGameValue())

    private fun sendPlayer() {
        gameChallengeService.insertNewPlayer(createNewPlayer())
    }

    init {
        sendPlayer()
    }
}