package com.hencoder.hencoderpracticelayout1;

import android.os.Bundle;
import android.view.Menu;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
  TabLayout tabLayout;
  ViewPager pager;
  List<PageModel> pageModels = new ArrayList<>();

  {
    pageModels.add(
        new PageModel(
            R.layout.sample_square_image_view,
            R.string.title_square_image_view,
            R.layout.practice_square_image_view));
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    pager = findViewById(R.id.pager);
    pager.setAdapter(
        new FragmentPagerAdapter(
            getSupportFragmentManager(),
            FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

          @NonNull
          @Override
          public Fragment getItem(int position) {
            PageModel pageModel = pageModels.get(position);
            return PageFragment.newInstance(pageModel.sampleLayoutRes, pageModel.practiceLayoutRes);
          }

          @Override
          public int getCount() {
            return pageModels.size();
          }

          @Override
          public CharSequence getPageTitle(int position) {
            return getString(pageModels.get(position).titleRes);
          }
        });

    tabLayout = findViewById(R.id.tabLayout);
    tabLayout.setupWithViewPager(pager);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    return super.onCreateOptionsMenu(menu);
  }

  private class PageModel {
    @LayoutRes int sampleLayoutRes;
    @StringRes int titleRes;
    @LayoutRes int practiceLayoutRes;

    PageModel(
        @LayoutRes int sampleLayoutRes, @StringRes int titleRes, @LayoutRes int practiceLayoutRes) {
      this.sampleLayoutRes = sampleLayoutRes;
      this.titleRes = titleRes;
      this.practiceLayoutRes = practiceLayoutRes;
    }
  }
}