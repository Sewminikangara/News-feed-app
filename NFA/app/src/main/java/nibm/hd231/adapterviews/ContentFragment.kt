package nibm.hd231.adapterviews

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView

class ContentFragment(var selected:String) : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val view:View = inflater.inflate(R.layout.fragment_content, container, false)
        val tvContent: TextView = view.findViewById(R.id.tvContent)
        when(selected) {
            "Super Bowl" -> tvContent.text = "Sports description Super Bowl"
            "Taylor Swift and football" -> tvContent.text = "Sports description Taylor Swift and football"
            "Chaina keeps building stadums in Africa" -> tvContent.text = "Sports description Chaina keeps building stadums in Africa"
            "Valorant and adaptable AI" -> tvContent.text = "Tech description Valorant and adaptable AI"
            "Cyborg loculust with brain" -> tvContent.text = "Tech description Cyborg loculust with brain"
            "Quantom computer and time crystale" -> tvContent.text = "Tech description Quantom computer and time crystale"
            "Deadpool 3 new leaks" -> tvContent.text = "Entertainment description Deadpool 3 new leak"
            "2024 PMCO US" -> tvContent.text = "Entertainment description 2024 PMCO US"
            "Valorant primier" -> tvContent.text = "Entertainment description Valorant primier"

            else -> tvContent.text = "no value"
        }
        return view
    }
}