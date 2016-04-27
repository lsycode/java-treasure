//reference:http://meigesir.iteye.com/blog/1539358
package IO;

/**
 * Created by lsy on 2016/4/27.
 */
public class Download {
//    @RequestMapping("file/download")
//    public void fileDownload(HttpServletResponse response){
//        //获取网站部署路径(通过ServletContext对象)，用于确定下载文件位置，从而实现下载
//        String path = servletContext.getRealPath("/");
//
//        //1.设置文件ContentType类型，这样设置，会自动判断下载文件类型
//        response.setContentType("multipart/form-data");
//        //2.设置文件头：最后一个参数是设置下载文件名(假如我们叫a.pdf)
//        response.setHeader("Content-Disposition", "attachment;fileName="+"a.pdf");
//        ServletOutputStream out;
//        //通过文件路径获得File对象(假如此路径中有一个download.pdf文件)
//        File file = new File(path + "download/" + "download.pdf");
//
//        try {
//            FileInputStream inputStream = new FileInputStream(file);
//
//            //3.通过response获取ServletOutputStream对象(out)
//            out = response.getOutputStream();
//
//            int b = 0;
//            byte[] buffer = new byte[512];
//            while (b != -1){
//                b = inputStream.read(buffer);
//                //4.写到输出流(out)中
//                out.write(buffer,0,b);
//            }
//            inputStream.close();
//            out.close();
//            out.flush();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
