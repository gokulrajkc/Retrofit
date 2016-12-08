package com.example.gokulrajkumar.github;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by gokulrajkumar on 05/11/16.
 */
public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder>{

    private List<User.ContactsBean> ItemsBean;


    public UserAdapter(List<User.ContactsBean> itemsBean) {
        ItemsBean = itemsBean;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.eachrowlayout,parent,false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.txtVw_name.setText(ItemsBean.get(position).getName());
        holder.txtVw_email.setText(ItemsBean.get(position).getEmail());
        holder.txtVw_phoneNo.setText(ItemsBean.get(position).getPhone().getMobile());

    }

    @Override
    public int getItemCount() {
        return ItemsBean.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView txtVw_name,txtVw_email,txtVw_phoneNo;

        public MyViewHolder(View itemView) {

            super(itemView);

            txtVw_name = (TextView) itemView.findViewById(R.id.txtVw_name);
            txtVw_email = (TextView) itemView.findViewById(R.id.txtVw_email);
            txtVw_phoneNo = (TextView) itemView.findViewById(R.id.txtVw_phoneNo);
        }
    }

}
