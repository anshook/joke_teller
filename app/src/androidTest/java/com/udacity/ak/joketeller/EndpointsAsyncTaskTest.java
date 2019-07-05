package com.udacity.ak.joketeller;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {
    Context context;

    @Test
    public void testAsyncTaskResponse() throws Exception {

        final CountDownLatch countDownLatch = new CountDownLatch(1);
        context = InstrumentationRegistry.getContext();
        EndpointsAsyncTask testTask = new EndpointsAsyncTask() {
            @Override
            protected void onPostExecute(String result) {
                assertNotNull(result);
                if (result != null) {
                    assertTrue(result.length() > 0);
                    countDownLatch.countDown();
                }
            }
        };
        testTask.execute(context);
        countDownLatch.await();
    }
}
