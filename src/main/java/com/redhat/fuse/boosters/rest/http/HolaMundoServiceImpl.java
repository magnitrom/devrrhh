package com.redhat.fuse.boosters.rest.http;

import org.apache.camel.Header;
import org.springframework.stereotype.Service;

@Service("holaMundoService")
public class HolaMundoServiceImpl implements HolaMundoService {


    public String getHolaMundo(@Header("name") String name){
        return "Holas "+ name;
    }

}