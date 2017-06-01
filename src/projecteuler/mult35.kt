/**
 * Created by jkueb on 6/1/2017.
 */
package projecteuler


fun mult35(limit: Int) : String {
    val limit = 1000

    val result = (1..limit - 1).asSequence().filter { n -> n % 3 == 0 || n % 5 == 0}.sum()

    return "the sum of all the multiple of 3 or 5 below $limit is $result"
}