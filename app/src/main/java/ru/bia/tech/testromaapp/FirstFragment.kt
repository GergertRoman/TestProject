package ru.bia.tech.testromaapp


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FirstFragment : Fragment() {

    private var recyclerView: RecyclerView? = null

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        recyclerView = view?.findViewById(R.id.rvTerminals1)

        var adapter = TerminalAdapter(generateData())
        val layoutManager = LinearLayoutManager(activity?.applicationContext)
        recyclerView?.layoutManager = layoutManager
        recyclerView?.itemAnimator = DefaultItemAnimator()
        recyclerView?.adapter = adapter
        adapter.notifyDataSetChanged()
    }

    private fun generateData(): ArrayList<InfoDto> {
        var result = ArrayList<InfoDto>()

        for (i in 0..9) {
            var terminal = InfoDto(
                city = "$i",
                address = "10 лет октября",
                distance = "100500 км",
                workTime = "круглосуточно")
            result.add(terminal)
        }

        return result
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

}
