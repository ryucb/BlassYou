package com.petmily.pet.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.petmily.pet.model.vo.Pet;
import com.petmily.pet.service.PetService;

/**
 * Servlet implementation class PetProfileServlet
 */
@WebServlet("/user/petprofile/uploadEnd")
public class PetProfileUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PetProfileUploadServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String id = (String)request.getAttribute("userId");
		
		String path = getServletContext().getRealPath("/upload/pet/");
		int maxSize=1024*1024*10;
		
		MultipartRequest mr = new MultipartRequest(request,path,maxSize,"UTF-8",new DefaultFileRenamePolicy());
		
		String userId = mr.getParameter("userId");
		String petName = mr.getParameter("pname");
		String petGender = mr.getParameter("gender");
		String petKind = mr.getParameter("ptype");
		String petWeight = mr.getParameter("weight");
		String petAge = mr.getParameter("pday");
		String petAffinity = mr.getParameter("friendly");
		String petNeutralization = mr.getParameter("neutral");
		String petDisease = mr.getParameter("ill");
		
		String petDiseaseTxt="";
		String petSeparationTxt="";
		String petUrineTxt="";
		String petIndoorTxt="";
		String petHowlingTxt = "";
		
		try {
			petDiseaseTxt = mr.getParameter("illexplanation");
			petSeparationTxt = mr.getParameter("aexplanation");
			petUrineTxt = mr.getParameter("mexplanation");
			petIndoorTxt = mr.getParameter("mmexplanation");
			petHowlingTxt = mr.getParameter("bexplanation");
		}catch(NullPointerException e) {
			petDiseaseTxt="";
			petSeparationTxt="";
			petUrineTxt="";
			petIndoorTxt="";
			petHowlingTxt = "";
		}
		
		String petSeparation = mr.getParameter("anxiety");
		
		String petUrine = mr.getParameter("menstruation");
		
		String petIndoor = mr.getParameter("mark");
		
		String petHowling = mr.getParameter("bark");
		
		
		String heartDisease = mr.getParameter("drug");
		String vaccine = mr.getParameter("inoculation");
		String corona = mr.getParameter("inoculation2");
		String kennel = mr.getParameter("inoculation3");
		String hospitalName = mr.getParameter("hospital");
		String hospitalPhone = mr.getParameter("hnum");
		String hospitalZip = mr.getParameter("postNum");
		String hospitalAddress = mr.getParameter("address");
		String detail = mr.getParameter("detail");
		String petImg = mr.getParameter("upload");
		String registration = mr.getParameter("enroll");
		
		
		
		Pet pet = new Pet(0,userId,petName,petGender,petKind,petWeight,petAge,
				petAffinity, petNeutralization,petDisease,petDiseaseTxt,petSeparation,
				petSeparationTxt,petUrine,petUrineTxt, petIndoor,petIndoorTxt,
				petHowling,petHowlingTxt,heartDisease,vaccine,corona,kennel,
				hospitalName,hospitalPhone,hospitalZip,hospitalAddress,detail,
				petImg,registration);
		
		
		int result = new PetService().petprofileinsert(pet,id);
		
		String msg = "";
		String loc = "";
		if(result>0) {
			msg = "펫프로필 등록 성공";
			loc="/user/petprofile";
		}else {
			msg = "펫프로필 등록 실패";
			loc="/user/petprofile";
		}
		
		request.setAttribute("msg", msg);
		request.setAttribute("loc", loc);

		request.getRequestDispatcher("/views/common/msg.jsp")
		.forward(request,response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
