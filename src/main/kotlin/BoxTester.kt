import java.util.*

fun main(args: Array<String>)
{

    var sc =Scanner(System.`in`)
    println("Please enter object`s length")
    var length = sc.nextFloat()
    println("Please enter object`s width")
    var width = sc.nextFloat()
    println("Please enter object`s height")
    var height = sc.nextInt()
    val box3 = Box3(23f, 14f, 13)
    val box5 = Box5(39.5f, 27.5f, 23)

    val boolean3 = box3.validate(length, width, height)
    val boolean5 = box5.validate(length, width, height)

    if (boolean3 && !boolean5)
        println("you can use box3")
    else if (!boolean3 && boolean5)
        println("you can use box5")
    else if (boolean3 && boolean5)
        println("you can use box3 or box5")
    else
        println("your object is too big , we can`t help you")


}

open class boxBase(var length: Float, var width: Float, var height:Int){
    fun validate( X: Float,  Y: Float, Z: Int) :Boolean{
        if (length >= X && width >=Y && height >=Z)
            return true
        else
            return false
    }
}


class Box3(length: Float, width: Float, height: Int): baseBox(length, width, height){
}
class Box5(length: Float, width: Float, height: Int): baseBox(length, width, height){
}