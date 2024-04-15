package nibm.hd231.adapterviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    //1.Declare ListView Object
    private lateinit var lstnews: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //2.Initialize the object
        lstnews = findViewById(R.id.lstnews)

        //3.Create the collection
        var newsdata = arrayOf("Sports","Tech","Entertainment")

        //4.Create adapter
        var listAdapter:ArrayAdapter<String> = ArrayAdapter(
            applicationContext,
            android.R.layout.simple_list_item_1, //layout used to represent one item
            newsdata
        )

        //5.Set adapter for listview
        lstnews.adapter = listAdapter

        //Handling Item click event for listView
        lstnews.onItemClickListener = object :AdapterView.OnItemClickListener {
            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                var selected:String = newsdata[position]

                val fragmentContainer = R.id.articleTitleContainer
                //To manage fragments for the activity
                val fragManager: FragmentManager = supportFragmentManager
                //To manage loading and unloading fragments
                val fragTransaction: FragmentTransaction = fragManager.beginTransaction()
                //Create fragment
                val fragment: TitleFragment= TitleFragment(selected)
                //Specify the transaction
                fragTransaction.replace(fragmentContainer, fragment)
                //Commit Transaction
                fragTransaction.commit()
            }

        }
    }
}