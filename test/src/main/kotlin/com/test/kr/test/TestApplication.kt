package com.test.kr.test

import org.jsoup.Jsoup
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.sql.DriverManager.println

@SpringBootApplication
class TestApplication
fun main(args: Array<String>) {
    val url = "https://www.google.com/search?q=jsoup+kotlin+tutorial&rlz=1C1YTUH_koKR1073KR1073&oq=kotlin+jsoup+&gs_lcrp=EgZjaHJvbWUqCAgDEAAYCBgeMggIABBFGB4YOTIGCAEQABgeMggIAhAAGAUYHjIICAMQABgIGB7SAQg3NDcyajBqN6gCALACAA&sourceid=chrome&ie=UTF-8"
    val docs = Jsoup.connect(url).get()
    println(docs.html())
    runApplication<TestApplication>(*args)
}
