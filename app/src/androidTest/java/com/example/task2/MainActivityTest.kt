package com.example.task2

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @get:Rule
    var activityRule: ActivityScenarioRule<MainActivity> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun countWords_isCorrect() {
        onView(withId(R.id.editText)).perform(typeText("Hello World"))
        onView(withId(R.id.button)).perform(click())
        onView(withId(R.id.textView2)).check(matches(withText("Count: 2")))
    }

    @Test
    fun countChars_isCorrect() {
        onView(withId(R.id.editText)).perform(typeText("Hello"))
        onView(withId(R.id.button)).perform(click())
        onView(withId(R.id.textView2)).check(matches(withText("Count: 5")))
    }
}