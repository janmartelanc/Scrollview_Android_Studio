package com.example.scrollviewandroidstudio;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayToast(View view) {
        Toast.makeText(getApplicationContext(), R.string.comment_submitted, Toast.LENGTH_SHORT).show();
    }
}