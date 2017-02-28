package com.lpp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by tangcheng on 2017/2/28.
 */
@Profile("cors")
@CrossOrigin(origins = {"http://10wan2016.com"}, methods = {RequestMethod.GET, RequestMethod.POST})
@Configuration
public class CorsConfig {
}
