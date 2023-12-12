package com.example.aboutus;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        // Vous pouvez ajouter ici du code supplémentaire si nécessaire
    }

    // Méthode pour envoyer un e-mail
    public void sendEmail(View view) {
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                "mailto", "contact@nomdelapplication.com", null));
        startActivity(Intent.createChooser(emailIntent, "Envoyer un e-mail"));
    }

    // Méthode pour ouvrir le profil GitHub
    public void openGitHub(View view) {
        String url = "https://github.com/hajarhamdaoui";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }



}
