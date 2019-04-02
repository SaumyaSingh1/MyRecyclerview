package com.example.myrecyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val myarray= arrayListOf<MyArray>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myarray.add(MyArray("High School Topper","In 2015 , i was the topper of CBSE board", " 2015"))
        myarray.add(MyArray("!2th class Topper","In 2017 , i was the topper of my school","2017"))
        myarray.add(MyArray("Engineering Year Topper","In 2018 , i was the topper of my school","2018"))
        myarray.add(MyArray("1st position holder","In 2018 , I got 1st pos in MSIT debate competion","2018"))
        myarray.add(MyArray("1st kavi samellan","In 2018 , i attendent a kavi samelan and got rewarded for same","2018"))
        myarray.add(MyArray("SIH Participant","In 2019, i wsa participant of SIH","2019"))
        myarray.add(MyArray("SIH Winner","In 2019 , our team won SIH ","2019"))
        myarray.add(MyArray("High School Topper","In 2015 , i was the topper of CBSE board", " 2015"))
        myarray.add(MyArray("!2th class Topper","In 2017 , i was the topper of my school","2017"))
        myarray.add(MyArray("Engineering Year Topper","In 2018 , i was the topper of my school","2018"))
        myarray.add(MyArray("1st position holder","In 2018 , I got 1st pos in MSIT debate competion","2018"))
        myarray.add(MyArray("1st kavi samellan","In 2018 , i attendent a kavi samelan and got rewarded for same","2018"))
        myarray.add(MyArray("SIH Participant","In 2019, i wsa participant of SIH","2019"))
        myarray.add(MyArray("SIH Winner","In 2019 , our team won SIH ","2019"))
        myarray.add(MyArray("High School Topper","In 2015 , i was the topper of CBSE board", " 2015"))
        myarray.add(MyArray("!2th class Topper","In 2017 , i was the topper of my school","2017"))
        myarray.add(MyArray("Engineering Year Topper","In 2018 , i was the topper of my school","2018"))
        myarray.add(MyArray("1st position holder","In 2018 , I got 1st pos in MSIT debate competion","2018"))
        myarray.add(MyArray("1st kavi samellan","In 2018 , i attendent a kavi samelan and got rewarded for same","2018"))
        myarray.add(MyArray("SIH Participant","In 2019, i wsa participant of SIH","2019"))
        myarray.add(MyArray("SIH Winner","In 2019 , our team won SIH ","2019"))
        myarray.add(MyArray("High School Topper","In 2015 , i was the topper of CBSE board", " 2015"))
        myarray.add(MyArray("!2th class Topper","In 2017 , i was the topper of my school","2017"))
        myarray.add(MyArray("Engineering Year Topper","In 2018 , i was the topper of my school","2018"))
        myarray.add(MyArray("1st position holder","In 2018 , I got 1st pos in MSIT debate competion","2018"))
        myarray.add(MyArray("1st kavi samellan","In 2018 , i attendent a kavi samelan and got rewarded for same","2018"))
        myarray.add(MyArray("SIH Participant","In 2019, i wsa participant of SIH","2019"))
        myarray.add(MyArray("SIH Winner","In 2019 , our team won SIH ","2019"))


        val myAdapter=MyAdapter(myarray,this)
        rv.adapter=myAdapter
        rv.layoutManager=LinearLayoutManager(baseContext)
    }
}
