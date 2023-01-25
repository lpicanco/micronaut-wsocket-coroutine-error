package com.example

import io.micronaut.websocket.WebSocketSession
import io.micronaut.websocket.annotation.OnMessage
import io.micronaut.websocket.annotation.ServerWebSocket
import kotlinx.coroutines.delay

@ServerWebSocket("/")
class WebsocketController {
    @OnMessage
    suspend fun messageHandler(message: String, session: WebSocketSession) {
        delay(500)
    }
}
