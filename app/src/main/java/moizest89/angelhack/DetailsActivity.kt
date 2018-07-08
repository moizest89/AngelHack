package moizest89.angelhack

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_details.*
import moizest89.angelhack.R.id.toolbar



class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        setSupportActionBar(toolbar)

        title = ""

        setActionBar()

    }

    fun setActionBar() {
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowTitleEnabled(false)
        this.toolbar.title = null
        this.toolbar.setNavigationOnClickListener( object  : View.OnClickListener{
            override fun onClick(p0: View?) {
                finish()
            }

        })

    }
}
