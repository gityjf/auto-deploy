package com.git.jersey;

import com.git.response.ResponseInfo;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;


@Provider
public class GlobalExceptionDeal implements ExceptionMapper<Exception> {

    @Override
    public Response toResponse(Exception e) {
        e.printStackTrace();
        return Response.ok(new ResponseInfo("ERROR","服务异常"), MediaType.APPLICATION_JSON).build();
    }
}
