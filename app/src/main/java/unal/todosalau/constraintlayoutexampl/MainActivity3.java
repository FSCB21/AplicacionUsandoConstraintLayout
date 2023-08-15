package unal.todosalau.constraintlayoutexampl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.BounceInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        final TextView tv1 = findViewById(R.id.tvTop);
        final TextView tv2 = findViewById(R.id.tvBottom);

        AnimationSet animationSet = new AnimationSet(true);

        // Animación de traslación (bailar)
        Animation translateAnimation = new TranslateAnimation(0, 0, 0, -50);
        translateAnimation.setDuration(300);
        translateAnimation.setInterpolator(new BounceInterpolator());
        translateAnimation.setRepeatCount(Animation.INFINITE);
        translateAnimation.setRepeatMode(Animation.REVERSE);

        // Crear un conjunto de animaciones y agregar las animaciones
        animationSet.addAnimation(translateAnimation);

        tv1.startAnimation(animationSet);
        tv2.startAnimation(animationSet);
    }

    public void onClickGoToView (Class viewToGo){
        Intent intent = new Intent(MainActivity3.this, viewToGo);
        startActivity(intent);
    }

    public void goTo4 (View v) {
        this.onClickGoToView(MainActivity4.class);
    }
}