package com.example.junlada.calculator;

import android.app.Activity;
import android.support.test.rule.ActivityTestRule;
import com.example.junlada.calculator.MainActivity;
import com.example.junlada.calculator.R;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

import tools.fastlane.screengrab.Screengrab;
import tools.fastlane.screengrab.UiAutomatorScreenshotStrategy;
import tools.fastlane.screengrab.locale.LocaleTestRule;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

import static org.junit.Assert.*;

public class MainActivityTest {


    @ClassRule
    public static final LocaleTestRule localeTestRule =
            new LocaleTestRule();

    //open activity
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void plus_1_and_1_should_result_2() {
        Screengrab.setDefaultScreenshotStrategy(new UiAutomatorScreenshotStrategy());
      //  CalculatorPage.inputNumber1(1);

        onView(withId(R.id.edt_input1))
                .perform(replaceText("1")
                        , closeSoftKeyboard());

        Screengrab.screenshot("step01");

        onView(withId(R.id.btn_add))
                .perform(click());

        onView(withId(R.id.edt_input2))
                .perform(replaceText("1")
                        , closeSoftKeyboard());

        Screengrab.screenshot("step02");

        onView(withId(R.id.btn_calculor))
                .perform(click());

        onView(withId(R.id.txt_result))
                .check(matches(withText("Result = 2")));

        Screengrab.screenshot("step03");
    }
}