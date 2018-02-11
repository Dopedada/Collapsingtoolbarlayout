package szbapp.com.collapsingtoolbarlayout;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;


public class BaseAdapter extends BaseQuickAdapter<Bean,BaseViewHolder> {


    public BaseAdapter( @Nullable List<Bean> data) {
        super(R.layout.item_rv_layout, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, Bean item) {
        helper.setText(R.id.tv_nums,"" + helper.getLayoutPosition());
    }
}
