package com.ntuple.service;

import com.ntuple.model.CoupangDto;
import com.ntuple.utils.CoupangUtils;
import org.springframework.stereotype.Service;

import java.net.URISyntaxException;

@Service
public class CoupangService {
    private final CoupangUtils utils;


    public CoupangService(CoupangUtils utils) {
        this.utils = utils;
    }

//    public ResponseEntity<APIResponse> getAuthorization(CoupangDto.Request req) throws URISyntaxException {
//        CoupangDto.Response response = new CoupangDto.Response();
//        response.setAuthorization(utils.authorizationGenerate(req.getMethod(), req.getUri(), req.getSecretKey(), req.getAccessKey()));
//
//        return ResponseEntity.ok(APIResponseBuilder.buildResponse(ResultMessages.API_SUCCESS, response));
//    }
    public Object getAuthorization(CoupangDto.Request req) throws URISyntaxException {
        CoupangDto.Response response = new CoupangDto.Response();
        response.setAuthorization(utils.authorizationGenerate(req.getMethod(), req.getUri(), req.getSecretKey(), req.getAccessKey()));
        return response;
    }
}
