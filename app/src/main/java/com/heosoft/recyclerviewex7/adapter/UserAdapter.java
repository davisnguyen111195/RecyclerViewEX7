package com.heosoft.recyclerviewex7.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.heosoft.recyclerviewex7.R;
import com.heosoft.recyclerviewex7.model.User;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder>{
    private List<User> userList;

    public UserAdapter(List<User> userList) {
        this.userList = userList;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user = userList.get(position);
        holder.txtUserName.setText(user.getUserName());
        holder.txtUserID.setText(String.valueOf(user.getUserID()));
    }

    @Override
    public int getItemCount() {
        if(userList != null) {
            return userList.size();
        }
        return 0;
    }

    public static class UserViewHolder extends RecyclerView.ViewHolder{
        TextView txtUserID, txtUserName;
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            txtUserID  = itemView.findViewById(R.id.txtUserId);
            txtUserName = itemView.findViewById(R.id.txtUsername);
        }
    }
}
