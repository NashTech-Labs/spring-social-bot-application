package com.example.social.facebook.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class FacebookControllerTest {
    /**
     * Method under test: {@link FacebookController#generateFacebookAuthorizeUrl()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGenerateFacebookAuthorizeUrl() {

        (new FacebookController()).generateFacebookAuthorizeUrl();
    }

    /**
     * Method under test: {@link FacebookController#welcome()}
     */
    @Test
    void testWelcome() {

        List<String> actualWelcomeResult = (new FacebookController()).welcome();
        assertEquals(4, actualWelcomeResult.size());
        assertEquals("http://localhost:8080/generateFacebookAuthorizeUrl", actualWelcomeResult.get(0));
        assertEquals("http://localhost:8080/getUserData", actualWelcomeResult.get(1));
        assertEquals("http://localhost:8080/getUserFeeds", actualWelcomeResult.get(2));
        assertEquals("http://localhost:8080/getUserAlbum", actualWelcomeResult.get(3));
    }

    /**
     * Method under test: {@link FacebookController#generateFacebookAccessToken(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGenerateFacebookAccessToken() {
        // TODO: Complete this test.

        (new FacebookController()).generateFacebookAccessToken("Code");
    }

}

