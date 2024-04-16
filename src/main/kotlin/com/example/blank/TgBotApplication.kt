package com.example.blank

import eu.vendeli.ktor.starter.serveWebhook
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    serveWebhook {
        declareBot {
            token = "bot_token"
        }
        server {
            PEM_PRIVATE_KEY_PATH = "/etc/letsencrypt/live/example.com/privkey.pem" // The path to the PEM private key file.
            PEM_CHAIN_PATH = "/etc/letsencrypt/live/example.com/fullchain.pem"  // The path to the PEM certificate chain file.
            PEM_PRIVATE_KEY = "pem_changeit".toCharArray() // The PEM private key PASSWORD.

            KEYSTORE_PATH = "/etc/ssl/certs/java/cacerts/bot_keystore.jks" // The path to the Java KeyStore file.
            KEYSTORE_PASSWORD = "changeit".toCharArray() // The password for the KeyStore.

            // If pem certificates are present, the module itself will create a jks storage from them at the specified path.
        }
    }
}
