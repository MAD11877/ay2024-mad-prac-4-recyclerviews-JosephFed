package sg.edu.np.mad.madpractical4;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Random;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User("Jay" + new Random().nextInt(999999999),"Jaegan",2,true));
        userList.add(new User("Aaron" + new Random().nextInt(999999999),"Ang",3,false));
        userList.add(new User("Baylee" + new Random().nextInt(999999999),"Boo",4,false));
        userList.add(new User("Ceasar" + new Random().nextInt(999999999),"Cee",5,true));
        userList.add(new User("Daniel" + new Random().nextInt(999999999),"Dan",6,true));
        userList.add(new User("Emily" + new Random().nextInt(999999999),"EE",7,false));
        userList.add(new User("Farah"+ new Random().nextInt(999999999),"Felia",8,true));
        userList.add(new User("Gran" + new Random().nextInt(999999999),"Garden",9,true));
        userList.add(new User("Hamilton" + new Random().nextInt(999999999),"Hills",10,true));
        userList.add(new User("Issac" + new Random().nextInt(999999999),"Iko",11,false));
        userList.add(new User("Kelvin" + new Random().nextInt(999999999),"Klee",12,true));
        userList.add(new User("Larry" + new Random().nextInt(999999999),"Law",13,false));
        userList.add(new User("Megan" + new Random().nextInt(999999999),"Manny",14,true));
        userList.add(new User("Nolan" + new Random().nextInt(999999999),"Nish",15,false));
        userList.add(new User("Oliver" + new Random().nextInt(999999999),"Ollie",16,true));
        userList.add(new User("Patrick" + new Random().nextInt(999999999),"Power",17,false));
        userList.add(new User("Quinn" + new Random().nextInt(999999999),"Quill",18,false));
        userList.add(new User("Russo" + new Random().nextInt(999999999),"Rock",19,true));
        userList.add(new User("Sage" + new Random().nextInt(999999999),"San",20,true));
        userList.add(new User("Taylor" + new Random().nextInt(999999999),"Twist",21,false));

        //Creating recycler view
        UserAdapter userAdapter = new UserAdapter(userList);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager( this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(userAdapter);
    }
}