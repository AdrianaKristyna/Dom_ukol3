package com.example.adriana.dom_ukol3;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    public ArrayList<Filmy> filmies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        filmies = new ArrayList<>();

        filmies.add(new Filmy("https://img.csfd.cz/files/images/film/posters/163/395/163395379_ce92c5.jpg?h180","Joker","TDrama","50%","Film plný akce a dobrodružství."));
        filmies.add(new Filmy("https://img.csfd.cz/files/images/film/posters/159/449/159449437_a390fe.jpg?h180","Mumie","Fantasy","78%","Dvacátá léta 20. století byla zlatou érou dobrodruhů a Egypt jejich zaslíbenou zemí. Za tajemstvím zmizelého města Hamunaptry, pokladem faraonů a Knihou mrtvých se ve variaci na Indiana Jonese vydávají pohledný dobrodruh Rick, krásná egyptoložka Evelyn a její poněkud výstřední bratr Jonathan"));
        filmies.add(new Filmy("https://img.csfd.cz/files/images/film/posters/163/331/163331159_805349.png?h180","Rbitov zviratek","horor","78%","Doktor Louis Creed (Jason Clarke) se s manželkou a dvěma dětmi přestěhoval z velkoměsta na venkov, do velkého domu na kraji lesa. V něm se ukrývá hřbitov domácích mazlíčků"));
        filmies.add(new Filmy("https://img.csfd.cz/files/images/film/posters/163/287/163287469_5deb40.png?h180","Horor","40%","film plny hratek","Adelaide Wilsonová (Lupita Nyong'o) přijíždí s manželem a dvěma dětmi na prázdninový pobyt na chatu na kalifornském pobřeží, kde jako malá trávila léto. Na první pohled vyrovnaná a spokojená žena v sobě skrývá velké trauma z dětství a hned po příjezdu v ní řetězec zdánlivě nevinných událostí vyvolává silnou paranoiu a pocit, že rodinná idyla brzy skončí. "));


        Adapter adapter = new Adapter(this, filmies);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
        //kdyz kliknme na jakykoliv item tak nas to odkaze na toast
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, filmies.get(position).name,
                        Toast.LENGTH_LONG).show();

                //zde podminka
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("data", filmies.get(position));
                MainActivity.this.startActivity(intent);
            }
        });


    }
}
