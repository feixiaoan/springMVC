package com.xiaofei.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.UUID;

/**
 * <Description> <br>
 *文件上传控制
 * @author 小飞<br>
 * @version 1.0<br>
 * @createDate 2019/05/25<br>
 * @see com.xiaofei.controller <br>
 */
@Controller
@RequestMapping("/file")
public class FileUploadController {
    /**
     * 文件上传
     * @return
     */
    @RequestMapping("/fileUpload1")
    public String fileUpload1(HttpServletRequest request) throws Exception {
        System.out.println("文件上传成功");
        //使用fileupload组件进行文件上传
        //上传的位置
        String path = request.getSession().getServletContext().getRealPath("/uploads/");
        //判断路径是否存在
        File file = new File(path);
        if(!file.exists()) {
            //创建文件
            file.mkdirs();
        }
        //解析request对象，获取上传文件项
        DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(diskFileItemFactory);
        //解析request对象
        List<FileItem> items = upload.parseRequest(request);
        //遍历
        for(FileItem item : items) {
            //进行判断，当前对象是否是上传文件项
            if(item.isFormField()){
                //说明普通表单项
            }else {
                //说明上传文件项
                //获取上传文件的名称
                String name = item.getName();
                //把文件名设置为唯一值，uuid
                String uuid = UUID.randomUUID().toString().replace("_", "");
                name = uuid + "_" + name;
                //完成上传文件
                item.write(new File(path,name));
                //删除临时文件
                item.delete();
            }
        }
        return "success";
    }

    /**
     * springmvc的文件上传
     * @return
     */
    @RequestMapping("/fileUpload2")
    public String fileUpload2(HttpServletRequest request , MultipartFile upload) throws Exception {
        System.out.println("springMVC的文件上传");
        //使用fileupload组件进行文件上传
        //上传的位置
        String path = request.getSession().getServletContext().getRealPath("/uploads/");
        //判断路径是否存在
        File file = new File(path);
        if(!file.exists()) {
            //创建文件
            file.mkdirs();
        }
        //说明上传文件项
        //获取上传文件的名称
        String name = upload.getOriginalFilename();
        //把文件名设置为唯一值，uuid
        String uuid = UUID.randomUUID().toString().replace("_", "");
        name = uuid + "_" + name;
        //完成上传文件
        upload.transferTo(new File(path,name));
        return "success";
    }

    /**
     * 文件上传之跨服器上传
     * @param upload
     * @return
     * @throws Exception
     */
    @RequestMapping("/fileUpload3")
    public String fileUpload3(MultipartFile upload) throws Exception {
        System.out.println("文件跨服器上传");
        //定义上传文件服务器路径
        String path = "http://localhost:9090/uploads/";
        //说明上传文件项
        //获取上传文件的名称
        String name = upload.getOriginalFilename();
        //把文件名设置为唯一值，uuid
        String uuid = UUID.randomUUID().toString().replace("_", "");
        name = uuid + "_" + name;
        //完成上传文件，跨服器上传
        //创建客户端对象
        Client client = Client.create();
        //和图片服务器进行连接
        WebResource webResource = client.resource(path + name);
        //文件上传
        webResource.put(upload.getBytes());
        return "success";
    }

}
