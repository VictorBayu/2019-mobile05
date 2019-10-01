package polinema.ac.id.starterchapter05.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.fragments.dips;
import polinema.ac.id.starterchapter05.fragments.handstand;
import polinema.ac.id.starterchapter05.fragments.push_up;

public class TugasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas);
    }

    public void handlerPushUp(View view) {
        push_up pushUp = (push_up)getSupportFragmentManager().findFragmentByTag("fragment_push_up");
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        if (pushUp != null && pushUp.isVisible()){
            //no action
        }else {
            ft.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_from_left, R.anim.enter_from_left, R.anim.exit_from_right);
            ft.replace(R.id.frameLayout4, new push_up(), "fragment_push_up");
            ft.addToBackStack(null);
            ft.commit();
        }
    }

    public void handlerDips(View view) {
        dips Dips = (dips) getSupportFragmentManager().findFragmentByTag("fragment_dips");
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        if (Dips != null && Dips.isVisible()){
            //no action
        }else {
            ft.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_from_left, R.anim.enter_from_left, R.anim.exit_from_right);
            ft.replace(R.id.frameLayout4, new dips(), "fragment_dips");
            ft.addToBackStack(null);
            ft.commit();
        }
    }

    public void handlerHandstand(View view) {
        handstand hs = (handstand)getSupportFragmentManager().findFragmentByTag("fragment_handstand");
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        if(hs != null && hs.isVisible())
        {
            //no action
        }else{
            ft.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_from_left, R.anim.enter_from_left, R.anim.exit_from_right);
            ft.replace(R.id.frameLayout4,new handstand(),"fragment_hanstand");
            ft.addToBackStack(null);
            ft.commit();
        }
    }
}
