package com.finepointmobile.roomdb2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by danielmalone on 5/29/17.
 */

class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    private List<User> mUsers;

    public MainAdapter(List<User> users) {
        mUsers = users;
    }

    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MainAdapter.ViewHolder holder, int position) {
        holder.mFirstName.setText(mUsers.get(position).getFirstName());
        holder.mLastName.setText(mUsers.get(position).getLastName());
        holder.mEmail.setText(mUsers.get(position).getEmail());
    }

    @Override
    public int getItemCount() {
        return mUsers.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView mFirstName;
        public TextView mLastName;
        public TextView mEmail;

        public ViewHolder(View itemView) {
            super(itemView);

            mFirstName = (TextView) itemView.findViewById(R.id.first_name);
            mLastName = (TextView) itemView.findViewById(R.id.last_name);
            mEmail = (TextView) itemView.findViewById(R.id.email);
        }
    }
}
