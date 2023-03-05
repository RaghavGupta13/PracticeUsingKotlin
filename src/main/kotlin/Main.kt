import java.util.*

fun main() {
    val arr = intArrayOf(4, 2, 5, 1, 7, 9)
    selectionSort(arr)

}

fun selectionSort(arr: IntArray){

    for(i in arr.indices ){
        var currMin = i
        var startIndex = i+1
        for(j in startIndex until arr.size){
            if(arr[j] < arr[currMin]){
                currMin = j
            }
        }
        swap(arr, currMin, i)
    }
    print(arr.contentToString())
}

fun swap(arr: IntArray, i: Int, j: Int){
    val temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
}