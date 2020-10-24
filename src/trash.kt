import java.util.*

fun main(): Unit {
    val (n, m) = readLine()!!.split(' ').map(String::toInt)
    val g = Array(n + 1) { mutableListOf<Int>() }
    val gCnt = Array(n+1){0}
    for(i in 1..m) {
        val (v1, v2) = readLine()!!.split(' ').map(String::toInt)
        g[v1].add(v2)
        gCnt[v2]++
    }

    val q = LinkedList<Int>()
    for(i in 1..n)
        if(gCnt[i] == 0)
            q.add(i)

    while(!q.isEmpty()){
        val now = q.poll()
        print("$now ")
        g[now].forEach{
            if(--gCnt[it] == 0)
                q.add(it)
        }
    }
}