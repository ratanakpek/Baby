package rpek.baby

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_person_detail.*

class PersonDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_person_detail)


        val bundle:Bundle=intent.extras
        val name=bundle.getString("name")
        val desc=bundle.getString("desc")
        val image = bundle.getInt("image")

        tvNameDe.text=name
        tvDescDe.text=desc
        imageView.setImageResource(image)

    }
}
