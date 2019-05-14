package thiagocury.eti.br.exnavigationcontroller

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.screen2.*

class Screen2 : Fragment() {

    companion object {
        fun newInstance() = Screen2()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.screen2, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        sc2_go_to_final.setOnClickListener {
            it?.let{
                Navigation.findNavController(it).navigate(R.id.finalScreen);
            }
        }
    }
}