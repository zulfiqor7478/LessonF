package innavation.uz

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import innavation.uz.databinding.FragmentBBinding
import java.util.*

class FragmentB : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentBBinding.inflate(inflater, container, false)

        return binding.root
    }
}
