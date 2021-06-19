package com.mthaler.springprofiles

import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Repository

@Repository("movieDao")
class MovieDaoImpl: MovieDao {

    @Cacheable(value = ["movieFindCache"], key = "#name")
    override fun findByDirector(name: String): Movie? {
        slowQuery(2000L)
        println("findByDirector is running...")
        return Movie(1, "Forrest Gump", "Robert Zemeckis")
    }

    private fun slowQuery(seconds: Long) {
        try {
            Thread.sleep(seconds)
        } catch (e: InterruptedException) {
            throw IllegalStateException(e)
        }
    }
}