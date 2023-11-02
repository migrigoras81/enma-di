/**
 * 
 */
package guru.springframework.sfgdi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

/**
 * Created by Marius I. Grigoras
 * 
 * on 02/11/2023
 */
@ConstructorBinding
@ConfigurationProperties("enma")
public class SfgConstructorConfig {
	private final String username;
	private final String password;
	private final String jdbcurl;

	public SfgConstructorConfig(String username, String password, String jdbcurl) {
		super();
		this.username = username;
		this.password = password;
		this.jdbcurl = jdbcurl;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getJdbcurl() {
		return jdbcurl;
	}

}
