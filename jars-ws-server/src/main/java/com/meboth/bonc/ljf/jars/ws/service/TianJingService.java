package com.meboth.bonc.ljf.jars.ws.service;

import com.meboth.bonc.ljf.jars.ws.model.People;

import javax.ws.rs.*;
import java.util.List;

@Path("/tjService")  // 路径；访问当前服务接口时候的路径。
@Produces("*/*")
public interface TianJingService {
    @POST
    @Path("/tjUser")	  // 路径； 访问当前服务接口的方法路径
    // @Consumes 服务端支持的请求的数据格式(xml、json)
    @Consumes({ "application/xml", "application/json" })
    public void saveUser(People user);

    @PUT
    @Path("/tjUser")
    @Consumes({ "application/xml", "application/json" })
    public void updateUser(People user);

    @GET
    @Path("/tjUser")
    // @Produces 服务端支持的响应的数据格式
    @Produces({ "application/xml", "application/json" })
    public List<People> findAllUsers();

    @GET
    @Path("/tjUser/{id}")
    @Consumes("application/xml")
    @Produces({ "application/xml", "application/json" })
    public People finUserById(@PathParam("id") Integer id);

    @DELETE
    @Path("/tjUser/{id}")
    @Consumes({"application/xml", "application/json"})
    public void deleteUser(@PathParam("id") Integer id);
}

