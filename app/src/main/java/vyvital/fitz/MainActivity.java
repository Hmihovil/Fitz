package vyvital.fitz;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;




public class MainActivity extends BaseActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setTitle("Fitz");
        findViewById(R.id.polygonWorkout).setOnClickListener(this);
        findViewById(R.id.polygonFood).setOnClickListener(this);
        findViewById(R.id.polygonProgress).setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.polygonWorkout) {
            Intent intent = new Intent(MainActivity.this,BuilderActivity.class);
            startActivity(intent);
        } else if (i == R.id.polygonFood) {
            Toast.makeText(this, "Food Button Pressed", Toast.LENGTH_LONG).show();
        } else if (i == R.id.polygonProgress) {
            Toast.makeText(this, "Progress Button Pressed", Toast.LENGTH_LONG).show();
        } else if (i == R.id.start) {
            Toast.makeText(this, "Start Button Pressed", Toast.LENGTH_LONG).show();
    }}


//    public void vit(View view) {
//        Toast.makeText(this, String.valueOf(view.getId()),
//                Toast.LENGTH_LONG).show();
//    }
}