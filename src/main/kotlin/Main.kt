fun main() {
    print(solution(mutableListOf(-1, 150, 190, 170, -1, -1, 160, 180)))
}

fun solution(a: MutableList<Int>): MutableList<Int> {
    for (i in 0 until a.size) {
        for (j in i until a.size) {
            if (a[i] > a[j] && a[j] != -1) {
                val temp = a[i]
                a[i] = a[j]
                a[j] = temp
            }
        }
    }
    return a
}