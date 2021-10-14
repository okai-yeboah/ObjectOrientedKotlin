import kotlin.random.Random

fun main(args: Array<String>) {
//    val simpleAgent = SimpleAgent("simba")
//    println(simpleAgent)
//    println(simpleAgent.act())

//    val env = FoodEnvironment(SimpleAgent("Charlie"))
//    env.step()
//    println(env.scores)
//    print(Random.nextDouble(0.0,1.0))

//    val env = FoodEnvironment()
//    for (i in 1..10) {
//        env.step()
//        println(env.animal)
//    }

    val env = FoodEnvironment(CleverAgent("Charlie"), RandomAgent("Bob", 0.2), SimpleAgent("Alice"))
    for (i in 1..100) {
        env.step()
    }
    println(env.scores)

}