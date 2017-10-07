package rpek.baby

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import rpek.baby.adapter.BabyAdapter
import rpek.baby.model.Baby

class MainActivity : AppCompatActivity() {

    var listOfBaby= ArrayList<Baby>()
    var babyAdapter: BabyAdapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        listOfBaby.add(Baby("Ratanak Pek", "He is smart and cute.", R.drawable.b1))
        listOfBaby.add(Baby("Phall Pisey", "He is smart and cute.", R.drawable.b2))
        listOfBaby.add(Baby("Hum Vorn", "He is smart and cute.", R.drawable.b3))
        listOfBaby.add(Baby("Chey ravy", "He is smart and cute.", R.drawable.b4))
        listOfBaby.add(Baby("Sen Ron", "He is smart and cute.", R.drawable.b5))
        listOfBaby.add(Baby("Makara Kak", "He is smart and cute.", R.drawable.b6))
        listOfBaby.add(Baby("Pov Dara", "He is smart and cute.", R.drawable.b7))
        listOfBaby.add(Baby("Torn Sokly", "He is smart and cute.", R.drawable.b8))
        listOfBaby.add(Baby("Pen Darayuth", "He is smart and cute.", R.drawable.b7))

        babyAdapter= BabyAdapter(listOfBaby, applicationContext)
        lvBaby.adapter=babyAdapter

    }
}
