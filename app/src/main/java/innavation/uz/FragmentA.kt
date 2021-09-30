package innavation.uz

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import innavation.uz.databinding.FragmentABinding

class FragmentA : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentABinding.inflate(inflater, container, false)
        binding.btn.setOnClickListener {
            findNavController().navigate(R.id.fragmentB2)
        }
        return binding.root
    }

}