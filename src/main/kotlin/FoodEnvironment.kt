import kotlin.random.Random

class FoodEnvironment(vararg ags: Actor) : Environment(*ags) {
    var animal: String? = null
    val scores: MutableMap<Actor, Int> = mutableMapOf()

    init {
        for (agent in ags) {
            scores[agent] = 0
        }
    }

    override fun processAction(agent: Actor, act: Action) {

        if (scores.containsKey(agent)) {
            if (act is ForageAction) {
                scores[agent] = scores[agent]?.plus(1) ?: 0
            } else if (act is HuntAction ) {
                scores[agent] = scores[agent]?.plus(2) ?: 0
            }
        }
    }

    override fun sense(agent: Actor) {
        if (animal.isNullOrEmpty()) agent.perceive()
        else agent.perceive(Percept("animal", animal!!))
    }

    override fun step() {
        val chances: Double = Random.nextDouble(0.0, 1.0)
        animal = if (chances >= 0.5) "hippo" else null
        super.step()

    }

}


