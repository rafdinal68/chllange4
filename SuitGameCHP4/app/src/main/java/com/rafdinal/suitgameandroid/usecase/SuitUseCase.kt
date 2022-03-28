package usecase

interface SuitUseCase {
    fun decideWinner(playerOne: Int, playerTwo: Int) : Int
}