class RandomAgent(override val name: String, probability: Double) : Actor {
    override fun act(): Action {
        return ForageAction()
    }

    override fun perceive(vararg facts: Percept) {
        TODO("Not yet implemented")
    }

    override fun toString(): String {
        return "RandomAgent(name='$name')"
    }


}