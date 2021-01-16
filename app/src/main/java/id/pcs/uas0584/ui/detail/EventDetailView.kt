package id.pcs.uas0584.ui.detail


import id.pcs.uas0584.data.model.EventDetail

interface EventDetailView{
    fun showLoading()
    fun hideLoading()
    fun showEventDetail(data: List<EventDetail>)
}