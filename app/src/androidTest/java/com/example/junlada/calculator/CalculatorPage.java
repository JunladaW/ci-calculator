package com.example.junlada.calculator;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

//Example Page Object Pattern
public class CalculatorPage {
    public static void inputNumber (String input){
        onView(withId(Integer.parseInt(input)))
                .perform(replaceText(input)
                        , closeSoftKeyboard());
    }
}


