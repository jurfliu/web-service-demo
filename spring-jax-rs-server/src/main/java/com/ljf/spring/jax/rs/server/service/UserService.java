package com.ljf.spring.jax.rs.server.service;

import com.ljf.spring.jax.rs.server.model.BeiJingUser;

import javax.ws.rs.*;
import java.util.List;
@Path("/bjService")  // 路径；访问当前服务接口时候的路径。
@Produces("*/*")
public interface UserService {
    @POST
    @Path("/bjUser")	  // 路径； 访问当前服务接口的方法路径
    // @Consumes 服务端支持的请求的数据格式(xml、json)
    @Consumes({ "application/xml", "application/json" })
    public void saveUser(BeiJingUser user);

    @PUT
    @Path("/bjUser")
    @Consumes({ "application/xml", "application/json" })
    public void updateUser(BeiJingUser user);

    @GET
    @Path("/bjUser")
    // @Produces 服务端支持的响应的数据格式
    @Produces({ "application/xml", "application/json" })
    public List<BeiJingUser> findAllUsers();

    @GET
    @Path("/bjUser/{id}")
    @Consumes("application/xml")
    @Produces({ "application/xml", "application/json" })
    public BeiJingUser finUserById(@PathParam("id") Integer id);

    @DELETE
    @Path("/bjUser/{id}")
    @Consumes({"application/xml", "application/json"})
    public void deleteUser(@PathParam("id") Integer id);
}
