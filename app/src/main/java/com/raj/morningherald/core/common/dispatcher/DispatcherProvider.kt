package com.raj.morningherald.core.common.dispatcher

import kotlinx.coroutines.CoroutineDispatcher

interface DispatcherProvider {

    val main: CoroutineDispatcher

    val io: CoroutineDispatcher

    val default: CoroutineDispatcher

}