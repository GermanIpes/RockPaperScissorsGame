package services.impl

import httpClient.gameChallenge.core.GameChallengeService
import model.GameValues
import model.Player
import services.GameService

class GameServiceImplementation(
    private val gameChallengeService: GameChallengeService
): GameService {

    //Elimine el todo() que esta en la funcion generateNewGameValue()
    //Reemplace ese valor con uno de los siguientes valores posibles:
    //GameValues.ROCK
    //GameValues.PAPER
    //GameValues.SCISSORS
    //GameValues.SPOCK
    //GameValues.LIZARD
    //En el caso de querer jugar un valor al azar, se puede utilizar:
    //GameValues.values().random()

    //Una vez finalizado, pulse el boton play verde que esta en la parte superior derecha del Ide

    override fun generateNewGameValue(): GameValues =
        TODO("Una vez finalizado, pulse el boton play verde que esta en la parte superior derecha del Ide")

    override fun createNewPlayer(): Player = Player(playerNumber = 1, gameValue = generateNewGameValue())

    private fun sendPlayer() {
        gameChallengeService.insertNewPlayer(createNewPlayer())
    }

    init {
        sendPlayer()
    }
}