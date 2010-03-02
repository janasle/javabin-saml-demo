package org.corporation.bank.web;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.saml.SAMLCredential;
import org.springframework.security.saml.userdetails.SAMLUserDetailsService;

import java.util.Arrays;

public class UserDetailsService implements SAMLUserDetailsService {
    @Override
    public org.springframework.security.core.userdetails.UserDetails loadUserBySAML(SAMLCredential samlCredential) throws UsernameNotFoundException {
        return new User(samlCredential.getAuthenticationAssertion().getSubject().getNameID().toString(),
                        "PASSWORD",
                        true,
                        true,
                        true,
                        true,
                        Arrays.asList((GrantedAuthority)new GrantedAuthorityImpl("ROLE_USER")));
    }
}
