package com.example.quizapp

class QuestionModel {
    var ans: String?=null
    var Question:String?=null
    var option1:String?=null
    var option2:String?=null
    var option3:String?=null
    var option4:String?=null

    constructor()
    constructor(
        Question: String?,
        option1: String?,
        option2: String?,
        option3: String?,
        option4: String?,
        ans: String?
    ) {
        this.Question = Question
        this.option1 = option1
        this.option2 = option2
        this.option3 = option3
        this.option4 = option4
        this.ans=ans
    }

}