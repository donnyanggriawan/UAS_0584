package id.pcs.uas0584.ui.favorite

import id.pcs.uas0584.data.db.entities.EventFavorite

interface ClickListener {
    fun onClickListener(eventFavorite: EventFavorite)
}