package com.mukesh.sidenavbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Notification;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {


    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;
    boolean doubleBackToExit = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        dl = (DrawerLayout) findViewById(R.id.activity_main);
        t = new ActionBarDrawerToggle(this, dl, R.string.Open, R.string.Close);

        dl.addDrawerListener(t);
        t.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle(R.string.app_name);

        nv = (NavigationView) findViewById(R.id.nev);
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch (id) {
                    case R.id.dashboard:
//                        Intent dashboard = new Intent(DashBoard.this, DashBoard.class);
//                        startActivity(dashboard);
                        dl.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_my_profile:
//                        Intent members = new Intent(DashBoard.this, MyProfile.class);
//                        startActivity(members);
                        dl.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_my_booking:
//                        Intent myprofile = new Intent(DashBoard.this, MyBooking.class);
//                        startActivity(myprofile);
                        dl.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_account:
//                        Intent m = new Intent(DashBoard.this, Accounts.class);
//                        startActivity(m);
                        dl.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_refer:
//                        Intent manageservice = new Intent(DashBoard.this, ReferEarn.class);
//                        startActivity(manageservice);
                        dl.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_change_password:
//                        Intent managebanner = new Intent(DashBoard.this, ChangePassword.class);
//                        startActivity(managebanner);
                        dl.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_notification:
//                        Intent managebooking = new Intent(DashBoard.this, Notification.class);
//                        startActivity(managebooking);
                        dl.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_FAQ:
//                        Intent account = new Intent(DashBoard.this, Faq.class);
//                        startActivity(account);
                        dl.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_Support:
//                        Intent changepassword = new Intent(DashBoard.this, Support.class);
//                        startActivity(changepassword);
                        dl.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_Logout:
//                        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(DashBoard.this);
//                        builder.setCancelable(false);
//                        builder.setMessage(R.string.logoutMsg);
//                        builder.setTitle("");
//                        builder.setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
//
//                            public void onClick(DialogInterface dialog, int which) {
//                                Intent intent = new Intent(DashBoard.this, Login.class);
//                                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
//                                startActivity(intent);
//                                finish();
//
//                            }
//                        });
//                        builder.setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
//
//                            public void onClick(DialogInterface dialog, int which) {
//                                dialog.dismiss();
//                            }
//                        });
//
//                        android.app.AlertDialog alert = builder.create();
//                        alert.show();
                        break;
                    default:
                        return true;
                }


                return true;

            }
        });


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (t.onOptionsItemSelected(item))
            return true;

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        if(doubleBackToExit){
            super.onBackPressed();
            return;
        }

        this.doubleBackToExit = true;
        Toast.makeText(this, "Please Click Back again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                doubleBackToExit=false;
            }
        },2000);
    }
}