package com.heosoft.recyclerviewex7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.heosoft.recyclerviewex7.adapter.UserAdapter;
import com.heosoft.recyclerviewex7.model.User;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1- Recyclerview
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        //2- Datasource
        List<User> userList= new ArrayList<>();
        for (int i = 1; i <= 20; i++){
            userList.add(new User(i, "Username 0" + i));
        }

        //3- Adapter
        UserAdapter userAdapter = new UserAdapter(userList);

        recyclerView.setAdapter(userAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}