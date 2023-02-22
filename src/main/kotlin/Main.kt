fun main() {
    //Create a function that takes in 4 strings and creates an array out of them then
    //prints out the array
    cities()
    workers("maria","joy","rose","dora")
    marks()
    println(bestfrnds("Mercy","Orishaba","Banga"))


}

    fun workers (name1:String,name2: String,name3: String,name4: String) {
        var a = arrayOf(name1,name2,name3,name4)
        println (a.contentToString())
        



    }
        //Create a function that given an array below:
        //
        //var cities = arrayOf(“harare”, “mumbai”, “dodoma”, “jakarta”)
        //prints out the names of the cities in the correct grammatical case.

        fun cities () {
            var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
            for (city in cities) {
                println(city.capitalize())

            }

        }
//Create one function that given the below array:
//
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
//(ii) prints out the index of 158 (1 point)
//(iii) prints out the elements in ascending order

fun marks() {
    var numbers = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
    ///(i) prints out the sum of the second and fifth elements (1 point)
    var sum = numbers[1] + numbers[4]
    println(sum)

    //prints out the index of 158
    //getArrayIndex = Arrays.asList(array).indexOf(14);
    println(numbers.indexOf(158))

    // prints out the elements in ascending order

    var sortAsc = numbers.sorted()
    println(sortAsc)

    //Create a function that takes in 3 names and returns a string array containing
    //all 3 names.

    }

fun bestfrnds(name1: String, name2: String, name3: String):String {
    var k = arrayOf(name1, name2, name3)
    return k.contentToString()
}


















