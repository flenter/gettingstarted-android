package com.wercker.gettingstarted;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;


@RunWith(value=RobolectricTestRunner.class)
public class MainActivityTest {
//    private android.widget.TextView results;

//    @Before
//    public void setUp() throws Exception {
//        activity = new MainActivity();
//        activity.onCreate(null);
////        results = activity.findViewById(R.layout.activity_main);
//    }

    @Test
    public void shouldWelcome() throws Exception {
//        String resultsText = results.getText().toString();
//        assertThat(resultsText, equalTo("Hello world!"));
        MainActivity activity;
        activity = (MainActivity) Robolectric.buildActivity(MainActivity.class).create().get();


    }
}