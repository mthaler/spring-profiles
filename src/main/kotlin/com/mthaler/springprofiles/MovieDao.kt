package com.mthaler.springprofiles

interface MovieDao {

    fun findByDirector(name: String): Movie?
}