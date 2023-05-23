package httpClient.gameChallenge.core

import model.Player

interface GameChallengeService {
    fun insertNewPlayer(player: Player)
}
