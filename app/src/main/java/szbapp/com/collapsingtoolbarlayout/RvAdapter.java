package szbapp.com.collapsingtoolbarlayout;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class RvAdapter extends RecyclerView.Adapter<RvAdapter.ViewHodler> {

    @Override
    public ViewHodler onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_layout, parent,
                false);
        return new ViewHodler(inflate);
    }

    @Override
    public void onBindViewHolder(ViewHodler holder, int position) {
        holder.tv.setText("" + position + "!");
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    static class ViewHodler extends RecyclerView.ViewHolder {
        TextView tv ;

        public ViewHodler(View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.tv_nums);
        }
    }
}
