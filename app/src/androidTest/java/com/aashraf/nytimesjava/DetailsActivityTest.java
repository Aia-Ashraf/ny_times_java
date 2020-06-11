package com.aashraf.nytimesjava;

import androidx.test.espresso.Espresso;
import androidx.test.rule.ActivityTestRule;

import com.aashraf.nytimesjava.presentation.views.DetailsActivity;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static junit.framework.TestCase.assertTrue;

public class DetailsActivityTest {

    @Rule
    public ActivityTestRule detailsActivityRule = new ActivityTestRule(DetailsActivity.class);

    @Test
    public void backPress() {
        Espresso.pressBackUnconditionally();
        assertTrue(detailsActivityRule.getActivity().isDestroyed());
    }
}
