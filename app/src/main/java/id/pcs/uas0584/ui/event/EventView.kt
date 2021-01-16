package id.pcs.uas0584.ui.event

import id.pcs.uas0584.data.model.Event

interface EventView{
    fun showLoading()
    fun hideLoading()
    fun showEventList(data: List<Event>)
}