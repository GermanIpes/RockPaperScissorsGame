package services

import model.GameValues
import model.Player

interface GameService {
    fun generateNewGameValue(): GameValues
    fun createNewPlayer(): Player
}