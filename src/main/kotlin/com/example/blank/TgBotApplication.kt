package com.example.blank

import eu.vendeli.ktor.starter.serveWebhook
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    serveWebhook {
        declareBot {
            token = "bot_token"
        }
        server {
            PEM_PRIVATE_KEY_PATH = "/etc/letsencrypt/live/example.com/privkey.pem"
            PEM_CHAIN_PATH = "/etc/letsencrypt/live/example.com/fullchain.pem"
            PEM_PRIVATE_KEY = "pem_changeit".toCharArray()

            KEYSTORE_PATH = "/etc/ssl/certs/java/cacerts/bot_keystore.jks"
            KEYSTORE_PASSWORD = "changeit".toCharArray()
        }
    }
}
