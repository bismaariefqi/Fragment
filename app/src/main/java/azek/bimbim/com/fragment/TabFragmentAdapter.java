package azek.bimbim.com.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import azek.bimbim.com.fragment.Fragment.Tab1Fragment;

/**
 * Created by user on 11/13/2017.
 */

public class TabFragmentAdapter  extends FragmentPagerAdapter{


    public TabFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment;
        switch (position){
            case 0 :
                fragment=new Tab1Fragment();
                break;
            case 1 :
                fragment=new Tab1Fragment();
                break;
            case 2 :
                fragment=new Tab1Fragment();
                break;
            default :
                fragment=null;
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
