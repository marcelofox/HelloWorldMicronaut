package com.marcelo.itau

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.marcelo.itau")
		.start()
}

