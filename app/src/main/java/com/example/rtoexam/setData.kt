package com.example.rtoexam

object setData {

    const val name:String="name"
    const val score:String="score"

    fun getQuestion():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> = arrayListOf()

        var question1 = QuestionData(
            1,
            "Near a pedestrian crossing, when the pedestrians are waiting to cross the road, you should",

            "Sound horn and proceed ",
            "Slow down, sound horn and pass ",
            "Stop the vehicle and wait till the pedestrians cross the road and then proceed",
            3
        )
        var question2 = QuestionData(
            2,
            "You are approaching a narrow bridge, another vehicle is about to enter the bridge from opposite side you should ",

            "Increase the speed and try to cross the bridge as fast as possible",
            "Put on the head light and pass the bridge",
            "Wait till the other vehicle crosses the bridge and then proceed",
            3
        )
        var question3 = QuestionData(
            3,
            "When a vehicle is involved in an accident causing injury to any person",

            "Take the vehicle to the nearest police station and report the accident",
            "Take all reasonable steps to secure medical attention to the injured and report to the nearest police station within 24 hours",
            "Stop the vehicle and report to the police station",
            2
        )
        var question4 = QuestionData(
            4,
            "On a road designated as one way",

            "Should not drive in reverse gear",
            "Overtaking is prohibited",
            "Parking is prohibited",
            1
        )

        var question5 = QuestionData(
            5,
            "You can overtake a vehicle in front",

            "Through the left side",
            "Through the left side, if the road is wide",
            "Through the right side of that vehicle",
            3
        )

        var question6 = QuestionData(
            6,
            "How can you distinguish a transport vehicle.",

            "By looking at the number plate of the vehicle.",
            "By colour of the vehicle.",
            "By looking at the tyre size.",
            1
        )
        var question7 = QuestionData(
            7,
            "Validity of learners licence",

            "Till the driving licence is obtained",
            "6 months",
            "30 days ",
            2
        )
        var question8 = QuestionData(
            8,
            "In a road without footpath, the pedestrians",

            "Should walk on the eft side of the road",
            "Should walk on the right side of the road",
            "May walk on either side of the road",
            2
        )
        var question9 = QuestionData(
            9,
            "Free passage should be given to the following types of vehicles",

            "Police vehicles",
            "Express, Super Express buses",
            "Vehicles with emmergency alerts (Lights / Siren)",
            3
        )

        var question10 = QuestionData(
            10,
            "Vehicles proceeding from opposite direction should be allowed to pass through ...",

            "Your right side",
            "Your left side",
            "The convenient side",
            1
        )

        var question11 = QuestionData(
            11,
            "Driver of a vehicle may overtake...",

            "When the driver of the vehicle in front shows the signal to overtake",
            "while driving down hill",
            "If the road is sufficiently wide",
            1
        )
        var question12 = QuestionData(
            12,
            "Fog lamps are used ",

            "When the opposite vehicle is not using dim light",
            "During night",
            "When there is mist",
            3
        )
        var question13 = QuestionData(
            13,
            "Zebra lines are meant for...",

            "stopping vehicle",
            "pedestrians crossing",
            "for giving preference to vehicle",
            2
        )
        var question14 = QuestionData(
            14,
            "Red traffic light indicates..",

            "vehicle can proceed with caution",
            "stop the vehicle",
            "slow down.",
            2
        )

        var question15 = QuestionData(
            15,
            "Use of horn prohibited",

            "Near Hospital, Courts of Law",
            "Mosque, Church and Temple",
            "Near Police Station",
            1
        )

        que.add(question1)
        que.add(question2)
        que.add(question3)
        que.add(question4)
        que.add(question5)
        que.add(question6)
        que.add(question7)
        que.add(question8)
        que.add(question9)
        que.add(question10)
        que.add(question11)
        que.add(question12)
        que.add(question13)
        que.add(question14)
        que.add(question15)
        return que
    }
}