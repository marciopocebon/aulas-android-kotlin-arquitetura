package thiagocury.eti.br.exnavigationcontroller

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.screen1.*

class Screen1 : Fragment() {

    companion object {
        fun newInstance() = Screen1()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.screen1, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        sc1_go_to_final.setOnClickListener {
            it?.let{
                val action = Screen1Directions.actionScreen1ToFinalScreen("Texto enviado Screen 1")
                Navigation.findNavController(it).navigate(action);
            }
        }
    }
}