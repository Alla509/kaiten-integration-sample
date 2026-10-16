package me.gimmesomepeace.app

import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.coroutines.cancellation.CancellationException

fun main() {
    println("Hello")

    println("more lines")
}

fun CoroutineScope.launchSafe(
    context: CoroutineContext = EmptyCoroutineContext,
    onError: (Throwable) -> Unit = {},
    block: suspend CoroutineScope.() -> Unit
): Job {
    return launch(context) {
        try {
            block()
        } catch (e: CancellationException) {
            throw e
        } catch (e: Exception) {
            onError(e)
        }
    }
}
