class SimpleAgent(override val name: String) : Actor {
    override fun act(): Action {
        return ForageAction()
    }

    override fun perceive(vararg facts: Percept) {}

    override fun toString(): String {
        return "SimpleAgent(name='$name')"
    }
}