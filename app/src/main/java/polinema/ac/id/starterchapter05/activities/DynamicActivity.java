package polinema.ac.id.starterchapter05.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.fragments.BlueFragment;
import polinema.ac.id.starterchapter05.fragments.RedFragment;

public class DynamicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic);
    }

    public void handlerClickLoadRedFragment(View view) {
//        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
//        fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
//        fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new RedFragment());
//        fragmentTransaction.addToBackStack(null);
//        fragmentTransaction.commit();
        RedFragment  redFragment = (RedFragment)getSupportFragmentManager().findFragmentByTag("red_fragment");
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if (redFragment != null && redFragment.isVisible()){
            //fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_from_left, R.anim.enter_from_left, R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.dynamic_fragment_placeholder, new RedFragment(), "red_fragment");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handlerClickLoadBlueFragment(View view) {
//        FragmentTransaction fragmentTransaction = getSupportFragmentManagerSupportFragmentManager().beginTransaction();
//        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
//        fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
//        fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new BlueFragment());
//        fragmentTransaction.addToBackStack(null);
//        fragmentTransaction.commit();
        BlueFragment  blueFragment = (BlueFragment)getSupportFragmentManager().findFragmentByTag("blue_fragment");
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if (blueFragment != null && blueFragment.isVisible()){
            //fragmentTransaction.commit();
        }else{
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new BlueFragment(),"blue_fragment");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
