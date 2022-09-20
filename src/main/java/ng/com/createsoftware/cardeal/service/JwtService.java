package ng.com.createsoftware.cardeal.service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.security.Key;
import java.util.Date;

@Component
public class JwtService {

    static final long EXPIRATIONTIME = 86400000;//1 day in ms
    static final String PREFIX = "Bearer";


//    @Value("${ng.com.createsoftware.secretkey}")
//    private String key;
  static final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256) ;


    //generate signed JWT token
    public String getToken(String username){
        String token = Jwts.builder()
                .setSubject(username)
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATIONTIME))
                .signWith(key).compact();

        return token;
    }

//    get a token from request authorization header
    //verify a token and get username

    public String getAuthUser(HttpServletRequest request){
        String token = request.getHeader(HttpHeaders.AUTHORIZATION);

        if(token != null){
            String user = Jwts.parserBuilder()
                    .setSigningKey(key)
                    .build()
                    .parseClaimsJws(token.replace(PREFIX, ""))
                    .getBody()
                    .getSubject();

            if(user != null)return user;
        }
        return null;

    }
}
