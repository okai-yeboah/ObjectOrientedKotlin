fun main(args: Array<String>) {
//    val simpleAgent = SimpleAgent("simba")
//    println(simpleAgent)
//    println(simpleAgent.act())

    val env = FoodEnvironment(SimpleAgent("Charlie"))
    env.step()
    println(env.scores)
}