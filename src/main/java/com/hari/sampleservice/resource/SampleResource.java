package com.hari.sampleservice.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

/**
 * @author HariomYadav
 * @since 11/10/20
 */
@RestController
@RequestMapping("/v1/api")
@Slf4j
public class SampleResource {

    @RequestMapping(method = RequestMethod.GET)
    public String get() {
        System.err.println("SampleResource.get");
        return "SampleResource.get";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String post() {
        System.err.println("SampleResource.post");
        return "SampleResource.post";
    }

}
