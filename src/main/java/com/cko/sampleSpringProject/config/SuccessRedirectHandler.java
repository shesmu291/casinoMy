package com.cko.sampleSpringProject.config;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Set;

/**
 * Created by whitenoise on 18.08.19.
 */
@Component
public class SuccessRedirectHandler implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest,
                                        HttpServletResponse httpServletResponse,
                                        Authentication authentication) throws IOException, ServletException {
        Set<String> roles = AuthorityUtils.authorityListToSet(authentication.getAuthorities());

        if (roles.contains("ROLE_ADMIN")) {
            httpServletResponse.setStatus(HttpStatus.OK.value());
            httpServletResponse.sendRedirect("/map/test");

        } else if(roles.contains("ROLE_USER")) {
            httpServletResponse.setStatus(HttpStatus.OK.value());
            httpServletResponse.sendRedirect("/map/test");
        }
    }
}