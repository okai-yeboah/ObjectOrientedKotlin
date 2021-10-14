class CleverAgent(override val name: String) : Actor {
    var sense: Percept? = null


    override fun act(): Action {
        return if (sense != null) HuntAction(sense!!.value) else ForageAction()
    }

    override fun perceive(vararg facts: Percept) {
//       sense = facts.first()
    }

    override fun toString(): String {
        return "CleverAgent(name='$name', sense=$sense)"
    }
}