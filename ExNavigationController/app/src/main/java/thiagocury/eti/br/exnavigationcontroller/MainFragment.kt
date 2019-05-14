package thiagocury.eti.br.exnavigationcontroller

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.main_fragment.*
import thiagocury.eti.br.exnavigationcontroller.R

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        // TODO: Use the ViewModel
        mf_bt_screen1.setOnClickListener {
            it?.let{
                Navigation.findNavController(it).navigate(R.id.screen1);
            }
        }

        mf_bt_screen2.setOnClickListener {
            it?.let{
                Navigation.findNavController(it).navigate(R.id.screen2);
            }
        }
    }

}
