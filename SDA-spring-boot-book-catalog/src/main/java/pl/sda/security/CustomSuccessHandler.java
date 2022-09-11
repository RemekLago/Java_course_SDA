package pl.sda.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class CustomSuccessHandler implements AuthenticationSuccessHandler {


    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {

        for (GrantedAuthority grantedAuthority : authentication.getAuthorities()) {

            String authority = grantedAuthority.getAuthority();

            if (authority.equals("ROLE_ADMIN")) {
                new DefaultRedirectStrategy().sendRedirect(request, response, "/admin/panel");
                return;
            } else if (authority.equals("ROLE_USER")) {
                new DefaultRedirectStrategy().sendRedirect(request, response, "/user/panel");
                return;
            } else {
                throw new IllegalStateException("Unrecognized authority " + authority);
            }
        }
    }
}
