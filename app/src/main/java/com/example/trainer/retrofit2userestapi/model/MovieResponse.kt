package com.example.trainer.retrofit2userestapi.model

data class MovieResponse(var page : Int,
                             val results : ArrayList<Movie>,
                             val totalResult : Int,
                             val totalpage : Int)
