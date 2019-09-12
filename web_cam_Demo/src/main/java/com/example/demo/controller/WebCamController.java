package com.example.demo.controller;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.ImageData;

@Controller
public class WebCamController {

	/*
	 * private static final String FILEPATH = "D:\\image\\myImage.jpg"; private File
	 * file = new File(FILEPATH);
	 */
	@GetMapping("/loadcam")
	public String dashboard() {

		return "camloader";
	}

	// @RequestMapping(value = "/senddata",method = RequestMethod.POST)
	@SuppressWarnings("deprecation")
	@PostMapping("/senddata")
	public String dashboardPost(HttpServletRequest req, HttpServletResponse res) {

		String image = req.getParameter("imagedata");
		String[] buffer = image.split(",");
		String imagestream = buffer[buffer.length - 1];
		// System.out.println(imagestream);

		try {

			BufferedImage buffimage = null;
			byte[] imageByte;
			imageByte = Base64.decodeBase64(imagestream);
			ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
			buffimage = ImageIO.read(bis);
			bis.close();

			// write the image to a file
			File outputfile = new File("D:\\image\\image.jpg");
			ImageIO.write(buffimage, "png", outputfile);
			System.out.println("Image saved");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "camloader";
	}

	@PostMapping("/senddata1")
	public String dashboardPost1(@RequestBody ImageData imageData) {
		System.out.println(imageData.getImagedata());
		return "Hello";

	}

	@GetMapping("/preview")
	public String dashboad() {

		return "preview";
	}

}
