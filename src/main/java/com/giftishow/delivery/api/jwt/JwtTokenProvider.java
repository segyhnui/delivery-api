package com.giftishow.delivery.api.jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.interfaces.Claim;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

// https://imbf.github.io/spring/2020/06/29/Spring-Security-with-JWT.html
public class JwtTokenProvider {

    private final long TOKEN_VALID_MILISECOND = 2L * 60 * 60;   // 2시간

    private static final String SECRET = "ktalpha_common_apiset_auth";

    private UserDetailsService userDetailsService;

    public String createToken(String userPk, List<UserRole> roles) {


    }

}
