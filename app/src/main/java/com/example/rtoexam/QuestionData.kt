package com.example.rtoexam

data class QuestionData (
    var id:Int,
    var question:String,

    var option_one:String,
    var option_tw0:String,
    var option_three:String,
    var correct_ans:Int
)