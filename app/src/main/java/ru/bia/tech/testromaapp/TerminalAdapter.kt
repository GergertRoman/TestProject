package ru.bia.tech.testromaapp

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class TerminalAdapter(private var items: ArrayList<InfoDto>): RecyclerView.Adapter<TerminalAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent?.context)
            .inflate(R.layout.terminal_item, parent, false)

        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var infoDto = items[position]

        holder?.distance?.text = infoDto.distance
        holder?.city?.text = infoDto.city
        holder?.address?.text = infoDto.address
        holder?.workTime?.text = infoDto.workTime
    }

    class ViewHolder(row: View): RecyclerView.ViewHolder(row) {
        var city: TextView? = null
        var address: TextView? = null
        var distance: TextView? = null
        var workTime: TextView? = null

        init {
            this.city = row?.findViewById(R.id.city)
            this.address = row?.findViewById(R.id.address)
            this.distance = row?.findViewById(R.id.distance)
            this.workTime = row?.findViewById(R.id.workTime)
        }
    }
}