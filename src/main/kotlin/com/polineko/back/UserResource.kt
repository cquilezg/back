package com.polineko.back

import jakarta.annotation.security.PermitAll
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import lombok.RequiredArgsConstructor
import lombok.extern.slf4j.Slf4j
import org.jboss.resteasy.reactive.RestResponse

@Path("/")
@RequiredArgsConstructor
@Slf4j
class UserResource {

    @GET
    @PermitAll
    fun helloWorld(): RestResponse<String> {
        return RestResponse.status(RestResponse.Status.OK, "Hello world!")
    }
}
