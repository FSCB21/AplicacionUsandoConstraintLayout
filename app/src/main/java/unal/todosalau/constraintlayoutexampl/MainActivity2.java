package unal.todosalau.constraintlayoutexampl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onClickGoToView (Class viewToGo){
        Intent intent = new Intent(MainActivity2.this, viewToGo);
        startActivity(intent);
    }

    public void goTo1 (View v) {
        this.onClickGoToView(MainActivity.class);
    }
    public void goTo3 (View v) {
        this.onClickGoToView(MainActivity3.class);
    }
}