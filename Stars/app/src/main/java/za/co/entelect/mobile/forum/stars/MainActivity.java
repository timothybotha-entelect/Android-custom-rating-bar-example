package za.co.entelect.mobile.forum.stars;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;

public class MainActivity extends AppCompatActivity {

    private RatingBar starRating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        starRating = findViewById(R.id.star_rating);
    }
}