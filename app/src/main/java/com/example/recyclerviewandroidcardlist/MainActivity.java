package com.example.recyclerviewandroidcardlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MovieAdapter adapter;
    ArrayList<Movie> objMovie = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.RecyclerView);

        objMovie.add(new Movie("Squid Game", 8.1, " Drama, Thriller, Horror fiction", "2021", "Hwang Dong-hyuk", "Hundreds of cash-strapped contestants accept an invitation to compete in children's games for a tempting prize, but the stakes are deadly.", R.drawable.squidgame));
        objMovie.add(new Movie("The Medium", 6.7, "Horror, Supernatural", "2021", "Banjong Pisanthanakun", "In the Isan region of Thailand, a shaman realizes that his nephew has been possessed. However, the goddess that appears to have taken possession turns out not be as benevolent as she first appears.", R.drawable.themedium));
        objMovie.add(new Movie("Eternals", 6.8, "Adventure, Action", "2021", "Chloé Zhao", "The Eternals, a race of immortal beings with superhuman powers who have secretly lived on Earth for thousands of years, reunite to battle the evil Deviants.", R.drawable.eternals));
        objMovie.add(new Movie("PerempuanTJ", 6.9, "Horor, Misteri", "2019","Joko Anwar", "Maya jatuh bangun hidup di kota tanpa keluarga, ia hanya memiliki sahabat bernama Dini. Saat usaha bersama mereka membutuhkan modal lebih, Maya yang mendapatkan informasi bahwa dia mungkin memiliki harta warisan dari keluarganya yang kaya di desa, membuatnya pergi mengunjungi kampung halaman yang tak pernah dikenalnya itu. Sesampainya di kampung yang jauh terpencil di tengah hutan, Maya dan Dini sampai di rumah besar yang kosong. Situasi sekitar juga terlihat aneh, salah satunya banyak kuburan anak-anak. Hingga pada suatu malam, Maya mendengar jeritan perempuan yang hendak melahirkan. Maya menuju asal suara dan menyaksikan proses kelahiran anak tersebut. Dari situlah, sedikit demi sedikit, misteri kampung yang kini ditinggali Maya dan Dini mulai terungkap.", R.drawable.perempuantanahjahana));
        objMovie.add(new Movie("Mulan", 5.7, "Action,Adventure", "2020", "Niki Caro", "A girl disguises as a male warrior and joins the imperial army in order to prevent her sick father from being forced to enlist as he has no male heir.", R.drawable.mulan));

        adapter = new MovieAdapter(objMovie);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));




    }
}