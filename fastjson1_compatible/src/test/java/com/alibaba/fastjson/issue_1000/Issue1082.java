package com.alibaba.fastjson.issue_1000;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import junit.framework.TestCase;

/**
 * Created by wenshao on 17/03/2017.
 */
public class Issue1082 extends TestCase {
    public void test_for_issue() throws Exception {
        Throwable error = null;
        try {
            Model_1082 m = (Model_1082) JSON.parseObject("{}", Model_1082.class);
        } catch (JSONException | com.alibaba.fastjson2.JSONException ex) {
            error = ex;
        }
        assertNotNull(error);
    }

    public void f() {

    }

    public class Model_1082 {
        public Model_1082() {
            Issue1082.this.f();
        }
    }
}