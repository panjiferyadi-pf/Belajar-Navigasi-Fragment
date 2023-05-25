package com.example.latihannavigasi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.latihannavigasi.databinding.Fragment3Binding

class Fragment3 : Fragment() {
        private lateinit var binding: Fragment3Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = Fragment3Binding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnToFragment1.setOnClickListener{
            this.findNavController()
                .navigate(R.id.action_fragment_3_to_fragment_1)
        }

        binding.btnToFragment2.setOnClickListener{
            val action = Fragment3Directions.actionFragment3ToFragment2("panji")
            this.findNavController()
                .navigate(action)
        }
    }

}