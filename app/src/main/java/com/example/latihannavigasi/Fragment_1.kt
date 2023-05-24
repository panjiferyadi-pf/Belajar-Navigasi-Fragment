package com.example.latihannavigasi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.latihannavigasi.databinding.Fragment1Binding


class Fragment_1 : Fragment() {

    private lateinit var binding: Fragment1Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = Fragment1Binding.inflate(layoutInflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Memberikan aksi pada btnToFragment2
        binding.btnToFragment2.setOnClickListener {
            val action = Fragment_1Directions.actionFragment1ToFragment2("pa")
            this.findNavController()
                .navigate(action)
        }
        binding.btnToFragment3.setOnClickListener {
            this.findNavController()
                .navigate(R.id.action_fragment_1_to_fragment_3)
        }
    }
}
