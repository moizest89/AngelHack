package moizest89.angelhack;

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import java.util.zip.Inflater


/**
 * Created by moizest89 on 7/8/18.
 */

class MainAadapter( context : Context) : RecyclerView.Adapter<MainAadapter.Holder>() {

    var context = context

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Holder =
        Holder( LayoutInflater.from(context).inflate(R.layout.item_main_list, parent, false))



    override fun getItemCount(): Int = 20



    override fun onBindViewHolder(holder: Holder?, position: Int) {

        if (holder !=null){
            if (position % 3 == 0) {
                holder.imageViewUser.setImageResource(R.drawable.profile_1)
            }else if (position % 3 == 1) {
                holder.imageViewUser.setImageResource(R.drawable.profile_2)
            }else if (position % 3 == 2) {
                holder.imageViewUser.setImageResource(R.drawable.profile_3)
            }
            holder.itemView.setOnClickListener {
                context.startActivity( Intent( context , DetailsActivity::class.java))
            }
        }




    }


    class Holder( itemView : View) : RecyclerView.ViewHolder ( itemView ){

        var imageViewUser = itemView.findViewById<ImageView>(R.id.imageViewUser)

    }

}
