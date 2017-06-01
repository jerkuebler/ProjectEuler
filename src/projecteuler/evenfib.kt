/**
 * Created by jkueb on 6/1/2017.
 */
package projecteuler

fun evenfib(limit: Int):Int{

    var temp: Int = 1
    var temp1: Int = 0
    var resultn: Int = 0

    while(temp < limit){
        val new_num = temp + temp1
        if(new_num > limit){
            break
        }
        temp1 = temp
        temp = new_num
        if(new_num % 2 == 0) {
            resultn += new_num
        }
    }
    return resultn
}