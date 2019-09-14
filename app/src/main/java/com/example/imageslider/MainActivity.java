package com.example.imageslider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private String[] imageUrls = new String[]{
            "https://c.ndtvimg.com/2019-01/m7ak3qj8_steve-smith-afp_625x300_05_January_19.jpg",
            "https://imageresizer.static9.net.au/UuMBnWPziN8OP-ZzHM1KopAekwA=/http%3A%2F%2Fprod.static9.net.au%2F_%2Fmedia%2F2018%2F12%2F16%2F16%2F55%2F1612_kohli_env.jpg",
            "https://imagevars.gulfnews.com/2019/06/06/India-s-Jasprit-Bumrah_16b2cba48cf_large.jpg",
            "https://www.cricket.com.au/~/-/media/News/2017/05/31patcummins.ashx?w=1600",
            "https://images.firstpost.com/wp-content/uploads/2018/04/Kagiso-Rabada_AFP_opt-1.jpg",
            "http://www.espncricinfo.com/db/PICTURES/CMS/215300/215341.jpg",
            "https://www.barraques.cat/pngfile/big/67-674803_dhoni-ms-dhoni-hit-helicopter-shot.jpg",
            "http://www2.pictures.zimbio.com/gi/Trent+Boult+New+Zealand+Vs+England+3rd+ODI+maTtfhN9lcBl.jpg",
            "https://www.abc.net.au/news/image/7092070-3x2-940x627.jpg",
            "https://spiderimg.amarujala.com/assets/images/2016/12/02/r-ashwin_1480653738.jpeg",
            "https://thesportsrush.com/wp-content/uploads/2019/07/jadeja-celeb.png",
            "https://img.bleacherreport.net/img/slides/photos/003/516/297/459674279-jacques-kallis-of-south-africa-celebrates-his-45th_crop_exact.jpg?w=2975&h=2048&q=85",
            "https://www.abc.net.au/news/image/6270070-3x2-940x627.jpg"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = findViewById(R.id.view_pager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(this, imageUrls);
        viewPager.setAdapter(adapter);
    }
}
