/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.photoDAO;
import dao.photoDAOImpl;
import java.io.File;
import social.facebook.FBConnection;
import java.io.IOException;
import static java.lang.System.out;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.photo;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class FbLogin extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private String code = "";

    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        code = req.getParameter("code");
        if (code.equals("img")) {
            String accessToken = req.getParameter("accessToken");
            String name = req.getParameter("name");
            String id = req.getParameter("id");
            String link = "http://www.localhost:8080/PTPMHDV/" + name;
            req.setAttribute("link", link);
            req.setAttribute("name", name);
            req.setAttribute("accessToken", accessToken);
            req.setAttribute("id", id);
            RequestDispatcher dispatcher = req.getRequestDispatcher("/newjsp.jsp");
            dispatcher.forward(req, res);
        } else if (code.equals("profile")) {
            String accessToken = req.getParameter("accessToken");
            req.setAttribute("accessToken", accessToken);
            RequestDispatcher dispatcher = req.getRequestDispatcher("/profile.jsp");
            dispatcher.forward(req, res);
        } else if (code.equals("trangchu")) {
            String accessToken = req.getParameter("accessToken");
            req.setAttribute("accessToken", accessToken);
            String mg = req.getParameter("mg");
            req.setAttribute("mg", mg);
            HttpSession session = req.getSession();
            photoDAO pAO = new photoDAOImpl();
            ArrayList<photo> photos = pAO.getAll();
            session.setAttribute("photos", photos);
            RequestDispatcher dispatcher = req.getRequestDispatcher("/home.jsp");
            dispatcher.forward(req, res);
        } else if (code.equals("delete")) {
            String accessToken = req.getParameter("accessToken");
            String link = req.getParameter("name");
            String namep = req.getParameter("namep");
            photoDAO pDAO = new photoDAOImpl();
            photo p = new photo("", link, "", namep);
            String mg = null;
            if (pDAO.delete(p) == 0) {
                mg = "Can't delete";
            } else {
                mg = "Delete success";
            }
            req.setAttribute("mg", mg);
            req.setAttribute("accessToken", accessToken);
            res.sendRedirect("FbLogin?code=trangchu&accessToken=" + accessToken + "&mg=" + mg);
        }else if(code.equals("out")){
            HttpSession session = req.getSession();
            String accessToken = req.getParameter("accessToken");
            req.removeAttribute("sesion");
            req.removeAttribute(code);
            req.removeAttribute(accessToken);
            RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
            dispatcher.forward(req, res);
        }else if(code.equals("user")){
            String accessToken = req.getParameter("accessToken");
            String id = req.getParameter("id");
            photoDAO pAO = new photoDAOImpl();
            ArrayList<photo> photos = pAO.getAllby(id);
            req.setAttribute("accessToken", accessToken);
            HttpSession session = req.getSession();
            session.setAttribute("photos", photos);
            RequestDispatcher dispatcher = req.getRequestDispatcher("/profileUser.jsp");
            dispatcher.forward(req, res);
        } else {
            if (code == null || code.equals("")) {
                throw new RuntimeException("ERROR: Didn't get code parameter in callback.");
            }
            FBConnection fbConnection = new FBConnection();
            String accessToken = fbConnection.getAccessToken(code);
            req.setAttribute("accessToken", accessToken);
            HttpSession session = req.getSession();
            photoDAO pAO = new photoDAOImpl();
            ArrayList<photo> photos = pAO.getAll();
            session.setAttribute("photos", photos);
            RequestDispatcher dispatcher = req.getRequestDispatcher("/home.jsp");
            dispatcher.forward(req, res);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        code = request.getParameter("code");
        if (code.equals("FileUploadServlet")) {
            //MultipartRequest re=  new MultipartRequest(request, "http://localhost:8080/PTPMHDV/img/");

            String link = null;
            String nameid = request.getParameter("chon");
            System.out.println(nameid);
            String accessToken = request.getParameter("accessToken");
            try {
                boolean isMultiPart = ServletFileUpload.isMultipartContent(request);
                if (!isMultiPart) {//get request để kiểm tra xem có phải multipart chúng ta mới xử lý

                } else {//Nếu là multipart chúng ta get toàn bộ dữ liệu và đưa thành List – items
                    FileItemFactory factory = new DiskFileItemFactory();
                    ServletFileUpload upload = new ServletFileUpload(factory);
                    List items = null;
                    try {
                        items = upload.parseRequest(request);
                    } catch (FileUploadException e) {
                        e.printStackTrace();
                    }
                    Iterator iter = items.iterator();
                    Hashtable params = new Hashtable();//để lấy các tham số được truyền qua control trên form ngoại trừ file
                    String filename = null;
                    while (iter.hasNext()) {
                        FileItem item = (FileItem) iter.next();
                        if (item.isFormField()) {
                            params.put(item.getFieldName(), item.getString());
                        } else {
                            try {//Khối màu xanh giúp chúng ta lấy được tên file, tạo đường dẫn và lưu vào thư mục images và 
                                //thực hiện ghi thành file
                                String itemName = item.getName();
                                filename = itemName.substring(itemName.lastIndexOf("\\") + 1);
                                String realPath = getServletContext().getRealPath("/") + "img\\" + filename;
                                link = "img/" + filename;
                                File savefile = new File(realPath);
                                item.write(savefile);
                                request.setAttribute("item", item);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }//end while 
                    String chude = (String) params.get("chon");
                    String namep = (String) params.get("firstname");

                    Date today = new Date(System.currentTimeMillis());
                    SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss dd/MM/yyyy");
                    String s = timeFormat.format(today.getTime());
                    photo p = new photo(s, link, chude, namep);
                    //photo p = new photo(link, chude,namep,s);
                    photoDAO photodao = new photoDAOImpl();
                    if (photodao.isExist(p)) {
                        String message = "This photo is exist ! Try again";
                        request.setAttribute("message", message);
                        request.setAttribute("accessToken", accessToken);
                        RequestDispatcher dispatcher = request.getRequestDispatcher("/home.jsp");
                        dispatcher.forward(request, response);
                    } else {
                        photodao.add(p);
                        String message = "Upload success!";
                        request.setAttribute("message", message);
                        request.setAttribute("link", link);
                        //request.setAttribute("filename", filename);
                        request.setAttribute("accessToken", accessToken);
                        response.sendRedirect("FbLogin?code=trangchu&accessToken=" + accessToken);
//                        RequestDispatcher dispatcher = request.getRequestDispatcher("/home.jsp");
//                        dispatcher.forward(request, response);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                out.close();
            }
        } else if(code.equals("chude")){
            String accessToken = request.getParameter("accessToken");
            request.setAttribute("accessToken", accessToken);
            request.setCharacterEncoding("ISO-8859-1");
            String name = request.getParameter("firstname");
            request.setAttribute("name", name);
            HttpSession session = request.getSession();
            photoDAO pAO = new photoDAOImpl();
            String chude = request.getParameter("chude");
            String con = null;
            ArrayList<photo> photos;
            if(chude.equals("friend")){
                con = "Báº¡n bÃ¨";
                photos = pAO.getAllbyname(name, con);
            }else if(chude.equals("job")){
                con = "CÃ´ng viá»?c";
                photos = pAO.getAllbyname(name, con);
            }else if (chude.equals("natual")){
                con = "ThiÃªn nhiÃªn";
                photos = pAO.getAllbyname(name, con);
            }else if(chude.equals("all")){
                photos = pAO.getAllby(name);
            }else{
                con = "Gia Ä?Ã¬nh";
                photos = pAO.getAllbyname(name, con);
            }
            session.setAttribute("photos", photos);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/family.jsp");
            dispatcher.forward(request, response);
        } else if (code.equals("seach")) {
            String str = request.getParameter("timkiem");
            String accessToken = request.getParameter("accessToken");
            request.setAttribute("accessToken", accessToken);
            HttpSession session = request.getSession();
            photoDAO pAO = new photoDAOImpl();
            ArrayList<photo> photos = pAO.seach(str);
            session.setAttribute("photos", photos);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/home.jsp");
            dispatcher.forward(request, response);
        }
    }

}
