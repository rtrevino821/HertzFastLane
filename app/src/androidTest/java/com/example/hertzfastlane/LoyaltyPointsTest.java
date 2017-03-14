package com.example.hertzfastlane;

import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.anyOf;

/**
 * Created by stevenjoy on 3/13/17.
 */

@RunWith(AndroidJUnit4.class)

public class LoyaltyPointsTest {

    @Rule
    public IntentsTestRule<LoginActivity> nLoginRule =
            new IntentsTestRule<LoginActivity>(LoginActivity.class);

    @Test
    public void testLoyalyPoints() throws Exception {


        onView(withId(R.id.et_Username)).perform(typeText("dpike15")).perform(ViewActions.closeSoftKeyboard());
        onView(withId(R.id.et_Password)).perform(typeText("test")).perform(ViewActions.closeSoftKeyboard());
        onView(withId(R.id.b_Login)).perform(click());

//        int x = getLoyaltyPoints();
//        Member member =LoginActivity.getMember();
//        Log.d("Tag", String.valueOf(member.getLoyaltyPoints()));

        onView(withId(R.id.tvPoints)).check(matches(isDisplayed()));
       // onView(withId(R.id.tvPoints)).check(matches(withText(String.valueOf(member.getLoyaltyPoints()))));

    }
}
