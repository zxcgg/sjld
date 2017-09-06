package cn.cwx521.controller;

import cn.cwx521.pojo.Upload;
import cn.cwx521.service.UploadService;

import java.net.URLEncoder;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@Controller
public class upload {
    @Autowired
    private UploadService uploadService;

    //多文件上传
//    public String login(@Validated User user, BindingResult br, Model model,@RequestParam("file") MultipartFile[] file){
//        if (br.hasErrors()){
//            return "user/login";
//        }
//        //这里对文件进行遍历
//        for (MultipartFile mul:file){
//            //分别获取的是变量名file---文件类型---文件名
//            System.out.println(mul.getName()+"---"+mul.getContentType()+"---"+mul.getOriginalFilename());
//            try {
//                if (!mul.isEmpty()){
//                    Streams.copy(mul.getInputStream(),new FileOutputStream("E:/temp/"+mul.getOriginalFilename()),true);
//                }
//            } catch (IOException e) {
//                System.out.println("文件上传失败");
//                e.printStackTrace();
//            }
//        }
//        System.out.println(user.toString());
//        return "user/login";
    @RequestMapping(value = "/up", method = RequestMethod.POST)
    @ResponseBody

    public String upload(MultipartFile file, HttpServletRequest request, Upload upload) {
        String path = request.getSession().getServletContext().getRealPath("/") + "WEB-INf\\upload";//设置文件上传路径
        String filName = file.getOriginalFilename();//获取文件名字
//        String filName1=file.getName();//获取name属性
        File dir = new File(path, filName);//创建文件路径和名
        try {
            if (!dir.exists()) {//不存在则创建
                dir.mkdirs();
            }
            if (uploadService.insertFile(filName) != 1) {
                return "fail";
            }
            file.transferTo(dir);

            return "success";
        } catch (Exception e) {
            return "fail";
        }


    }

    @RequestMapping(value = "/down",method = RequestMethod.GET)
    public ResponseEntity<byte[]> download(HttpServletRequest request) throws IOException {
//                指定文件,必须是绝对路径
        String str = request.getSession().getServletContext().getRealPath("/") + "WEB-INf\\upload\\loading.gif";
        File file = new File(str);
//                下载浏览器响应的那个文件名
        String dfileName = "loading.gif";
//                下面开始设置HttpHeaders,使得浏览器响应下载
        HttpHeaders headers = new HttpHeaders();
//                设置响应方式
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
//                设置响应文件
        headers.setContentDispositionFormData("attachment", dfileName);
//                把文件以二进制形式写回
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);

//    public String download(HttpServletRequest request, HttpServletResponse response) {
//        BufferedOutputStream outputStream = null;
//        String file = request.getSession().getServletContext().getRealPath("/") + "WEB-INf\\upload\\1.txt";//文件下载路径
//        try {
//            InputStream is = new BufferedInputStream(new FileInputStream(new File(file)));//输入到内存
//          String str="下载.txt";
//         URLEncoder.encode(str,"UTF-8");//中文名下载时设置编码
//            response.addHeader("Content-Disposition", "attachment;filename=" + str);//设置文件下载头
//            //设置文件ContentType类型，这样设置，会自动判断下载文件类型
//            response.setContentType("multipart/form-data");
//              outputStream = new BufferedOutputStream(response.getOutputStream());//输出到浏览器
//            int length=0;
//            while ((length=is.read())!=-1){
//                outputStream.write(length);
//                outputStream.flush();
//            }
//            return "success";
//        } catch (Exception e) {
//            return "fail";
//        }finally {
//        try {
//            outputStream.close();
//        } catch ( Exception e) {
//            return "fail";
//        }
//    }


    }


}
