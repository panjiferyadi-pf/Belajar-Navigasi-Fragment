package com.example.latihannavigasi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.latihannavigasi.databinding.Fragment2Binding

class Fragment_2 : Fragment() {
    private lateinit var binding: Fragment2Binding
    //Menyiapkan argument
    val args: Fragment_2Args by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = Fragment2Binding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Menyiapkan
        var myName = args.name
        binding.tvName.text = myName.toString()
        //Memberikan aksi pada btnToFragment1
        binding.btnToFragment1.setOnClickListener {
            this.findNavController()
                .navigate(R.id.action_fragment_2_to_fragment_1)
        }
        binding.btnToFragment3.setOnClickListener {
            this.findNavController()
                .navigate(R.id.action_fragment_2_to_fragment_3)
        }
    }
}

