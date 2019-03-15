package com.example.acer.pixabay;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    ProgressBar progressBar;
    ArrayList<ImageModels> imageModels;
    Context context;
    String imageurl="https://pixabay.com/api/?key=10850293-beb2bf524b904f5509c8eb1b8&q=";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar=findViewById(R.id.bar);
        rv=findViewById(R.id.recycler);
        context=this;
        imageModels=new ArrayList<>();
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new MyAdapter((MainActivity) context,imageModels));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.option_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.flower:

                boolean connected = false;
                ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
                if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    //we are connected to a network
                    Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
                    new PixabayAPi().execute(imageurl+"Flowers");
                    connected = true;
                }
                else
                    Toast.makeText(this, "Oops! no internet", Toast.LENGTH_SHORT).show();



                break;

            case R.id.bird:
                connected = false;
                connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    //we are connected to a network
                    Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
                    new PixabayAPi().execute(imageurl+"Cites");
                    connected = true;
                }
                else
                    Toast.makeText(this, "Oops no internet", Toast.LENGTH_SHORT).show();

                break;


            case R.id.car:
                connected = false;
                connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    //we are connected to a network
                    Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
                    new PixabayAPi().execute(imageurl+"Universities");
                    connected = true;
                }
                else
                    Toast.makeText(this, "Oops no internet", Toast.LENGTH_SHORT).show();

                break;

            case R.id.hero:
                connected = false;
                connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    //we are connected to a network
                    Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
                    new PixabayAPi().execute(imageurl+"Chocolates");
                    connected = true;
                }
                else
                    Toast.makeText(this, "Oops no internet", Toast.LENGTH_SHORT).show();

                break;
            case R.id.pizza:
                connected = false;
                connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    //we are connected to a network
                    Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
                    new PixabayAPi().execute(imageurl+"Pizzas");
                    connected = true;
                }
                else
                    Toast.makeText(this, "Oops no internet", Toast.LENGTH_SHORT).show();

                break;
            case R.id.ice:
                connected = false;
                connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    //we are connected to a network
                    Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
                    new PixabayAPi().execute(imageurl+"IceCreams");
                    connected = true;
                }
                else
                    Toast.makeText(this, "Oops no internet", Toast.LENGTH_SHORT).show();

                break;

            case R.id.doll:
                connected = false;
                connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    //we are connected to a network
                    Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
                    new PixabayAPi().execute(imageurl+"Dolls");
                    connected = true;
                }
                else
                    Toast.makeText(this, "Oops no internet", Toast.LENGTH_SHORT).show();

                break;

            case R.id.teddy:
                connected = false;
                connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    //we are connected to a network
                    Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
                    new PixabayAPi().execute(imageurl+"TeddyBears");
                    connected = true;
                }
                else
                    Toast.makeText(this, "Oops no internet", Toast.LENGTH_SHORT).show();

                break;

            case R.id.foods:
                connected = false;
                connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    //we are connected to a network
                    Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
                    new PixabayAPi().execute(imageurl+"FastFoods");
                    connected = true;
                }
                else
                    Toast.makeText(this, "Oops no internet", Toast.LENGTH_SHORT).show();

                break;

            case R.id.cosmetics:
                connected = false;
                connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    //we are connected to a network
                    Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
                    new PixabayAPi().execute(imageurl+"Cosmetics");
                    connected = true;
                }
                else
                    Toast.makeText(this, "Oops no internet", Toast.LENGTH_SHORT).show();

                break;
        }
        return super.onOptionsItemSelected(item);

    }


    class PixabayAPi extends AsyncTask<String,Void,String> {


        @Override
        protected void onPreExecute() {
            imageModels.clear();
            rv.setAdapter(new MyAdapter((MainActivity) context,imageModels));
            progressBar.setVisibility(View.VISIBLE);

            super.onPreExecute();
        }

        @Override
        protected String doInBackground(String... strings) {

            try {
                URL url = new URL(strings[0]);
                Log.i("imageurl", String.valueOf(url));
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.connect();
                InputStream inputStream = httpURLConnection.getInputStream();
                Scanner scanner = new Scanner(inputStream);
                scanner.useDelimiter("\\A");
                if (scanner.hasNext()) {
                    return scanner.next();
                } else {
                    return null;
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }


        @Override
        protected void onPostExecute(String s) {
            progressBar.setVisibility(View.GONE);
            super.onPostExecute(s);

            if (s!=null){
                try {
                    JSONObject jsonObject = new JSONObject(s);
                    JSONArray jsonArray = jsonObject.getJSONArray("hits");
                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject hits = jsonArray.getJSONObject(i);
                        String likes = hits.getString("likes");
                        Log.i("imageurl",likes);
                        String views = hits.getString("views");
                        Log.i("imageurl",views);
                        String download = hits.getString("downloads");
                        Log.i("imageurl",download);
                        String imageurl = hits.getString("largeImageURL");
                        Log.i("imageurl",imageurl);
                        imageModels.add(new ImageModels(likes, views, download, imageurl));


                    }

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

        }


    }

}
