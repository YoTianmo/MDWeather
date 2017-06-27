package com.sanousun.mdweather.ui.adapter

import android.content.Context
import android.view.ViewGroup
import com.sanousun.mdweather.R
import com.sanousun.mdweather.model.WeatherForHour
import com.sanousun.mdweather.support.util.changeFormat
import kotlinx.android.synthetic.main.item_hourly_forecast.view.*

/**
 * Created by dashu on 2017/6/24.
 * 小时预报天气列表
 */

class HourlyAdapter(context: Context) :
        BaseAdapter<WeatherForHour, HourlyAdapter.HourlyHolder>(context) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HourlyHolder {
        return HourlyHolder(parent, R.layout.item_hourly_forecast)
    }

    class HourlyHolder(parent: ViewGroup, layoutId: Int) :
            BaseViewHolder<WeatherForHour>(parent, layoutId) {

        override fun bind(t: WeatherForHour) {
            itemView.tv_time.text = t.date.changeFormat("yyyy-MM-dd HH:mm", "HH:mm")
            itemView.iv_weather.text = t.cond.txt
            itemView.tv_temp.text = String.format("%d°", t.tmp)
        }
    }
}