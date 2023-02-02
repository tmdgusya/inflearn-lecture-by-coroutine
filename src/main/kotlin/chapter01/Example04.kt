package chapter01

import kotlin.time.ExperimentalTime
import kotlin.time.measureTime

private fun shower() {
    Thread.sleep(3000)
    println("샤워 완료!")
}

private fun makeToast() {
    val thread = Thread {
        println("토스트 제작 스레드 : ${Thread.currentThread().name}")
        Thread.sleep(3000)
        println("토스트 제작 완료")
    }
    thread.start()
    thread.join()
}

private fun eatToToast() {
    Thread.sleep(2000)
    println("토스트 먹기 완료!")
}

private fun workOut() {
    Thread.sleep(10000)
    println("운동 완료!")
}

@OptIn(ExperimentalTime::class)
fun main() {
    println("메인 스레드 : ${Thread.currentThread().name}")
    val executedTime = measureTime {
        shower()
        makeToast()
        eatToToast()
        workOut()
    }

    println(executedTime)
}
